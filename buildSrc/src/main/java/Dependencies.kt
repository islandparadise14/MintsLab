object Setting {
    const val ANDROID_GRADLE_PLUGIN = "7.3.1"
    const val KOTLIN_GRADLE_PLUGIN = "1.6.10"
    const val DAGGER_HILT_PLUGIN = Library.DAGGER_HILT
}

object Library {
    const val ANDROID_CORE_KTX = "1.9.0"
    const val ANDROID_LIFECYCLE_KTX = "2.5.1"
    const val ANDROID_APPCOMPAT = "1.5.1"
    const val ANDROID_MATERIAL = "1.7.0"

    const val ACTIVITY_COMPOSE = "1.6.1"
    const val COMPOSE_UI = "1.1.1"
    const val COMPOSE_MATERIAL = "1.3.1"

    // WorkManager, NavigationFragment 같이 JetPack 과 같이 hilt 를 쓰고 싶다면 참고
    // https://developer.android.com/training/dependency-injection/hilt-jetpack
    const val DAGGER_HILT = "2.44"

    const val JAVAX_INJECT = "1"

    const val GSON = "2.10"

    const val RETROFIT = "2.9.0"
    const val OKHTTP3 = "4.9.2"

    const val ROOM = "2.4.3"

    const val COROUTINE = "1.6.4"

    const val LANDSCAPIST = "2.1.0"
}