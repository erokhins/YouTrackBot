package org.jetbrains.youtrack.bot

import java.util.*

val file = "issues.xml"
val unassigned = "[Unassigned]"
val url = System.getenv("slack.url") ?: ""

val settings = System.getenv("slack.settings") ?: ""

data class Issue(
        val id: String,
        val created: Long,
        val subsystems: List<String>,
        val summary: String,
        val assignee: String
)

fun sendErrorToSlack(issue: Issue, message: String) {
    sendTextToSlack("${issue.render()}: $message (@stanislav.erokhin)")
}

fun main(args: Array<String>) {
    if (url.isEmpty() || settings.isEmpty()) {
        error("You should set url and settings")
    }

    val issues = parseIssues(file)
    val issuesByNik = HashMap<String, MutableSet<Issue>>()

    fun Issue.toNik(nik: String) {
        issuesByNik.getOrPut(nik) {
            HashSet()
        }.add(this)
    }

    for (issue in issues) {
        if (issue.assignee != unassigned) {
            val nik = nameToNik[issue.assignee]

            if (nik != null) {
                issue.toNik(nik)
            } else {
                sendErrorToSlack(issue, "Unknown name: ${issue.assignee}")
            }
        }
        else {
            val subsystems = issue.subsystems
            if (subsystems.isEmpty()) {
                issue.toNik(noSubsystemManager)
            }
            else {
                subsystems.forEach {
                    val nik = subsystemsManagers[it]
                    if (nik != null) {
                        issue.toNik(nik)
                    } else {
                        sendErrorToSlack(issue,"Unknown subsystem: $it")
                    }
                }
            }
        }
    }
    val sortedIssues = issuesByNik.entries.sortedByDescending { it.value.size }

    val result = StringBuilder()

    result.appendln("Всего submitted тикетов: ${issues.size}")
    result.appendln("Красным отмечены тикеты, которые созданы более ${IssueColor.RED.days} дней назад. Жирным -- более ${IssueColor.BOLD.days} дней.")
    for ((person, personIssues) in sortedIssues) {
        val messageForPerson = createMessageForPerson(person, personIssues) ?: continue
        result.appendln(messageForPerson)
    }

    sendTextToSlack(result.toString())
}
