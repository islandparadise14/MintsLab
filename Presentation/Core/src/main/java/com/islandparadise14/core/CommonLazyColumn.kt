package com.islandparadise14.core

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.islandparadise14.core.listItem.ExampleTextItem
import com.islandparadise14.designsystem.component.layout.ScrollLazyColumn

@Composable
fun CommonLazyColumn(
    modifier: Modifier,
    list: List<ItemViewMapper>,
    additionalItemContent: @Composable (LazyItemScope.(ItemViewMapper) -> Unit) = {}
) {
    ScrollLazyColumn(modifier = modifier) {
        items(items = list, itemContent = { item ->
            when (item) {
                // commonItemContent
                is ExampleTextItem -> {
                    Text(text = item.text, modifier = Modifier.clickable { item.onClickListener() })
                }
                /** is  ... -> {
                 *      ...
                 * }
                 * */
                // additionalItemContent
                else -> additionalItemContent(item)
            }
        })
    }
}