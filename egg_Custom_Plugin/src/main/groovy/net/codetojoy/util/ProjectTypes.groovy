
package net.codetojoy.util

import org.gradle.api.GradleException

class ProjectTypes {

    ProjectType getType(String projectType) {
        def result

        def projectTypeOK = (projectType != null) && (!projectType.isEmpty())

        if (projectTypeOK) {
            def trimType = projectType.trim().toLowerCase()

            if ("java" == trimType) {
                result = ProjectType.JAVA
            } else if ("groovy" == trimType) {
                result = ProjectType.GROOVY
            } else {
                throw new GradleException("unknown ProjectType: " + projectType)
            }
        } else {
            throw new GradleException("unknown ProjectType: " + projectType)
        }

        return result
    }
}
