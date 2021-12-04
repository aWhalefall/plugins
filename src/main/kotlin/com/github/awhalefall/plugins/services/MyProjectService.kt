package com.github.awhalefall.plugins.services

import com.intellij.openapi.project.Project
import com.github.awhalefall.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
