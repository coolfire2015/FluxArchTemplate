package com.github.coolfire2015.fluxarchtemplate.services

import com.github.coolfire2015.fluxarchtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
