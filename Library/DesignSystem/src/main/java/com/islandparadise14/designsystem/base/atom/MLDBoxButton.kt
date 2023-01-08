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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.*
import com.islandparadise14.designsystem.base.foundation.mldicon.IconEmpty
import com.islandparadise14.designsystem.base.foundation.value.ButtonColor
import com.islandparadise14.designsystem.base.foundation.value.ButtonSize
import com.islandparadise14.designsystem.base.foundation.value.ButtonType
import com.islandparadise14.designsystem.base.undercarriage.calculateRetouch

@Composable
fun MLDBoxButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonColor: ButtonColor = ButtonColor.Main,
    buttonType: ButtonType = ButtonType.Solid,
    buttonSize: ButtonSize = ButtonSize.Xlarge,
    isDisable: Boolean = false,
    disableAnimation: Boolean = false,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    isFull: Boolean = false,
    onClick: () -> Unit = {}
) {
    // 상수 및 remember
    val buttonMinScaleValue = 0.95f
    val pressState = remember { mutableStateOf(false) }
    val isPressCanceled = remember { mutableStateOf(false) }

    val isActiveDisableAnimationLeft = remember { mutableStateOf(false) }
    val isActiveDisableAnimationRight = remember { mutableStateOf(false) }

    val context = LocalContext.current

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

    val disableAnimationLeftValue = animateFloatAsState(
        targetValue = if (isActiveDisableAnimationLeft.value) 0.3f else 0f,
        visibilityThreshold = 0.15f
    ) {
        if (it == 0.3f) {
            isActiveDisableAnimationLeft.value = false
        } else if (it == 0f) {
            isActiveDisableAnimationRight.value = true
        }
    }

    val disableAnimationRightValue = animateFloatAsState(
        targetValue = if (isActiveDisableAnimationRight.value) 0.2f else 0f,
        visibilityThreshold = 0.1f
    ) {
        if (it == 0.2f) {
            isActiveDisableAnimationRight.value = false
        }
    }

    val textStyle = when (buttonSize) {
        ButtonSize.Small -> MintsLabTheme.typography.detailNormal1
        ButtonSize.Medium -> MintsLabTheme.typography.bodyNormal2
        ButtonSize.Large -> MintsLabTheme.typography.bodyNormal2
        ButtonSize.Xlarge -> MintsLabTheme.typography.bodyNormal1
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
        ButtonType.Solid -> BorderStroke(MinBorder, pressedSolidColor)
        ButtonType.Outline -> BorderStroke(MinBorder, buttonMainColor)
    }

    val onTouchDown = {
        if (!isDisable) {
            isPressCanceled.value = false
            pressState.value = true
        } else {
            if (disableAnimation) {
                isActiveDisableAnimationLeft.value = true
                context.vibe(Vibration.WARNING)
            }
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
            .scale(if (isFull) 1f else buttonScale.value)
            .padding(
                start = (disableAnimationLeftValue.value * 10).dp,
                end = (disableAnimationRightValue.value *10).dp,
            ),
        isDisable = isDisable,
        backgroundColor = buttonBackground,
        isRound = !isFull,
        border = border,
    ) {
        Row(
            Modifier
                .height(buttonHeight)
                .padding(horizontal = horizontalPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AnimatedVisibility(visible = leftIcon != null) {
                MLDIcon(
                    iconography = leftIcon ?: MLDIcon.IconEmpty,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = _4dp)
                        .height(18.dp)
                        .width(18.dp),
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
            AnimatedVisibility(visible = rightIcon != null) {
                MLDIcon(
                    iconography = rightIcon ?: MLDIcon.IconEmpty,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = _4dp)
                        .height(18.dp)
                        .width(18.dp),
                    tint = textColor
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxButtonSize() {
    Column {
        MLDBoxButton("Button", buttonSize = ButtonSize.Xlarge)
        Spacer(_12dp)
        MLDBoxButton("Button", buttonSize = ButtonSize.Large)
        Spacer(_12dp)
        MLDBoxButton("Button", buttonSize = ButtonSize.Medium)
        Spacer(_12dp)
        MLDBoxButton("Button", buttonSize = ButtonSize.Small)
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
            MLDBoxButton("Button")
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Sub)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Gray)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Warning)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonType = ButtonType.Outline)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Sub, buttonType = ButtonType.Outline)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Gray, buttonType = ButtonType.Outline)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Warning, buttonType = ButtonType.Outline)
        }
        Spacer(_12dp)
        Column {
            MLDBoxButton("Button", isDisable = true)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Sub, isDisable = true)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Gray, isDisable = true)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonColor = ButtonColor.Warning, isDisable = true)
            Spacer(_12dp)
            MLDBoxButton("Button", buttonType = ButtonType.Outline, isDisable = true)
            Spacer(_12dp)
            MLDBoxButton(
                "Button",
                buttonColor = ButtonColor.Sub,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
            Spacer(_12dp)
            MLDBoxButton(
                "Button",
                buttonColor = ButtonColor.Gray,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
            Spacer(_12dp)
            MLDBoxButton(
                "Button",
                buttonColor = ButtonColor.Warning,
                buttonType = ButtonType.Outline,
                isDisable = true
            )
        }
    }
}