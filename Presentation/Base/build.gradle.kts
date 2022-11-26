plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.islandparadise14.common"
    compileSdk = AppConfig.COMPILE_SDK

    defaultConfig {
        minSdk = AppConfig.MIN_SDK
        targetSdk = AppConfig.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
        targetCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = AppConfig.KOTLIN_JVM_TARGET_VERSION
    }
}

dependencies {
    api(project(path = ":Library:DesignSystem"))
}