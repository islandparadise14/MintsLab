package com.islandparadise14.designsystem.base.atom

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.islandparadise14.designsystem.MintsLabTheme

@Composable
fun MLDText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MintsLabTheme.typography.body2,
    tint: Color = MintsLabTheme.color.mainText,
    maxLines: Int = 1
) {
    Text(
        text = text,
        modifier = modifier,
        style = textStyle,
        color = tint,
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines,
    )
}

@Preview
@Composable
fun PreviewMintLabText() {
    MLDText(text = "안녕하세요")
}