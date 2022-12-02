plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.islandparadise14.designsystem"
    compileSdk = AppConfig.COMPILE_SDK

    defaultConfig {
        minSdk = AppConfig.MIN_SDK
        targetSdk = AppConfig.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

    api("androidx.core:core-ktx:${Library.ANDROID_CORE_KTX}")
    api("androidx.lifecycle:lifecycle-runtime-ktx:${Library.ANDROID_LIFECYCLE_KTX}")
    api("androidx.activity:activity-compose:${Library.ACTIVITY_COMPOSE}")
    api("androidx.compose.ui:ui:${Library.COMPOSE_UI}")
    api("androidx.compose.ui:ui-tooling-preview:${Library.COMPOSE_UI}")
    api("androidx.compose.material:material:${Library.COMPOSE_MATERIAL}")
    api("androidx.appcompat:appcompat:${Library.ANDROID_APPCOMPAT}")
    api("com.google.android.material:material:${Library.ANDROID_MATERIAL}")

    // Import the landscapist BOM (버전 통합관리)
    implementation("com.github.skydoves:landscapist-bom:${Library.LANDSCAPIST}")

    // Import landscapist libraries
    implementation("com.github.skydoves:landscapist-coil")
    // TODO 필요할때 추가
    // implementation("com.github.skydoves:landscapist-placeholder")
    // implementation("com.github.skydoves:landscapist-palette")
    // implementation("com.github.skydoves:landscapist-transformation")

    androidTestApi("androidx.compose.ui:ui-test-junit4:${Library.COMPOSE_UI}")
    debugApi("androidx.compose.ui:ui-tooling:${Library.COMPOSE_UI}")
    debugApi("androidx.compose.ui:ui-test-manifest:${Library.COMPOSE_UI}")
}