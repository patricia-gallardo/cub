package no.patricia.cub.services

import no.patricia.cub.CubBundle

class CubApplicationService {

    init {
        println(CubBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
