package com.islandparadise14.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.islandparadise14.designsystem.foundation.*
import com.islandparadise14.designsystem.foundation.LocalMintsLabTypography

@Composable
fun MintsLabTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    typography: MintsLabTypography = getMintsLabTypography(),
    lightColorPalette: SemanticColor = getMintsLabLightColor(),
    darkColorPalette: SemanticColor = getMintsLabDarkColor(),
    content: @Composable () -> Unit
) {
    val color = if (isDarkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }

    CompositionLocalProvider(
        LocalMintsLabTypography provides typography,
        LocalMintsLabColors provides color,
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
}