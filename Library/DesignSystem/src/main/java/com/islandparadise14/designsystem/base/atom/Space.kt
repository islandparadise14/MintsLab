@file:Suppress("ObjectPropertyName")

package com.islandparadise14.designsystem.base.atom

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.islandparadise14.designsystem.base.foundation._0dp

@Composable
fun Space(width: Dp = _0dp, height: Dp = _0dp) = Spacer(
    modifier = Modifier
        .width(width)
        .height(height)
)

@Composable
fun ColumnScope.Space(height: Dp = _0dp) = Spacer(
    modifier = Modifier
        .height(height)
)

@Composable
fun RowScope.Space(width: Dp = _0dp) = Spacer(
    modifier = Modifier
        .width(width)
)