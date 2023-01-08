package com.islandparadise14.designsystem.base.atom

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import com.islandparadise14.designsystem.MintsLabTheme

@Composable
fun MLDTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    hint: String? = null,
    textStyle: TextStyle = MintsLabTheme.typography.bodyNormal1,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {

    val tintColor = if (isError) {
        MintsLabTheme.color.warning
    } else {
        MintsLabTheme.color.borderPrimary
    }

    val mergedTextStyle = textStyle.merge(
        TextStyle(color = MintsLabTheme.color.mainText)
    )

    /** Content */
    Box {
        if (value.isEmpty() && hint?.isNotEmpty() == true) {
            MLDText(
                text = hint,
                textStyle = textStyle,
                tint = MintsLabTheme.color.disableText
            )
        }
        BasicTextField(
            value = value,
            modifier = modifier,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(tintColor),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            singleLine = singleLine,
            maxLines = maxLines,
        )
    }
}