plugins {
    id("android-library-config")
    id("android-compose-config")
    id("dependencies")
}

android {
    namespace = "kolmachikhin.alexander.somelib"
}

dependencies {
    implementation(Dependencies.composeMaterial)
}