package com.islandparadise14.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import com.islandparadise14.designsystem.base.foundation.*

val brandColor = BaseColor.amber

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MintsLabTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    typography: MintsLabTypography = getMintsLabTypography(),
    colorTheme: BaseColorPalette = brandColor,
    content: @Composable () -> Unit
) {
    val color = if (isDarkTheme) {
        getMintsLabDarkColor(colorTheme)
    } else {
        getMintsLabLightColor(colorTheme)
    }

    val retouch = if (isDarkTheme) {
        getMintsLabDarkRetouch()
    } else {
        getMintsLabLightRetouch()
    }

    CompositionLocalProvider(
        LocalMintsLabTypography provides typography,
        LocalMintsLabColors provides color,
        LocalMintsLabRetouch provides retouch, // 채도 명도 조절
        content = content
    )
}

object MintsLabTheme {
    val typography: MintsLabTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalMintsLabTypography.current

    val color: SemanticColor
        @Composable
        @ReadOnlyComposable
        get() = LocalMintsLabColors.current

    val retouch: Retouch
        @Composable
        @ReadOnlyComposable
        get() = LocalMintsLabRetouch.current
}

object NoRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = Color.Unspecified

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(
        0.0f,
        0.0f,
        0.0f,
        0.0f)
}