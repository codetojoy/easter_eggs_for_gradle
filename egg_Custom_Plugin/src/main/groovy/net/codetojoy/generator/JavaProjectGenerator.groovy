
package net.codetojoy.generator

import net.codetojoy.util.*

class JavaProjectGenerator {
    File destination
    def targetPackage 
    def targetPackageDir 

    def generate() {
        def fileUtil = new FileUtil()
        def constants = new Constants(targetPackage)
        def rootDir = destination.absolutePath

        // src/main
        
        def quickJava = "${rootDir}/src/main/java/${targetPackageDir}/Quick.java"
        fileUtil.writeFile(quickJava, constants.quickJavaContent)

        // src/test

        def quickTestJava = "${rootDir}/src/test/java/${targetPackageDir}/QuickTestCase.java"
        fileUtil.writeFile(quickTestJava, constants.quickTestJavaContent)

        // build.gradle

        def gradle = "${rootDir}/build.gradle"
        fileUtil.writeFile(gradle, constants.javaGradleContent)
    }
}
