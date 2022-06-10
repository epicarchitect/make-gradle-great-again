plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

dependencies {
    implementation(":base-config")
    implementation(Dependencies.kotlinGradlePlugin)
    implementation(Dependencies.androidGradlePlugin)
}

gradlePlugin {
    plugins.register("android-library-config") {
        id = "android-library-config"
        implementationClass = "AndroidLibraryConfigPlugin"
    }
}