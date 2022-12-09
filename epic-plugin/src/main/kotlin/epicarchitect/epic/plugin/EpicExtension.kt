package epicarchitect.epic.plugin

import org.gradle.api.provider.Property

interface EpicExtension {
    val epicWord: Property<String>
}