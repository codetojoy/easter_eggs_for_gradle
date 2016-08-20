
package net.codetojoy.generator

import net.codetojoy.util.*

class GroovyProjectGenerator {
    File destination
    def targetPackage 
    def targetPackageDir 

    def generate() {
        def fileUtil = new FileUtil()
        def constants = new Constants(targetPackage)
        def rootDir = destination.absolutePath

        // src/main
        
        def quickGroovy = "${rootDir}/src/main/groovy/${targetPackageDir}/Quick.groovy"
        fileUtil.writeFile(quickGroovy, constants.quickGroovyContent)

        // src/test

        def quickTestGroovy = "${rootDir}/src/test/groovy/${targetPackageDir}/QuickTestCase.groovy"
        fileUtil.writeFile(quickTestGroovy, constants.quickTestGroovyContent)

        // build.gradle

        def gradle = "${rootDir}/build.gradle"
        fileUtil.writeFile(gradle, constants.groovyGradleContent)
    }
}
