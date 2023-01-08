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

public val MLDIcon.IconStar: ImageVector
    get() {
        if (_iconStar != null) {
            return _iconStar!!
        }
        _iconStar = Builder(name = "IconStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.154f, 1.927f)
                lineTo(15.481f, 6.642f)
                curveTo(15.668f, 7.021f, 16.03f, 7.284f, 16.449f, 7.345f)
                lineTo(21.652f, 8.101f)
                curveTo(22.706f, 8.254f, 23.128f, 9.551f, 22.364f, 10.294f)
                lineTo(18.599f, 13.964f)
                curveTo(18.4498f, 14.1095f, 18.3381f, 14.2892f, 18.2737f, 14.4874f)
                curveTo(18.2092f, 14.6856f, 18.1939f, 14.8965f, 18.229f, 15.102f)
                lineTo(19.118f, 20.284f)
                curveTo(19.298f, 21.335f, 18.196f, 22.135f, 17.253f, 21.64f)
                lineTo(12.599f, 19.193f)
                curveTo(12.4146f, 19.096f, 12.2094f, 19.0452f, 12.001f, 19.0452f)
                curveTo(11.7926f, 19.0452f, 11.5874f, 19.096f, 11.403f, 19.193f)
                lineTo(6.749f, 21.64f)
                curveTo(5.805f, 22.135f, 4.703f, 21.335f, 4.883f, 20.284f)
                lineTo(5.772f, 15.102f)
                curveTo(5.807f, 14.8965f, 5.7916f, 14.6856f, 5.7272f, 14.4874f)
                curveTo(5.6627f, 14.2892f, 5.5511f, 14.1096f, 5.402f, 13.964f)
                lineTo(1.637f, 10.294f)
                curveTo(0.874f, 9.551f, 1.295f, 8.254f, 2.35f, 8.101f)
                lineTo(7.552f, 7.345f)
                curveTo(7.971f, 7.284f, 8.334f, 7.021f, 8.521f, 6.642f)
                lineTo(10.847f, 1.927f)
                curveTo(11.319f, 0.971f, 12.682f, 0.971f, 13.154f, 1.927f)
            }
        }
        .build()
        return _iconStar!!
    }

private var _iconStar: ImageVector? = null
