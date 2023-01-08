package com.islandparadise14.designsystem.base.atom

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation._12dp
import com.islandparadise14.designsystem.base.foundation._4dp

@Composable
fun MLDTextButton(
    text: String,
    modifier: Modifier = Modifier,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    isBig: Boolean = false,
    onClick: () -> Unit = {},
) {
    val buttonMinScaleValue = 0.9f
    val pressState = remember { mutableStateOf(false) }
    val isPressCanceled = remember { mutableStateOf(false) }

    val buttonScale = animateFloatAsState(
        targetValue = if (pressState.value) buttonMinScaleValue else 1f,
        visibilityThreshold = 0.002f
    ) {
        if (isPressCanceled.value) {
            pressState.value = false
            isPressCanceled.value = false
        }
    }

    val background = if (pressState.value)
        MintsLabTheme.color.pressTransparent
    else
        MintsLabTheme.color.transparent

    val textStyle = if (isBig) MintsLabTheme.typography.bodyMedium1 else MintsLabTheme.typography.bodyNormal2

    val textColor = if (isBig) MintsLabTheme.color.mainText else MintsLabTheme.color.subText

    val onTouchDown = {
        isPressCanceled.value = false
        pressState.value = true
    }
    val onTouchUpOrCancel = {
        if (buttonScale.value == buttonMinScaleValue) {
            pressState.value = false
        } else {
            isPressCanceled.value = true
        }
    }

    /** Content */
    MLDSurface(
        onClick = onClick,
        onTouchDown = onTouchDown,
        onTouchUpOrCancel = onTouchUpOrCancel,
        modifier = Modifier
            .then(modifier)
            .scale(buttonScale.value),
        backgroundColor = background,
    ) {
        Row(
            Modifier.padding(horizontal = _12dp, vertical = _12dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            leftIcon?.let {
                MLDIcon(
                    iconography = it,
                    contentDescription = null,
                    modifier = Modifier
                        .width(18.dp)
                        .height(18.dp)
                        .align(Alignment.CenterVertically),
                    tint = textColor
                )
                Spacer(_4dp)
            }
            MLDText(
                text = text,
                textStyle = textStyle,
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                tint = textColor
            )
            rightIcon?.let {
                Spacer(_4dp)
                MLDIcon(
                    iconography = it,
                    contentDescription = null,
                    modifier = Modifier
                        .width(18.dp)
                        .height(18.dp)
                        .align(Alignment.CenterVertically),
                    tint = textColor
                )
            }
        }
    }
}
