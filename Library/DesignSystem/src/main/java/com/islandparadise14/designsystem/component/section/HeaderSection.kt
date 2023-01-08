package com.islandparadise14.designsystem.component.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDText
import com.islandparadise14.designsystem.base.atom.Spacer
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation._8dp

@Composable
fun HeaderSection(
    mainTitle: String,
    subTitle: String = "",
) {
    Column(Modifier.padding(_16dp)) {
        MLDText(
            text = mainTitle,
            textStyle = MintsLabTheme.typography.headlineBold1,
            maxLines = 2
        )
        if (subTitle.isNotEmpty()) {
            Spacer(_8dp)
            MLDText(
                text = subTitle,
                textStyle = MintsLabTheme.typography.bodyMedium1,
                tint = MintsLabTheme.color.subText
            )
        }
    }
}