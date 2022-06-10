plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "DependenciesPlugin"
    }
}