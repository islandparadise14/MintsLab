package com.islandparadise14.designsystem.base.foundation.mldicon

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
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconStackUp: ImageVector
    get() {
        if (_iconStackUp != null) {
            return _iconStackUp!!
        }
        _iconStackUp = Builder(name = "IconStackUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 18.5f)
                curveTo(7.879f, 18.5f, 4.397f, 17.395f, 2.377f, 15.654f)
                curveTo(2.138f, 16.083f, 2.0f, 16.533f, 2.0f, 17.0f)
                curveTo(2.0f, 19.762f, 6.478f, 22.0f, 12.0f, 22.0f)
                curveTo(17.522f, 22.0f, 22.0f, 19.762f, 22.0f, 17.0f)
                curveTo(22.0f, 16.533f, 21.862f, 16.083f, 21.623f, 15.654f)
                curveTo(19.604f, 17.395f, 16.121f, 18.5f, 12.0f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 13.5f)
                curveTo(7.879f, 13.5f, 4.397f, 12.395f, 2.377f, 10.654f)
                curveTo(2.138f, 11.083f, 2.0f, 11.533f, 2.0f, 12.0f)
                curveTo(2.0f, 14.762f, 6.478f, 17.0f, 12.0f, 17.0f)
                curveTo(17.522f, 17.0f, 22.0f, 14.762f, 22.0f, 12.0f)
                curveTo(22.0f, 11.533f, 21.862f, 11.083f, 21.623f, 10.654f)
                curveTo(19.604f, 12.395f, 16.121f, 13.5f, 12.0f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.0f)
                curveTo(17.522f, 12.0f, 22.0f, 9.762f, 22.0f, 7.0f)
                curveTo(22.0f, 4.239f, 17.522f, 2.0f, 12.0f, 2.0f)
                curveTo(6.478f, 2.0f, 2.0f, 4.239f, 2.0f, 7.0f)
                curveTo(2.0f, 9.762f, 6.478f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _iconStackUp!!
    }

private var _iconStackUp: ImageVector? = null
