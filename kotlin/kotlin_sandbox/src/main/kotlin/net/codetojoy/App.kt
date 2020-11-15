
package net.codetojoy

import java.io.*

fun main(args: Array<String>) {
    System.out.println("Hello, Kotlin.")
    System.out.println("version: " + Version().version)

    // ---------------------
    val sourcePath = "/Users/measter/src/github/codetojoy/easter_eggs_for_gradle/kotlin/kotlin_sandbox/resources/TemplateVersion.kt"
    val destPath = "/Users/measter/src/github/codetojoy/easter_eggs_for_gradle/kotlin/kotlin_sandbox/resources/GeneratedVersion.kt"

    val inputStream: InputStream = File(sourcePath).inputStream()
    val inputLines = mutableListOf<String>()

    val outputLines = mutableListOf<String>()

    inputStream.bufferedReader().forEachLine { inputLines.add(it) } 
    inputLines.forEach{
        val newLine = it.replace("__VERSION", "1.2.3")
        outputLines.add(newLine)
    }

    File(destPath).printWriter().use { out -> 
        outputLines.forEach { line ->
            out.println(line) 
        }
    }

    inputStream.close()

    System.out.println("Ready.")
}
