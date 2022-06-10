@file:Suppress("UnstableApiUsage", "unused")

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidComposeConfigPlugin : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        configure<BaseExtension> {
            buildFeatures.compose = true
            composeOptions.kotlinCompilerExtensionVersion = Dependencies.Versions.compose
        }

        println("AndroidComposeConfigPlugin applied for ${this.name}")
    }
}
