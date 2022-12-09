package epicarchitect.epic.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class EpicPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val ext = target.extensions.create<EpicExtension>("myExt")
        target.task("hello") {
            doFirst {
                println(ext.epicWord.get())
            }
        }

        target.tasks.named("preBuild") {
            dependsOn("hello")
        }
    }
}