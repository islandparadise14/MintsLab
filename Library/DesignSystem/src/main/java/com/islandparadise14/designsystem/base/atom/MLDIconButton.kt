package com.islandparadise14.designsystem.base.atom

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.Iconography
import com.islandparadise14.designsystem.base.foundation.iconography.IconCheck
import com.islandparadise14.designsystem.base.foundation.value.IconSize
import com.islandparadise14.designsystem.base.undercarriage.MLDSurface

@Composable
fun MLDIconButton(
    modifier: Modifier = Modifier,
    iconography: ImageVector,
    contentDescription: String?,
    text: String? = null,
    isDisable: Boolean = false,
    onClick: () -> Unit = {},
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val buttonScale = animateFloatAsState(
        targetValue = if (isPressed) 0.95f else 1f,
        visibilityThreshold = 0.03f
    )

    val background = if (isPressed)
        MintsLabTheme.color.pressTransparent
    else
        MintsLabTheme.color.transparent


    MLDSurface(
        onClick = onClick,
        modifier = Modifier
            .then(modifier)
            .scale(buttonScale.value),
        isDisable = isDisable,
        backgroundColor = background,
        interactionSource = interactionSource,
    ) {
        Column {
            val iconModifier = if (text.isNullOrEmpty()) {
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(all = 8.dp)
            } else {
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 8.dp, start = 8.dp, end = 8.dp, bottom = 4.dp)
            }

            MLDIcon(
                modifier = iconModifier,
                iconography = iconography,
                contentDescription = contentDescription,
                iconSize = IconSize.Origin,
            )

            if (!text.isNullOrEmpty()) {
                MLDText(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 8.dp, end = 8.dp, bottom = 4.dp)
                    ,
                    text = text,
                    textStyle = MintsLabTheme.typography.detail3,
                    maxLines = 2,
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