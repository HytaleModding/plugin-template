rootProject.name = "dev.hytalemodding"

plugins {
    // See documentation on https://scaffoldit.dev
    id("dev.scaffoldit") version "0.2.1"
}

//
// Automatically configures the builds, but you can switch scripts if you wish!
//
hytale {
    manifest {
        Group = "HytaleModding"
        Name = "ExamplePlugin"
        Main = "dev.hytalemodding.ExamplePlugin"
    }
}