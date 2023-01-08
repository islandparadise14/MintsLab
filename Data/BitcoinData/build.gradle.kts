plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // dagger hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.islandparadise14.bitcoindata"
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
        freeCompilerArgs = listOf(*kotlinOptions.freeCompilerArgs.toTypedArray(), "-Xjvm-default=all")
    }
}

dependencies {

    api(project(":Domain:BitcoinDomain"))
    implementation("androidx.core:core-ktx:${Library.ANDROID_CORE_KTX}")

    // dagger hilt
    implementation("com.google.dagger:hilt-android:${Library.DAGGER_HILT}")
    kapt("com.google.dagger:hilt-android-compiler:${Library.DAGGER_HILT}")

    // gson
    implementation("com.google.code.gson:gson:${Library.GSON}")

    // retrofit2 & okhttp3
    implementation("com.squareup.retrofit2:retrofit:${Library.RETROFIT}")
    implementation("com.squareup.retrofit2:converter-gson:${Library.RETROFIT}")
    implementation("com.squareup.okhttp3:okhttp:${Library.OKHTTP3}")
    implementation("com.squareup.okhttp3:logging-interceptor:${Library.OKHTTP3}")

    // room
    implementation("androidx.room:room-runtime:${Library.ROOM}")
    annotationProcessor("androidx.room:room-compiler:${Library.ROOM}")
    kapt("androidx.room:room-compiler:${Library.ROOM}") // To use Kotlin annotation processing tool (kapt)
    // TODO hilt 가 KSP 를 지원하면 같이 교체해보자
    // https://jisungbin.medium.com/kapt-%EB%8C%80%EC%8B%A0%EC%97%90-ksp-%EC%9D%B4%EC%9A%A9%ED%95%B4%EB%B3%B4%EA%B8%B0-e9d93723009c
    // ksp("androidx.room:room-compiler:${Library.ROOM}") // To use Kotlin Symbol Processing (KSP)
    implementation("androidx.room:room-ktx:${Library.ROOM}") // Kotlin Extensions and Coroutines support for Room
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}