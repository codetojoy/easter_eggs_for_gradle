
package net.codetojoy.util

import org.junit.*
import static org.junit.Assert.*

import org.gradle.api.*

class ProjectTypesTestCase {
    def projectTypes = new ProjectTypes()

    @Test(expected=GradleException.class)
    void testGetType_Null() {
        def input = null

        // test
        def result = projectTypes.getType(input)
    }

    @Test(expected=GradleException.class)
    void testGetType_Empty() {
        def input = ""

        // test
        def result = projectTypes.getType(input)
    }

    @Test(expected=GradleException.class)
    void testGetType_Bogus() {
        def input = "cobol"

        // test
        def result = projectTypes.getType(input)
    }

    @Test
    void testGetType_Java() {
        def input = "java"

        // test
        def result = projectTypes.getType(input)

        assert result == ProjectType.JAVA
    }
}
