package com.islandparadise14.designsystem.base.atom

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.islandparadise14.designsystem.base.foundation._0dp

@Composable
fun Spacer(width: Dp = _0dp, height: Dp = _0dp) = Spacer(
    modifier = Modifier
        .width(width)
        .height(height)
)

@Composable
fun ColumnScope.Spacer(height: Dp = _0dp) = Spacer(
    modifier = Modifier
        .height(height)
)

@Composable
fun RowScope.Spacer(width: Dp = _0dp) = Spacer(
    modifier = Modifier
        .width(width)
)