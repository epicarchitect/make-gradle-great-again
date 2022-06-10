@file:Suppress("UnstableApiUsage", "unused", "MemberVisibilityCanBePrivate")

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("DependenciesPlugin applied for ${project.name}")
    }
}

object Dependencies {
    object Versions  {
        const val kotlin = "1.6.10"
        const val compose = "1.1.1"
        const val androidGradlePlugin = "7.2.1"
        const val coreKtx = "1.8.0"
        const val activityCompose = "1.4.0"
    }

    const val minSdk = 26
    const val targetSdk = 32
    const val compileSdk = targetSdk

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"

}
