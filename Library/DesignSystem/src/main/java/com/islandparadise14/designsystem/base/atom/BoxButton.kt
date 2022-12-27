package com.islandparadise14.designsystem.base.atom

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.BuildConfig
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.Iconography
import com.islandparadise14.designsystem.base.foundation._12dp
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation.iconography.IconEmpty
import com.islandparadise14.designsystem.base.foundation.value.ButtonColor
import com.islandparadise14.designsystem.base.foundation.value.ButtonSize
import com.islandparadise14.designsystem.base.foundation.value.ButtonType
import com.islandparadise14.designsystem.base.undercarriage.MLDSurface
import com.islandparadise14.designsystem.base.undercarriage.calculateRetouch

@Composable
fun BoxButton(
    modifier: Modifier = Modifier,
    text: String = if (BuildConfig.DEBUG) "Button" else "",
    buttonColor: ButtonColor = ButtonColor.Main,
    buttonType: ButtonType = ButtonType.Solid,
    buttonSize: ButtonSize = ButtonSize.Xlarge,
    isDisable: Boolean = false,
    iconography: ImageVector? = null,
    isRound: Boolean = true,
    onClick: () -> Unit = {}
) {
    // 상수 및 remember
    val buttonMinScaleValue = 0.95f
    val pressState = remember { mutableStateOf(false) }
    val isPressCanceled = remember { mutableStateOf(false) }

    // 공통되는 내용은 변수로 따로 관리
    val buttonScale = animateFloatAsState(
        targetValue = if (pressState.value) buttonMinScaleValue else 1f,
        visibilityThreshold = 0.03f
    ) {
        if (isPressCanceled.value) {
            pressState.value = false
            isPressCanceled.value = false
        }
    }
    val textScale = animateFloatAsState(
        targetValue = if (pressState.value) 0.98f else 1f,
        visibilityThreshold = 0.03f
    )

    val textStyle = when (buttonSize) {
        ButtonSize.Small -> MintsLabTheme.typography.detail2
        ButtonSize.Medium -> MintsLabTheme.typography.body4
        ButtonSize.Large -> MintsLabTheme.typography.body4
        ButtonSize.Xlarge -> MintsLabTheme.typography.body2
    }
    val buttonHeight = when (buttonSize) {
        ButtonSize.Small -> 32.dp
        ButtonSize.Medium -> 40.dp
        ButtonSize.Large -> 48.dp
        ButtonSize.Xlarge -> 52.dp
    }
    val horizontalPadding = when (buttonSize) {
        ButtonSize.Small -> _12dp
        ButtonSize.Medium -> _16dp
        ButtonSize.Large -> _16dp
        ButtonSize.Xlarge -> _16dp
    }

    val buttonMainColor = if (buttonType == ButtonType.Outline && isDisable)
        MintsLabTheme.color.disableButton
    else when (buttonColor) {
        ButtonColor.Main -> calculateRetouch(
            MintsLabTheme.color.mainButton,
            isDisable,
            MintsLabTheme.retouch.mainButtonDisable
        )
        ButtonColor.Sub -> calculateRetouch(
            MintsLabTheme.color.subButton,
            isDisable,
            MintsLabTheme.retouch.subButtonDisable
        )
        ButtonColor.Gray -> calculateRetouch(
            if (buttonType == ButtonType.Outline)
                MintsLabTheme.color.subText
            else
                MintsLabTheme.color.grayButton,
            isDisable,
            MintsLabTheme.retouch.grayButtonDisable
        )
        ButtonColor.Warning -> calculateRetouch(
            MintsLabTheme.color.warning,
            isDisable,
            MintsLabTheme.retouch.mainButtonDisable
        )
    }

    val textColor = if (buttonType == ButtonType.Outline)
        buttonMainColor
    else if (isDisable)
        MintsLabTheme.color.disableText
    else when (buttonColor) {
        ButtonColor.Main -> MintsLabTheme.color.brightText
        ButtonColor.Sub -> MintsLabTheme.color.primaryButtonText
        ButtonColor.Gray -> MintsLabTheme.color.subText
        ButtonColor.Warning -> MintsLabTheme.color.brightText
    }

    val pressedSolidColor = calculateRetouch(
        buttonMainColor,
        pressState.value,
        MintsLabTheme.retouch.solidPressed
    )

    val pressedOutlineColor = if (pressState.value)
        MintsLabTheme.color.pressTransparent
    else
        MintsLabTheme.color.transparent

    val buttonBackground = when (buttonType) {
        ButtonType.Solid -> pressedSolidColor
        ButtonType.Outline -> pressedOutlineColor
    }
    val border = when (buttonType) {
        ButtonType.Solid -> BorderStroke(1.dp, pressedSolidColor)
        ButtonType.Outline -> BorderStroke(1.dp, buttonMainColor)
    }

    val onTouchDown = {
        if (!isDisable) {
            isPressCanceled.value = false
            pressState.value = true
        }
    }
    val onTouchUpOrCancel = {
        if (!isDisable) {
            if (buttonScale.value == buttonMinScaleValue) {
                pressState.value = false
            } else {
                isPressCanceled.value = true
            }
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
        isDisable = isDisable,
        backgroundColor = buttonBackground,
        isRound = isRound,
        border = border,
    ) {
        Row(
            Modifier
                .height(buttonHeight)
                .padding(horizontal = horizontalPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AnimatedVisibility(visible = iconography != null) {
                MLDIcon(
                    iconography = iconography ?: Iconography.IconEmpty,
                    contentDescription = null,
                    tint = textColor
                )
            }
            MLDText(
                text = text,
                textStyle = textStyle,
                tint = textColor,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .scale(textScale.value)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxButtonSize() {
    Column {
        BoxButton(buttonSize = ButtonSize.Xlarge)
        Space(_12dp)
        BoxButton(buttonSize = ButtonSize.Large)
        Space(_12dp)
        BoxButton(buttonSize = ButtonSize.Medium)
        Space(_12dp)
        BoxButton(buttonSize = ButtonSize.Small)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxButton() {
    PreviewBoxButtonContent()
}

@Preview(showBackground = true, backgroundColor = 0xFF181818)
@Composable
fun PreviewDarkBoxButton() {
    MintsLabTheme(isDarkTheme = true) { PreviewBoxButtonContent() }
}

@Composable
fun PreviewBoxButtonContent() {
    Row(Modifier.padding(10.dp)) {
        Column {
            BoxButton()
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Sub)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Gray)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Warning)
            Space(_12dp)
            BoxButton(buttonType = ButtonType.Outline)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Sub, buttonType = ButtonType.Outline)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Gray, buttonType = ButtonType.Outline)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Warning, buttonType = ButtonType.Outline)
        }
        Space(_12dp)
        Column {
            BoxButton(isDisable = true)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Sub, isDisable = true)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Gray, isDisable = true)
            Space(_12dp)
            BoxButton(buttonColor = ButtonColor.Warning, isDisable = true)
            Space(_12dp)
            BoxButton(buttonType = ButtonType.Outline, isDisable = true)
            Space(_12dp)
            BoxButton(
                buttonColor = ButtonColor.Sub,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
            Space(_12dp)
            BoxButton(
                buttonColor = ButtonColor.Gray,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
            Space(_12dp)
            BoxButton(
                buttonColor = ButtonColor.Warning,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
        }
    }
}