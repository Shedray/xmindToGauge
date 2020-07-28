package com.github.shedray.xmindtogauge.services

import com.intellij.openapi.project.Project
import com.github.shedray.xmindtogauge.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
