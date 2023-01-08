package com.islandparadise14.designsystem.component.textField

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDTextField
import com.islandparadise14.designsystem.base.foundation.*

@Composable
fun TextInputArea(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String? = null,
    isHighLight: Boolean = false,
) {
    val borderColor = if (isHighLight)
        MintsLabTheme.color.borderPrimary
    else
        MintsLabTheme.color.borderSub

    /** Content */
    Box(
        Modifier
            .fillMaxWidth()
            .padding(_16dp, _16dp)
            .border(
                InputAreaBorder,
                borderColor,
                MLDInputShape
            )
            .padding(_16dp, _16dp)
    ) {
        MLDTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .requiredSizeIn(
                    minHeight = 100.dp,
                    maxHeight = 200.dp
                ),
            hint = hint
        )
    }
}