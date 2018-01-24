package org.jetbrains.youtrack.bot

import java.util.concurrent.TimeUnit


enum class IssueColor(val mark: String, val days: Int) {
    NORMAL("", 0),
    BOLD("*", 5),
    RED("`", 30);
}

private val currentTime = System.currentTimeMillis()

private val Issue.color: IssueColor get() {
    val days = TimeUnit.MILLISECONDS.toDays(currentTime - created)

    return when {
        days <= IssueColor.BOLD.days -> IssueColor.NORMAL
        days <= IssueColor.RED.days -> IssueColor.BOLD
        else -> IssueColor.RED
    }
}

fun Issue.render() = "${color.mark}<https://youtrack.jetbrains.com/issue/$id|$id>${color.mark}"

fun createMessageForPerson(nik: String, issues: Set<Issue>): String? {
    @Suppress("NAME_SHADOWING")
    val issues = issues.sortedBy { it.created }
    if (issues.first().color == IssueColor.NORMAL && issues.size < 3) {
        return null
    }

    val rendered = issues.joinToString(limit = 8) { it.render() }

    return "$nik (${issues.size}): $rendered"
}