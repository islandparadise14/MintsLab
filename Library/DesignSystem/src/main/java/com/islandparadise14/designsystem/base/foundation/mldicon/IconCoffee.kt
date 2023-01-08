package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconCoffee: ImageVector
    get() {
        if (_iconCoffee != null) {
            return _iconCoffee!!
        }
        _iconCoffee = Builder(name = "IconCoffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.627f, 22.087f)
                curveTo(5.6488f, 22.3362f, 5.7631f, 22.5681f, 5.9475f, 22.7372f)
                curveTo(6.1319f, 22.9062f, 6.3729f, 22.9999f, 6.623f, 23.0f)
                horizontalLineTo(17.586f)
                curveTo(17.8361f, 22.9999f, 18.0771f, 22.9062f, 18.2615f, 22.7372f)
                curveTo(18.4459f, 22.5681f, 18.5602f, 22.3362f, 18.582f, 22.087f)
                lineTo(18.834f, 19.193f)
                lineTo(19.551f, 10.969f)
                lineTo(19.667f, 9.631f)
                horizontalLineTo(4.542f)
                lineTo(5.627f, 22.087f)
                verticalLineTo(22.087f)
                close()
                moveTo(20.804f, 4.53f)
                horizontalLineTo(19.207f)
                lineTo(18.118f, 1.666f)
                curveTo(18.0434f, 1.4702f, 17.9111f, 1.3017f, 17.7386f, 1.1827f)
                curveTo(17.5661f, 1.0638f, 17.3615f, 1.0001f, 17.152f, 1.0f)
                horizontalLineTo(7.058f)
                curveTo(6.628f, 1.0f, 6.244f, 1.265f, 6.091f, 1.666f)
                lineTo(5.002f, 4.53f)
                horizontalLineTo(3.197f)
                curveTo(3.0644f, 4.53f, 2.9372f, 4.5827f, 2.8435f, 4.6764f)
                curveTo(2.7497f, 4.7702f, 2.697f, 4.8974f, 2.697f, 5.03f)
                verticalLineTo(7.131f)
                curveTo(2.697f, 7.2636f, 2.7497f, 7.3908f, 2.8435f, 7.4845f)
                curveTo(2.9372f, 7.5783f, 3.0644f, 7.631f, 3.197f, 7.631f)
                horizontalLineTo(20.804f)
                curveTo(20.9366f, 7.631f, 21.0638f, 7.5783f, 21.1576f, 7.4845f)
                curveTo(21.2513f, 7.3908f, 21.304f, 7.2636f, 21.304f, 7.131f)
                verticalLineTo(5.03f)
                curveTo(21.304f, 4.8974f, 21.2513f, 4.7702f, 21.1576f, 4.6764f)
                curveTo(21.0638f, 4.5827f, 20.9366f, 4.53f, 20.804f, 4.53f)
                close()
            }
        }
        .build()
        return _iconCoffee!!
    }

private var _iconCoffee: ImageVector? = null
