package com.islandparadise14.designsystem.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDIconButton
import com.islandparadise14.designsystem.base.atom.MLDText

@Composable
fun TitleBar(
    title: String,
    subTitle: String? = null,
    iconography1: ImageVector? = null,
    iconography2: ImageVector? = null,
    contentDescription1: String? = null,
    contentDescription2: String? = null,
    onClickIcon1: () -> Unit = {},
    onClickIcon2: () -> Unit = {},
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .weight(1f, true)
                .align(Alignment.CenterVertically)
        ) {
            if (!subTitle.isNullOrEmpty()) {
                MLDText(
                    text = subTitle,
                    textStyle = MintsLabTheme.typography.body2,
                    tint = MintsLabTheme.color.subText
                )
            }

            MLDText(
                text = title,
                textStyle = MintsLabTheme.typography.headline1)
        }
        Row(
            modifier = Modifier
                .padding(end = 12.dp)
                .align(Alignment.Bottom)
        ) {
            iconography2?.let {
                MLDIconButton(
                    iconography = it,
                    contentDescription = contentDescription2,
                    onClick = onClickIcon2
                )
            }
            iconography1?.let {
                MLDIconButton(
                    iconography = it,
                    contentDescription = contentDescription1,
                    onClick = onClickIcon1
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewTitleBar() {
    TitleBar(title = "Title")
}