@file:Suppress("unused")

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidBaseConfigPlugin : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        plugins.apply("org.jetbrains.kotlin.android")

        configure<BaseExtension> {
            compileSdkVersion(Dependencies.compileSdk)

            defaultConfig {
                minSdk = Dependencies.minSdk
                targetSdk = Dependencies.targetSdk
            }
        }

        println("AndroidBaseConfigPlugin applied for ${this.name}")
    }
}