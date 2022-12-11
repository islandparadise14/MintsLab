package com.islandparadise14.designsystem.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

fun getMintsLabLightColor() = SemanticColor(
    background = BaseColor.grayScale.white // background 는 예외적으로 colors.xml 도 같이 관리 (Theme 관련)
)

fun getMintsLabDarkColor() = SemanticColor(
    background = BaseColor.grayScale.gray900 // background 는 예외적으로 colors.xml 도 같이 관리 (Theme 관련)
)

val LocalMintsLabColors = staticCompositionLocalOf {
    SemanticColor(
        background = Color.Unspecified
    )
}

@Immutable
data class SemanticColor(
    val background: Color
)