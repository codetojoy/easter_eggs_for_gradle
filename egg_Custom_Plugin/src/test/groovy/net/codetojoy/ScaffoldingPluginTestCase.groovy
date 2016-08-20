
package net.codetojoy

import org.junit.*
import static org.junit.Assert.*

import org.gradle.api.*
import org.gradle.testfixtures.ProjectBuilder

import net.codetojoy.util.*

class ScaffoldingPluginTest {
    def task

    @Before
    public void setUp() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply "net.codetojoy.scaffolding"
        task = project.tasks.findByName("scaffolding")
    }

    @Test
    public void scaffoldingPlugin_Basic() {
        assertNotNull task
    }

    @Test
    public void scaffoldingPlugin_ProjectTypeJava() {
        task.projectType = "java"

        // test
        def result = task.getProjectType()

        assertEquals(ProjectType.JAVA, result)
    }

    @Test
    public void scaffoldingPlugin_ProjectTypeGroovy() {
        task.projectType = "groovy"

        // test
        def result = task.getProjectType()

        assertEquals(ProjectType.GROOVY, result)
    }

    @Test
    public void scaffoldingPlugin_TargetPackageDirBasic() {
        task.targetPackage = "net.codetojoy"

        // test
        def result = task.getTargetPackageDir()

        assertEquals("net${File.separator}codetojoy" as String, result)
    }

    @Test
    public void scaffoldingPlugin_DestinationBasic() {
        task.destination = "/tmp/foobar"

        // test
        def result = task.getDestination().absolutePath

        assertEquals("/tmp/foobar", result)
    }
}
