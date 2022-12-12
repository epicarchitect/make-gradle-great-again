package epicarchitect.epic.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.container
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.the
import java.io.File

class EpicPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val ext = target.extensions.create<EpicExtension>("myExt")
        target.afterEvaluate {
            configure<BaseExtension> {
                sourceSets.getByName("main") {
                    kotlin.srcDir(File(ext.epicDir.get().asFile, ext.epicCodePath.get()))
                    res.srcDir(File(ext.epicDir.get().asFile, ext.epicResourcesPath.get()))
                }
            }
        }
    }
}