println("start script")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("epic-plugin") version "1.0"
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

    println("on Android")
    println(sourceSets.asMap.toString())
//    sourceSets.getByName("main").res.srcDir(File(projectDir, "src/epicdir/res"))
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
}

myExt {
    epicResourcesPath = "src/epicdir/res"
}

println("end script")
