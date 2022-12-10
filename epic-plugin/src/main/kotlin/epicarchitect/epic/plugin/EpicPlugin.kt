package epicarchitect.epic.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import java.io.File

class EpicPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val ext = target.extensions.create<EpicExtension>("myExt")

        target.afterEvaluate {
            target.configure<BaseExtension> {
                setEpicSourceSet(target.projectDir, ext.epicResourcesPath.get())
            }
        }

//        target.tasks.register("generation") {
//            description = "generation!!!"
//            doFirst {
//                target.configure<BaseExtension> {
//                    setEpicSourceSet(target.projectDir, ext.epicResourcesPath.get())
//                    println("generated")
//                }
//            }
//        }
//
//        target.afterEvaluate {
//            tasks.
//        }
    }

    private fun BaseExtension.setEpicSourceSet(dir: File, path: String) {
        sourceSets.getByName("main") {
            res.srcDir(File(dir, path))
        }
    }
}