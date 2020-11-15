
import java.io.*

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10" 

    application 
}

repositories {
    jcenter() 
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) 
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") 

    testImplementation("org.jetbrains.kotlin:kotlin-test") 
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit") 
}

application {
    mainClass.set("net.codetojoy.AppKt") 
}

tasks.named("compileKotlin") {
    doFirst {
        generateVersion()
    }
}

fun generateVersion() {
    val version: String by project
    val rootDir: File by project

    val sourcePath = rootDir.absolutePath + "/resources/TemplateVersion.kt"
    val destPath = rootDir.absolutePath + "/src/main/kotlin/net/codetojoy/Version.kt"

    val inputStream: InputStream = File(sourcePath).inputStream()

    File(destPath).printWriter().use { out -> 
        inputStream.bufferedReader().forEachLine { inputLine ->
            val newLine = inputLine.replace("__VERSION", version)
            out.println(newLine) 
        }
    }

    inputStream.close()
}
