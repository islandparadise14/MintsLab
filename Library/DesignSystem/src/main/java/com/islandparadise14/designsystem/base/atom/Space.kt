package com.islandparadise14.designsystem.base.atom

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Space(width: Int = 0, height: Int = 0) {
    val widthSize = width.dp
    val heightSize = height.dp

    Spacer(
        modifier = Modifier
            .width(widthSize)
            .height(heightSize)
    )
}

@Composable
fun ColumnScope.Space(height: Int = 0) {
    val heightSize = height.dp

    Spacer(
        modifier = Modifier
            .height(heightSize)
    )
}

@Composable
fun RowScope.Space(width: Int = 0) {
    val widthSize = width.dp

    Spacer(
        modifier = Modifier
            .width(widthSize)
    )
}