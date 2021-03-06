package com.github.aaronfeledy.landointellijplugin.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.aaronfeledy.landointellijplugin.services.LandoProjectService

internal class LandoManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<LandoProjectService>()
    }
}
