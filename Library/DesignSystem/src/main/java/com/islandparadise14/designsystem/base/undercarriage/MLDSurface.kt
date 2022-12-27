package com.islandparadise14.designsystem.base.undercarriage

import android.view.MotionEvent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.Surface
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.NoRippleTheme

@Suppress("OPT_IN_IS_NOT_ENABLED")
@OptIn(ExperimentalMaterialApi::class, ExperimentalComposeUiApi::class)
@Composable
fun MLDSurface(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    onTouchDown: () -> Unit = {},
    onTouchUpOrCancel: () -> Unit = {},
    isDisable: Boolean = false,
    isRound: Boolean = true,
    backgroundColor: Color = MintsLabTheme.color.transparent,
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) {
    val shape: Shape = if (isRound) RoundedCornerShape(10.dp) else RectangleShape

    CompositionLocalProvider(
        LocalRippleTheme provides NoRippleTheme, // 버튼의 리플 이펙트 제거
        LocalMinimumTouchTargetEnforcement provides false, // touch 최소 범위 강제 해제
    ) {
        Surface(
            onClick = {},
            modifier = Modifier.then(modifier)
                .pointerInteropFilter {
                    when (it.action) {
                        MotionEvent.ACTION_DOWN -> {
                            onTouchDown()
                            true
                        }
                        MotionEvent.ACTION_MOVE -> {
                            true
                        }
                        MotionEvent.ACTION_CANCEL -> {
                            onTouchUpOrCancel()
                            true
                        }
                        MotionEvent.ACTION_UP -> {
                            onTouchUpOrCancel()
                            if (!isDisable) {
                                onClick()
                            }
                            true
                        }
                        else -> false
                    }
                },
            enabled = !isDisable,
            shape = shape,
            color = backgroundColor,
            contentColor = MintsLabTheme.color.transparent,
            border = border,
            elevation = 0.dp,
        ) {
            content()
        }
    }
}