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
            target.setEpicSourceSet()
            println(ext.epicWord.get())
        }
    }

    private fun Project.setEpicSourceSet() {
        configure<BaseExtension> {
            sourceSets.getByName("main") {
                res.srcDir(File(projectDir, "src/epicdir/res"))
            }
        }
    }
}