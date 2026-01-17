plugins {
    java
    id("app.ultradev.hytalegradle") version "1.5.3"
    id("com.gradleup.shadow") version "9.3.1"
    id("net.kyori.blossom") version "2.2.0"
}

group = "dev.hytalemodding"
version = "0.0.1"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.0.2-1")
}

hytale {
    patchline = "release"
    allowOp = true
}

sourceSets {
    main {
        blossom {
            resources {
                property("version", project.version.toString())
                property("name", project.name.toString())
                property("group", project.group.toString())
            }
        }
    }
}