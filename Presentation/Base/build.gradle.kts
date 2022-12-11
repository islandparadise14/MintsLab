plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // dagger hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Library.COMPOSE_UI
    }
}

dependencies {
    api(project(path = ":Library:DesignSystem"))

    // dagger hilt
    implementation("com.google.dagger:hilt-android:${Library.DAGGER_HILT}")
    kapt("com.google.dagger:hilt-android-compiler:${Library.DAGGER_HILT}")

    // ktx
    api("androidx.activity:activity-ktx:1.6.1")
    api("androidx.fragment:fragment-ktx:1.5.4")
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1") // lifecycleScope
    api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1") // viewModelScope
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}