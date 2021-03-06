package com.github.ksoichiro.build.info

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildInfoPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        target.extensions.create(BuildInfoExtension.NAME, BuildInfoExtension)
        target.tasks.create(GenerateBuildInfoTask.NAME, GenerateBuildInfoTask)
    }
}
