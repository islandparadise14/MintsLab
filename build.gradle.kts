// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Setting.ANDROID_GRADLE_PLUGIN}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Setting.KOTLIN_GRADLE_PLUGIN}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

plugins {
    id("com.google.dagger.hilt.android") version Setting.DAGGER_HILT_PLUGIN apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}