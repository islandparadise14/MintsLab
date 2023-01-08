package com.islandparadise14.designsystem.component.list

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDIcon
import com.islandparadise14.designsystem.base.atom.MLDSurface
import com.islandparadise14.designsystem.base.atom.MLDText
import com.islandparadise14.designsystem.base.foundation._12dp
import com.islandparadise14.designsystem.base.foundation._20dp

@Composable
fun IconTextList(
    icon: ImageVector,
    text: String,
    iconTint: Color = MintsLabTheme.color.normalIcon,
    onClick: () -> Unit = {},
) {
    val buttonMinScaleValue = 0.98f
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
        modifier = Modifier.fillMaxWidth().scale(buttonScale.value),
        onTouchDown = onTouchDown,
        onTouchUpOrCancel = onTouchUpOrCancel,
        onClick = onClick,
        backgroundColor = background
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(_20dp, _12dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            MLDIcon(
                iconography = icon,
                contentDescription = null,
                tint = iconTint,
            )
            MLDText(
                text = text,
                modifier = Modifier.weight(1f, true).padding(horizontal = _12dp),
                textStyle = MintsLabTheme.typography.bodyMedium1,
            )
        }
    }
}