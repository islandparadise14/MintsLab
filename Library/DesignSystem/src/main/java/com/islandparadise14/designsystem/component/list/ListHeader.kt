package com.islandparadise14.designsystem.component.list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDText
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation._20dp
import com.islandparadise14.designsystem.base.foundation._8dp

@Composable
fun ListHeader(
    text: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = _16dp,
                bottom =  _8dp,
                start = _20dp,
                end = _20dp
            )
    ) {
        MLDText(
            text = text,
            textStyle = MintsLabTheme.typography.headlineBold3,
        )
    }
}