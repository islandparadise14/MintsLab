package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconEyeOn: ImageVector
    get() {
        if (_iconEyeOn != null) {
            return _iconEyeOn!!
        }
        _iconEyeOn = Builder(name = "IconEyeOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.125f, 9.225f)
                curveTo(10.525f, 9.225f, 9.225f, 10.525f, 9.225f, 12.125f)
                curveTo(9.225f, 13.725f, 10.525f, 15.025f, 12.125f, 15.025f)
                curveTo(13.725f, 15.025f, 15.025f, 13.725f, 15.025f, 12.125f)
                curveTo(15.025f, 10.525f, 13.725f, 9.225f, 12.125f, 9.225f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.125f, 17.125f)
                curveTo(9.325f, 17.125f, 7.125f, 14.825f, 7.125f, 12.125f)
                curveTo(7.125f, 9.425f, 9.425f, 7.125f, 12.125f, 7.125f)
                curveTo(14.825f, 7.125f, 17.125f, 9.425f, 17.125f, 12.125f)
                curveTo(17.125f, 14.825f, 14.925f, 17.125f, 12.125f, 17.125f)
                close()
                moveTo(23.125f, 10.825f)
                curveTo(20.525f, 6.825f, 16.425f, 4.425f, 12.125f, 4.425f)
                curveTo(7.825f, 4.425f, 3.725f, 6.825f, 1.125f, 10.825f)
                curveTo(0.625f, 11.625f, 0.625f, 12.625f, 1.125f, 13.425f)
                curveTo(3.725f, 17.425f, 7.825f, 19.825f, 12.125f, 19.825f)
                curveTo(16.425f, 19.825f, 20.525f, 17.425f, 23.125f, 13.425f)
                curveTo(23.725f, 12.625f, 23.725f, 11.625f, 23.125f, 10.825f)
                close()
            }
        }
        .build()
        return _iconEyeOn!!
    }

private var _iconEyeOn: ImageVector? = null
