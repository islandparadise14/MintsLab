package com.islandparadise14.designsystem.component.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.*
import com.islandparadise14.designsystem.base.foundation._12dp
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation._8dp
import com.islandparadise14.designsystem.base.undercarriage.IconButtonListener

@Composable
fun TitleNavigation(
    title: String,
    subTitle: String? = null,
    icon1: IconButtonListener? = null,
    icon2: IconButtonListener? = null,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = _8dp)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = _16dp)
                .weight(1f, true)
                .align(Alignment.CenterVertically)
        ) {
            if (!subTitle.isNullOrEmpty()) {
                MLDText(
                    text = subTitle,
                    textStyle = MintsLabTheme.typography.bodyNormal1,
                    tint = MintsLabTheme.color.subText
                )
            }

            MLDText(
                text = title,
                textStyle = MintsLabTheme.typography.headlineBold1)
        }
        Row(
            modifier = Modifier
                .padding(end = _12dp)
                .align(Alignment.Bottom)
        ) {
            icon1?.let {
                MLDIconButton(icon1)
            }
            icon2?.let {
                MLDIconButton(icon2)
            }
        }
    }
}

@Preview
@Composable
fun PreviewTitleBar() {
    TitleNavigation(title = "Title")
}