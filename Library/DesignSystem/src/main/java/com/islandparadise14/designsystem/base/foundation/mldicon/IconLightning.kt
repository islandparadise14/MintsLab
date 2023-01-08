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

public val MLDIcon.IconLightning: ImageVector
    get() {
        if (_iconLightning != null) {
            return _iconLightning!!
        }
        _iconLightning = Builder(name = "IconLightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.031f, 10.934f)
                lineTo(14.358f, 9.302f)
                lineTo(15.77f, 2.33f)
                curveTo(15.997f, 1.206f, 14.61f, 0.489f, 13.825f, 1.323f)
                lineTo(4.515f, 11.211f)
                curveTo(4.3849f, 11.3492f, 4.2913f, 11.5177f, 4.2429f, 11.7013f)
                curveTo(4.1944f, 11.8848f, 4.1926f, 12.0776f, 4.2376f, 12.262f)
                curveTo(4.2826f, 12.4464f, 4.373f, 12.6166f, 4.5006f, 12.7572f)
                curveTo(4.6281f, 12.8978f, 4.7888f, 13.0043f, 4.968f, 13.067f)
                lineTo(9.64f, 14.699f)
                lineTo(8.23f, 21.671f)
                curveTo(8.001f, 22.794f, 9.388f, 23.511f, 10.174f, 22.678f)
                lineTo(19.485f, 12.788f)
                curveTo(20.05f, 12.188f, 19.809f, 11.205f, 19.031f, 10.934f)
            }
        }
        .build()
        return _iconLightning!!
    }

private var _iconLightning: ImageVector? = null
