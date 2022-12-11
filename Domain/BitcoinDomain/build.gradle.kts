plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
    targetCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
}

dependencies {
    implementation("javax.inject:javax.inject:${Library.JAVAX_INJECT}")

    // coroutine
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Library.COROUTINE}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Library.COROUTINE}")
}