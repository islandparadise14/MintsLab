package com.islandparadise14.designsystem.base.atom

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.Iconography
import com.islandparadise14.designsystem.base.foundation._4dp
import com.islandparadise14.designsystem.base.foundation._8dp
import com.islandparadise14.designsystem.base.foundation.iconography.IconCheck
import com.islandparadise14.designsystem.base.foundation.value.IconSize
import com.islandparadise14.designsystem.base.undercarriage.MLDSurface

@Composable
fun MLDIconButton(
    modifier: Modifier = Modifier,
    iconography: ImageVector,
    contentDescription: String?,
    text: String? = null,
    isActive: Boolean = true,
    isHighLight: Boolean = false,
    onClick: () -> Unit = {},
) {
    val buttonMinScaleValue = 0.95f
    val pressState = remember { mutableStateOf(false) }
    val isPressCanceled = remember { mutableStateOf(false) }

    val buttonScale = animateFloatAsState(
        targetValue = if (pressState.value) buttonMinScaleValue else 1f,
        visibilityThreshold = 0.005f
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

    val tintColor = if (isHighLight)
        MintsLabTheme.color.selectedIcon
    else if (isActive)
        MintsLabTheme.color.normalIcon
    else
        MintsLabTheme.color.disableIcon

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

    MLDSurface(
        onClick = onClick,
        onTouchDown = onTouchDown,
        onTouchUpOrCancel = onTouchUpOrCancel,
        modifier = Modifier
            .then(modifier)
            .scale(buttonScale.value),
        backgroundColor = background,
    ) {
        Column {
            val iconModifier = if (text.isNullOrEmpty()) {
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(all = _8dp)
            } else {
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = _8dp, start = _8dp, end = _8dp, bottom = _4dp)
            }

            MLDIcon(
                modifier = iconModifier,
                iconography = iconography,
                contentDescription = contentDescription,
                iconSize = IconSize.Origin,
                tint = tintColor,
            )

            if (!text.isNullOrEmpty()) {
                MLDText(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = _8dp, end = _8dp, bottom = _4dp),
                    text = text,
                    textStyle = MintsLabTheme.typography.detail3,
                    maxLines = 2,
                    tint = tintColor,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMLDIconButton() {
    MLDIconButton(
        iconography = Iconography.IconCheck,
        contentDescription = null,
        text = "확인"
    )
}