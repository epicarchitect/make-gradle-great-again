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
    plugins.register("android-application-config") {
        id = "android-application-config"
        implementationClass = "AndroidApplicationConfigPlugin"
    }
}