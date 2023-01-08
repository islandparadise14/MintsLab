package com.islandparadise14.designsystem.base.atom

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
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
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.Iconography
import com.islandparadise14.designsystem.base.foundation._4dp
import com.islandparadise14.designsystem.base.foundation._8dp
import com.islandparadise14.designsystem.base.foundation.iconography.IconCheck
import com.islandparadise14.designsystem.base.foundation.value.IconSize
import com.islandparadise14.designsystem.base.undercarriage.IconButtonListener

@Composable
fun MLDIconButton(
    iconButtonListener: IconButtonListener,
    modifier: Modifier = Modifier,
    text: String? = null,
    isActive: Boolean = true,
    isHighLight: Boolean = false,
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

    /** Content */
    MLDSurface(
        onClick = iconButtonListener.onClickIcon,
        onTouchDown = onTouchDown,
        onTouchUpOrCancel = onTouchUpOrCancel,
        modifier = Modifier
            .then(modifier)
            .scale(buttonScale.value),
        backgroundColor = background,
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            MLDIcon(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = _8dp, start = _8dp, end = _8dp, bottom = _4dp),
                iconography = iconButtonListener.iconography,
                contentDescription = iconButtonListener.contentDescription,
                iconSize = IconSize.Origin,
                tint = tintColor,
            )

            if (text.isNullOrEmpty()) {
                Spacer(_4dp)
            } else {
                MLDText(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = _8dp, end = _8dp, bottom = _4dp),
                    text = text,
                    textStyle = MintsLabTheme.typography.detailBold2,
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
        iconButtonListener = object: IconButtonListener {
            override val iconography: ImageVector
                get() = Iconography.IconCheck
            override val contentDescription: String
                get() = ""
            override val onClickIcon: () -> Unit
                get() = TODO("Not yet implemented")
        },
        text = "확인"
    )
}