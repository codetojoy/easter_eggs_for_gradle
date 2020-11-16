
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

val targetPackage = "net/codetojoy"
val targetJavaPackage = "net.codetojoy"

application {
    mainClass.set("${targetJavaPackage}.AppKt") 
}

val sourceFile = File(rootDir.absolutePath + "/resources/TemplateVersion.kt")
val propFile = File(rootDir.absolutePath + "/gradle.properties")
val destFile = File(rootDir.absolutePath + "/src/main/kotlin/${targetPackage}/Version.kt")

tasks.register("generateVersion") {
    inputs.file(sourceFile)
    inputs.file(propFile)
    outputs.file(destFile)

    doFirst {
        generateVersion()
    }
}

tasks.named("compileKotlin") {
    dependsOn("generateVersion") 
}

fun generateVersion() {
    val version: String by project
    val rootDir: File by project

    val inputStream: InputStream = sourceFile.inputStream()

    destFile.printWriter().use { out -> 
        inputStream.bufferedReader().forEachLine { inputLine ->
            val newLine = inputLine.replace("__VERSION", version)
            out.println(newLine) 
        }
    }

    inputStream.close()
}
