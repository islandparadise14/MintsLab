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

public val Iconography.IconArrowDecrease: ImageVector
    get() {
        if (_iconArrowDecrease != null) {
            return _iconArrowDecrease!!
        }
        _iconArrowDecrease = Builder(name = "IconArrowDecrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.541f, 7.0f)
                curveTo(2.041f, 7.0f, 1.841f, 7.6f, 2.1409f, 8.0f)
                lineTo(10.941f, 18.5f)
                curveTo(11.441f, 19.1f, 12.341f, 19.1f, 12.841f, 18.5f)
                lineTo(21.941f, 8.0f)
                curveTo(22.241f, 7.6f, 21.941f, 7.0f, 21.541f, 7.0f)
                horizontalLineTo(2.541f)
                close()
            }
        }
        .build()
        return _iconArrowDecrease!!
    }

private var _iconArrowDecrease: ImageVector? = null
