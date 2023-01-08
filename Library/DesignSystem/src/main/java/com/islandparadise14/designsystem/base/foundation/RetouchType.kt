package com.islandparadise14.designsystem.base.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

fun getMintsLabLightRetouch() = Retouch()

fun getMintsLabDarkRetouch() = Retouch(
    mainButtonDisable = RetouchValue(RetouchType.Value, -0.3f),
    subButtonDisable = RetouchValue(RetouchType.Value, -0.5f),
    grayButtonDisable = RetouchValue(RetouchType.Value, -0.1f),

    solidPressed = RetouchValue(RetouchType.Value, -0.1f)
)

val LocalMintsLabRetouch = staticCompositionLocalOf {
    Retouch()
}

/** Preview 를 위해서 Light 모드를 Default 값으로 */
@Immutable
data class Retouch(
    val mainButtonDisable: RetouchValue = RetouchValue(RetouchType.Saturate, -0.65f),
    val subButtonDisable: RetouchValue = RetouchValue(RetouchType.Saturate, -0.2f),
    val grayButtonDisable: RetouchValue = RetouchValue(RetouchType.Value, -0.05f),

    val solidPressed: RetouchValue = RetouchValue(RetouchType.Value, -0.1f)
)

@Immutable
data class RetouchValue(
    val retouchType: RetouchType,
    val value: Float
)

enum class RetouchType {
    Saturate, Value
}