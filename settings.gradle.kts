pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:7.0.0-alpha01")
            }
        }
    }
}
rootProject.name = "KMMApp"


include(":androidApp")
include(":shared")
include(":rovermaprendererframework")
project(":rovermaprendererframework").projectDir = file("androidApp/rovermaprendererAndroidv2/rovermaprendererframework/")

enableFeaturePreview("GRADLE_METADATA")
