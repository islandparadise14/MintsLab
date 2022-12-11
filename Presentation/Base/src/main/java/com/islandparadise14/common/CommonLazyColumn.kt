package com.islandparadise14.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.islandparadise14.common.listItem.ExampleTextItem

@Composable
fun CommonLazyColumn(modifier: Modifier, list: List<ItemViewMapper>) {
    LazyColumn(modifier = modifier) {
        items(items = list, itemContent = { item ->
            when (item) {
                is ExampleTextItem -> {
                    Text(text = item.text, modifier = Modifier.clickable { item.onClickListener() })
                }
            }
        })
    }
}