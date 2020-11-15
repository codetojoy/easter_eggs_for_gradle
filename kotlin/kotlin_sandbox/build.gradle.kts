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
