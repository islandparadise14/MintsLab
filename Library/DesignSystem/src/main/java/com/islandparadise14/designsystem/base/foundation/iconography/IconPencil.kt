package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconPencil: ImageVector
    get() {
        if (_iconPencil != null) {
            return _iconPencil!!
        }
        _iconPencil = Builder(name = "IconPencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.335f, 5.454f)
                lineTo(3.273f, 14.516f)
                lineTo(2.037f, 19.126f)
                lineTo(1.224f, 22.163f)
                curveTo(1.2014f, 22.2478f, 1.2015f, 22.3371f, 1.2243f, 22.4219f)
                curveTo(1.2471f, 22.5067f, 1.2918f, 22.584f, 1.3539f, 22.6461f)
                curveTo(1.416f, 22.7082f, 1.4933f, 22.7529f, 1.5781f, 22.7757f)
                curveTo(1.6629f, 22.7985f, 1.7522f, 22.7986f, 1.837f, 22.776f)
                lineTo(4.872f, 21.962f)
                lineTo(9.483f, 20.726f)
                horizontalLineTo(9.484f)
                lineTo(18.546f, 11.664f)
                lineTo(12.336f, 5.454f)
                horizontalLineTo(12.335f)
                close()
                moveTo(22.293f, 6.504f)
                lineTo(17.497f, 1.707f)
                curveTo(17.4042f, 1.6141f, 17.294f, 1.5403f, 17.1727f, 1.49f)
                curveTo(17.0514f, 1.4397f, 16.9213f, 1.4138f, 16.79f, 1.4138f)
                curveTo(16.6587f, 1.4138f, 16.5286f, 1.4397f, 16.4073f, 1.49f)
                curveTo(16.286f, 1.5403f, 16.1758f, 1.6141f, 16.083f, 1.707f)
                lineTo(13.608f, 4.181f)
                lineTo(19.819f, 10.392f)
                lineTo(22.293f, 7.917f)
                curveTo(22.3859f, 7.8242f, 22.4597f, 7.714f, 22.51f, 7.5927f)
                curveTo(22.5603f, 7.4714f, 22.5862f, 7.3413f, 22.5862f, 7.21f)
                curveTo(22.5862f, 7.0787f, 22.5603f, 6.9486f, 22.51f, 6.8273f)
                curveTo(22.4597f, 6.706f, 22.3859f, 6.5958f, 22.293f, 6.503f)
            }
        }
        .build()
        return _iconPencil!!
    }

private var _iconPencil: ImageVector? = null
