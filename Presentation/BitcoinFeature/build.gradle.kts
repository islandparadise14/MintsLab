plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // dagger hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.islandparadise14.bitcoinfeature"
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
    api(project(path = ":Presentation:Base"))
    api(project(path = ":Domain:IntegrationDomain"))

    // dagger hilt
    implementation("com.google.dagger:hilt-android:${Library.DAGGER_HILT}")
    kapt("com.google.dagger:hilt-android-compiler:${Library.DAGGER_HILT}")

    // test 코드 실행시 reflect 필요
    implementation("org.jetbrains.kotlin:kotlin-reflect:${Library.KOTLIN_REFLECT}")

    // kotest
    //testImplementation("io.kotest:kotest-runner-junit5-jvm")
    testImplementation("io.kotest:kotest-runner-junit5:${Library.KOTEST}")
    testImplementation("io.kotest:kotest-assertions-core:${Library.KOTEST}")
    // coroutine test
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${Library.COROUTINE_TEST}")
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}