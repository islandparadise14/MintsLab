package com.islandparadise14.common.listItem

import com.islandparadise14.common.ItemViewMapper

data class ExampleTextItem(
    var text: String = "",
    var onClickListener: () -> Unit = {}
): ItemViewMapper