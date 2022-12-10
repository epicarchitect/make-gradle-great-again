plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

group = "epicarchitect.epic.plugin"
version = "1.0"

dependencies {
    implementation("com.android.tools.build:gradle:7.3.1")
}

gradlePlugin {
    plugins {
        create("epic-plugin") {
            id = "epic-plugin"
            implementationClass = "epicarchitect.epic.plugin.EpicPlugin"
        }
    }
}