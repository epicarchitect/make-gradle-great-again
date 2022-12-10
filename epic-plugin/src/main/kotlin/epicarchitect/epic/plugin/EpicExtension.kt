package epicarchitect.epic.plugin

import org.gradle.api.provider.Property

interface EpicExtension {
    val epicResourcesPath: Property<String>
}