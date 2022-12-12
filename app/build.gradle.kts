plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("epic-plugin")
}

android {
    namespace = "epicarchitect.makegradlegreatagain"
    compileSdk = 33

    defaultConfig {
        applicationId = "epicarchitect.makegradlegreatagain"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
}

myExt {
    epicDir.set(projectDir)
    epicResourcesPath.set("src/epicdir/res")
    epicCodePath.set("src/epicdir/kotlin")
}