package com.islandparadise14.designsystem.base.undercarriage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.Surface
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.NoRippleTheme

@Suppress("OPT_IN_IS_NOT_ENABLED")
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MLDSurface(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    isDisable: Boolean = false,
    shape: Shape = RoundedCornerShape(10.dp),
    backgroundColor: Color = MintsLabTheme.color.transparent,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalRippleTheme provides NoRippleTheme, // 버튼의 리플 이펙트 제거
        LocalMinimumTouchTargetEnforcement provides false, // touch 최소 범위 강제 해제
    ) {
        Surface(
            onClick = onClick,
            modifier = modifier,
            enabled = !isDisable,
            shape = shape,
            color = backgroundColor,
            contentColor = MintsLabTheme.color.transparent,
            border = border,
            elevation = 0.dp,
            interactionSource = interactionSource,
        ) {
            content()
        }
    }
}