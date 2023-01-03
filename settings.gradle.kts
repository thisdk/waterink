pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "waterink"
include(":app")
include(":database")
include(":domain")
include(":core:datastore")
include(":core:cookie")
include(":core:okhttp")
include(":core:ktor")
include(":core:coil")