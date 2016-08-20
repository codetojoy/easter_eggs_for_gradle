
package net.codetojoy

import net.codetojoy.generator.*
import net.codetojoy.util.*

import org.gradle.api.*
import org.gradle.api.tasks.TaskAction

class ScaffoldingTask extends DefaultTask {

    def destination
    def projectType 
    def targetPackage

    def getProjectType() {
        return new ProjectTypes().getType(projectType)
    }

    def getDestination() {
        project.file(destination)
    }

    def getTargetPackageDir() {
        targetPackage.replaceAll(/\./, File.separator)
    }

    @TaskAction
    def generate() {
        def type = getProjectType()
        def dest = getDestination()
        def targetPackageDir = getTargetPackageDir()

        def generator = null

        if (type == ProjectType.JAVA) {
            generator = new JavaProjectGenerator(destination: dest,
                                                 targetPackage: targetPackage,
                                                 targetPackageDir: targetPackageDir)
        } else if (type == ProjectType.GROOVY) {
            generator = new GroovyProjectGenerator(destination: dest,
                                                 targetPackage: targetPackage,
                                                 targetPackageDir: targetPackageDir)
        }

        generator?.generate()
    }
}
