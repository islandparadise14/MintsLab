package com.islandparadise14.core.listItem

import com.islandparadise14.core.ItemViewMapper

data class ExampleTextItem(
    var text: String = "",
    var onClickListener: () -> Unit = {}
): ItemViewMapper