import org.gradle.api.JavaVersion

object AppConfig {
    const val COMPILE_SDK = 33
    const val MIN_SDK = 23
    const val TARGET_SDK = 33

    const val KOTLIN_JVM_TARGET_VERSION = "11"
    val COMPILE_OPTION_JAVA_VERSION = JavaVersion.VERSION_11
}