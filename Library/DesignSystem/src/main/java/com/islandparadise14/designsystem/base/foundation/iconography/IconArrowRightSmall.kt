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

public val Iconography.IconArrowRightSmall: ImageVector
    get() {
        if (_iconArrowRightSmall != null) {
            return _iconArrowRightSmall!!
        }
        _iconArrowRightSmall = Builder(name = "IconArrowRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.625f, 20.1f)
                curveTo(8.28f, 20.1f, 7.935f, 19.965f, 7.665f, 19.71f)
                curveTo(7.4131f, 19.457f, 7.2717f, 19.1145f, 7.2717f, 18.7575f)
                curveTo(7.2717f, 18.4005f, 7.4131f, 18.058f, 7.665f, 17.805f)
                lineTo(13.47f, 12.0f)
                lineTo(7.665f, 6.21f)
                curveTo(7.4131f, 5.957f, 7.2717f, 5.6145f, 7.2717f, 5.2575f)
                curveTo(7.2717f, 4.9005f, 7.4131f, 4.558f, 7.665f, 4.305f)
                curveTo(7.918f, 4.0531f, 8.2605f, 3.9117f, 8.6175f, 3.9117f)
                curveTo(8.9745f, 3.9117f, 9.317f, 4.0531f, 9.57f, 4.305f)
                lineTo(16.32f, 11.055f)
                curveTo(16.5719f, 11.308f, 16.7133f, 11.6505f, 16.7133f, 12.0075f)
                curveTo(16.7133f, 12.3645f, 16.5719f, 12.707f, 16.32f, 12.96f)
                lineTo(9.57f, 19.71f)
                curveTo(9.315f, 19.965f, 8.97f, 20.1f, 8.625f, 20.1f)
            }
        }
        .build()
        return _iconArrowRightSmall!!
    }

private var _iconArrowRightSmall: ImageVector? = null
