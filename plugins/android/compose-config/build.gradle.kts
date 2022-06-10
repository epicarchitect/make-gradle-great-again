plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

dependencies {
    implementation(":dependencies")
    implementation(Dependencies.kotlinGradlePlugin)
    implementation(Dependencies.androidGradlePlugin)
}

gradlePlugin {
    plugins.register("android-compose-config") {
        id = "android-compose-config"
        implementationClass = "AndroidComposeConfigPlugin"
    }
}