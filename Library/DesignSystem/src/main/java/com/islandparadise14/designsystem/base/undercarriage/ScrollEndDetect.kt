package com.islandparadise14.designsystem.base.undercarriage

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState

fun LazyListState.isEndOfScroll() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1

fun ScrollState.isEndOfScroll() = value == maxValue