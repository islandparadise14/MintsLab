plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // dagger hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.islandparadise14.integrationdata"
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
    api(project(path = ":Domain:IntegrationDomain"))

    implementation("androidx.core:core-ktx:${Library.ANDROID_CORE_KTX}")

    // dagger hilt
    implementation("com.google.dagger:hilt-android:${Library.DAGGER_HILT}")
    kapt("com.google.dagger:hilt-android-compiler:${Library.DAGGER_HILT}")

    // TODO api("androidx.room:room-ktx:2.4.3") 룸 적용시 같이 해보자
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}