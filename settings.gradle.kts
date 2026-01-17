pluginManagement {
     repositories {
         gradlePluginPortal()
         mavenCentral()
         maven("https://mvn.ultradev.app/snapshots")
     }
}

rootProject.name = providers.gradleProperty("mod_name").getOrElse("HytaleMod")