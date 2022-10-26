package no.patricia.cub.services

import com.intellij.openapi.project.Project
import no.patricia.cub.CubBundle

class CubProjectService(project: Project) {

    init {
        println(CubBundle.message("projectService", project.name))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
