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

public val Iconography.IconEqual: ImageVector
    get() {
        if (_iconEqual != null) {
            return _iconEqual!!
        }
        _iconEqual = Builder(name = "IconEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.94f, 10.12f)
                horizontalLineTo(6.06f)
                curveTo(5.24f, 10.12f, 4.575f, 9.56f, 4.575f, 8.868f)
                curveTo(4.575f, 8.176f, 5.24f, 7.615f, 6.06f, 7.615f)
                horizontalLineTo(17.94f)
                curveTo(18.76f, 7.615f, 19.425f, 8.176f, 19.425f, 8.868f)
                curveTo(19.425f, 9.559f, 18.76f, 10.121f, 17.94f, 10.121f)
                moveTo(17.94f, 16.385f)
                horizontalLineTo(6.06f)
                curveTo(5.24f, 16.385f, 4.575f, 15.824f, 4.575f, 15.132f)
                curveTo(4.575f, 14.441f, 5.24f, 13.879f, 6.06f, 13.879f)
                horizontalLineTo(17.94f)
                curveTo(18.76f, 13.879f, 19.425f, 14.441f, 19.425f, 15.132f)
                curveTo(19.425f, 15.824f, 18.76f, 16.385f, 17.94f, 16.385f)
                close()
            }
        }
        .build()
        return _iconEqual!!
    }

private var _iconEqual: ImageVector? = null
