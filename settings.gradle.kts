pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "DaggerExperiment"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":feature:home:public")
include(":feature:home:impl")
include(":feature:merchant:public")
include(":feature:merchant:impl")
include(":libraries:network:public")
include(":libraries:network:impl")
