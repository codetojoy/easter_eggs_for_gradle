
package net.codetojoy

import org.gradle.api.Plugin
import org.gradle.api.Project

public class ScaffoldingPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("scaffolding", ScaffoldingTask.class)
    }
}
