plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.islandparadise14.integration"
    compileSdk = AppConfig.COMPILE_SDK

    defaultConfig {
        applicationId = "com.islandparadise14.integration"
        minSdk = AppConfig.MIN_SDK
        targetSdk = AppConfig.TARGET_SDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Library.COMPOSE_UI
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    api(project(path = ":Data:IntegrationData"))
    api(project(path = ":Presentation:BitcoinFeature"))
}