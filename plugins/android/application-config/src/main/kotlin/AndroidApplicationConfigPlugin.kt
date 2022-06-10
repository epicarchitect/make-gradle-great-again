@file:Suppress("UnstableApiUsage", "unused")

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConfigPlugin : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        plugins.apply("com.android.application")
        plugins.apply("android-base-config")

        configure<BaseAppModuleExtension> {
            buildTypes {
                release {
                    isShrinkResources = true
                    isMinifyEnabled = true
                    proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
                }
            }
        }

        println("AndroidApplicationConfigPlugin applied for ${this.name}")
    }
}
