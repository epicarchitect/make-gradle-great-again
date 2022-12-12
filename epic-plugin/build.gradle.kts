plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

group = "epicarchitect.epic.plugin"
version = "1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("com.android.tools.build:gradle:8.0.0-alpha09")
}

gradlePlugin {
    plugins {
        create("epic-plugin") {
            id = "epic-plugin"
            implementationClass = "epicarchitect.epic.plugin.EpicPlugin"
        }
    }
}