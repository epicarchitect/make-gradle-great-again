package epicarchitect.epic.plugin

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property

interface EpicExtension {
    val epicResourcesPath: Property<String>
    val epicCodePath: Property<String>
    val epicDir: RegularFileProperty
}