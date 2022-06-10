@file:Suppress("UnstableApiUsage", "unused")

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConfigPlugin : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        plugins.apply("com.android.library")
        plugins.apply("android-base-config")

        configure<LibraryExtension> {
            buildTypes {
                release {
                    isMinifyEnabled = true
                    proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
                }
            }
        }

        println("AndroidLibraryConfigPlugin applied for ${this.name}")
    }
}
