plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

group = "epicarchitect.epic.plugin"
version = "1.0"

gradlePlugin {
    plugins {
        create("epic-plugin") {
            id = "epic-plugin"
            implementationClass = "epicarchitect.epic.plugin.EpicPlugin"
        }
    }
}