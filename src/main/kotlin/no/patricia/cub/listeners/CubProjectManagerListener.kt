package no.patricia.cub.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import no.patricia.cub.services.CubProjectService

internal class CubProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<CubProjectService>()

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
