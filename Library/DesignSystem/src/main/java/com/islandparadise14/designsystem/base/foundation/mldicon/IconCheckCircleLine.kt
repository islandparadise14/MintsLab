package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconCheckCircleLine: ImageVector
    get() {
        if (_iconCheckCircleLine != null) {
            return _iconCheckCircleLine!!
        }
        _iconCheckCircleLine = Builder(name = "IconCheckCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.2f, 10.2f)
                lineTo(11.6f, 15.8f)
                curveTo(11.4f, 16.0f, 11.2f, 16.1f, 10.9f, 16.1f)
                curveTo(10.6f, 16.1f, 10.4f, 16.0f, 10.2f, 15.8f)
                lineTo(6.8f, 12.4f)
                curveTo(6.4f, 12.0f, 6.4f, 11.4f, 6.8f, 11.0f)
                curveTo(7.2f, 10.6f, 7.8f, 10.6f, 8.2f, 11.0f)
                lineTo(10.9f, 13.7f)
                lineTo(15.8f, 8.8f)
                curveTo(16.2f, 8.4f, 16.8f, 8.4f, 17.2f, 8.8f)
                curveTo(17.6f, 9.2f, 17.6f, 9.8f, 17.2f, 10.2f)
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(17.0f, 3.0f, 21.0f, 7.0f, 21.0f, 12.0f)
                curveTo(21.0f, 17.0f, 17.0f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0f, 21.0f, 3.0f, 17.0f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0f, 7.0f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                curveTo(1.0f, 18.1f, 5.9f, 23.0f, 12.0f, 23.0f)
                curveTo(18.1f, 23.0f, 23.0f, 18.1f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9f, 18.1f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconCheckCircleLine!!
    }

private var _iconCheckCircleLine: ImageVector? = null
