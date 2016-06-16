package org.jetbrains.youtrack.bot

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.URL
import javax.net.ssl.HttpsURLConnection


fun sendTextToSlack(text: String) {
    sendJsonToSlack(
            """{
            "username": "YouTrack Bot",
            "icon_emoji": ":youtrack:",
            "text": "$text",
            "mrkdwn": true,
            $settings
            }""")
}

private fun sendJsonToSlack(json: String) {
    val con = URL(url).openConnection() as HttpsURLConnection
    con.requestMethod = "POST"
    con.setRequestProperty("Content-type", "application/json")

    // Send post request
    con.doOutput = true
    val wr = BufferedWriter(OutputStreamWriter(con.outputStream, "UTF-8"))
    try {
        wr.write(json)
        wr.flush()
    } finally {
        wr.close()
    }

    val responseCode = con.responseCode

    println()
    println("Debug info:")
    println("Post data: " + json)
    println("Response Code : " + responseCode)

    val output = if (responseCode == 200) con.inputStream else con.errorStream
    val outputReader = BufferedReader(InputStreamReader(output))

    while (true) {
        println(outputReader.readLine() ?: break)
    }
    outputReader.close()
}