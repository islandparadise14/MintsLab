package com.islandparadise14.designsystem.component.button

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.islandparadise14.designsystem.base.atom.MLDBoxButton
import com.islandparadise14.designsystem.base.atom.Spacer
import com.islandparadise14.designsystem.base.foundation._0dp
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation._8dp
import com.islandparadise14.designsystem.base.undercarriage.isOpenKeyboardAsState

@Composable
fun CTAButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val isOpenKeyboard by isOpenKeyboardAsState()

    Row(
        Modifier
            .then(modifier)
            .fillMaxWidth()
            .padding(
                top = if (isOpenKeyboard) _0dp else _8dp,
                bottom = if (isOpenKeyboard) _0dp else _16dp
            ),
    ) {
        AnimatedVisibility(visible = !isOpenKeyboard) {
            Spacer(width = _16dp, height = _0dp)
        }
        MLDBoxButton(
            text = text,
            modifier = Modifier.weight(1f, true),
            isFull = isOpenKeyboard,
            onClick = onClick,
            disableAnimation = true,
        )
        AnimatedVisibility(visible = !isOpenKeyboard) {
            Spacer(width = _16dp, height = _0dp)
        }
    }
}