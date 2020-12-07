buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven(url = "https://dl.bintray.com/icerockdev/moko")
        maven(url = "https://dl.bintray.com/icerockdev/plugins")


    }

    val kotlinVersion: String by project
    val sqlDelightVersion: String by project
    val buildToolsVersion: String by project

    dependencies {
        classpath("com.android.tools.build:gradle:$buildToolsVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
        classpath("dev.icerock.moko:resources-generator:0.13.1")
        classpath("co.touchlab:kotlinnativecocoapods:0.12")
    }
}

group = "com.jetbrains.handson"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://dl.bintray.com/ekito/koin")
        maven(url = "https://kotlin.bintray.com/kotlinx/")
        maven(url = "https://dl.bintray.com/icerockdev/moko")
        maven(url = "https://dl.bintray.com/touchlabpublic/kotlin")
    }
}
