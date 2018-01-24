package org.jetbrains.youtrack.bot

import org.w3c.dom.Element
import org.w3c.dom.NodeList
import java.io.File
import java.util.*
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


operator fun NodeList.get(i: Int) = item(i)

fun Element.children(tagName: String) = getElementsByTagName(tagName).let { list -> (1..list.length).map { i -> list[i - 1] } }


class IssueParser {
    private val allParsers = HashMap<String, FieldParser<*>>()

    private val created by field("created", "0")

    private val summary by field("summary", "")
    private val assignee by fieldAttribute("Assignee", "fullName", unassigned)

    private val subsystems by FieldParser<List<String>>("Subsystems", {
        it.children("value").map { it.textContent }
    }, emptyList())

    private fun field(name: String, default: String) = FieldParser(name, {
        (it.children("value").first() as? Element)?.textContent
    }, default)

    private fun fieldAttribute(name: String, attribute: String, default: String) = FieldParser(name, {
        (it.children("value").first() as? Element)?.getAttribute(attribute)
    }, default)

    private inner class FieldParser<F : Any>(
            name: String,
            private val parseField: (Element) -> F?,
            private val default: F
    ) : ReadOnlyProperty<IssueParser, F> {
        var currentValue: F? = null

        init { allParsers[name] = this }

        override fun getValue(thisRef: IssueParser, property: KProperty<*>): F = currentValue ?: default

        fun putField(field: Element) {
            currentValue = parseField(field)
        }
    }

    private fun resetValues() {
        for (parser in allParsers.values) {
            parser.currentValue = null
        }
    }

    private fun doParse(issue: Element) {
        for (field in issue.children("field")) {
            field as? Element ?: continue

            val fieldName = field.getAttribute("name")
            allParsers[fieldName]?.putField(field)
        }
    }

    fun parse(issue: Element): Issue {
        resetValues()
        doParse(issue)

        val id = issue.getAttribute("id")
        return Issue(id, created.toLong(), subsystems, summary, assignee)
    }
}

fun parseIssues(filename: String): List<Issue> {
    val factory = DocumentBuilderFactory.newInstance()
    factory.isValidating = false
    factory.isIgnoringElementContentWhitespace = true
    val builder = factory.newDocumentBuilder()
    val file = File(filename).apply { if (!exists()) error("File does not exist: $this") }
    val doc = builder.parse(file)

    val result = ArrayList<Issue>()
    val issueParser = IssueParser()

    for (issue in (doc.getElementsByTagName("issues")[0] as Element).children("issue")) {
        issue as? Element ?: continue
        result.add(issueParser.parse(issue))
    }
    return result
}