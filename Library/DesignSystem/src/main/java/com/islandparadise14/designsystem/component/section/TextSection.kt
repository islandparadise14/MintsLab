package com.islandparadise14.designsystem.component.section

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDText
import com.islandparadise14.designsystem.base.foundation._16dp

@Composable
fun TextSection(
    text: String
) {
    Box(
        modifier = Modifier.padding(_16dp)
    ) {
        MLDText(
            text = text,
            textStyle = MintsLabTheme.typography.bodyNormal2,
            maxLines = Int.MAX_VALUE
        )
    }
}