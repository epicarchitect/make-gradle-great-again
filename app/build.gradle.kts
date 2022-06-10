plugins {
    id("android-application-config")
    id("android-compose-config")
    id("dependencies")
}

android {
    namespace = "kolmachikhin.alexander.makegradlegreatagain"

    defaultConfig {
        applicationId = "kolmachikhin.alexander.makegradlegreatagain"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":some-lib"))
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.composeMaterial)
}