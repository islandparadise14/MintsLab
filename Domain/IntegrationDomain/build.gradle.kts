plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
    targetCompatibility = AppConfig.COMPILE_OPTION_JAVA_VERSION
}