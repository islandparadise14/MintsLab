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

public val Iconography.IconArrowIncrease: ImageVector
    get() {
        if (_iconArrowIncrease != null) {
            return _iconArrowIncrease!!
        }
        _iconArrowIncrease = Builder(name = "IconArrowIncrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.541f, 16.95f)
                curveTo(2.041f, 16.95f, 1.841f, 16.35f, 2.1409f, 15.95f)
                lineTo(10.941f, 5.45f)
                curveTo(11.441f, 4.85f, 12.341f, 4.85f, 12.841f, 5.45f)
                lineTo(21.941f, 15.95f)
                curveTo(22.241f, 16.35f, 21.941f, 16.95f, 21.541f, 16.95f)
                horizontalLineTo(2.541f)
                close()
            }
        }
        .build()
        return _iconArrowIncrease!!
    }

private var _iconArrowIncrease: ImageVector? = null
