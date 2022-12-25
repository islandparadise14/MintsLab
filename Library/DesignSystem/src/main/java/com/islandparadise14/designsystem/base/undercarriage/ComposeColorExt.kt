package com.islandparadise14.designsystem.base.undercarriage

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import com.islandparadise14.designsystem.base.foundation.RetouchType
import com.islandparadise14.designsystem.base.foundation.RetouchValue
import com.islandparadise14.designsystem.util.RgbHsvUtil

fun calculateRetouch(color: Color, isRetouch: Boolean, retouchValue: RetouchValue): Color {
    if (!isRetouch) {
        return color
    }

    return when (retouchValue.retouchType) {
        RetouchType.Saturate -> {
            val rhUtil = RgbHsvUtil(composeToGraphicsColor(color))
            val convertColor = rhUtil.changeSaturate(retouchValue.value)

            Color(convertColor)
        }
        RetouchType.Value -> {
            val rhUtil = RgbHsvUtil(composeToGraphicsColor(color))
            val convertColor = rhUtil.changeValue(retouchValue.value)

            Color(convertColor)
        }
    }
}

fun composeToGraphicsColor(color: Color): Int {
    return android.graphics.Color.argb(
        color.toArgb().alpha,
        color.toArgb().red,
        color.toArgb().green,
        color.toArgb().blue,
    )
}