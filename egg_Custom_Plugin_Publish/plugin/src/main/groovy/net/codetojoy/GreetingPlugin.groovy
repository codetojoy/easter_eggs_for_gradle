
package net.codetojoy

import org.gradle.api.Plugin
import org.gradle.api.Project

public class GreetingPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        def version = "v 1.0.1 DEC 2019"
        println "TRACER ${version} hello from GreetingPlugin"
    }
}
