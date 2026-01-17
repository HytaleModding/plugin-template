pluginManagement {
     repositories {
         gradlePluginPortal()
         mavenCentral()
     }
}

rootProject.name = providers.gradleProperty("mod_name").getOrElse("HytaleMod")