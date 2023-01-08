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

public val MLDIcon.IconHeart: ImageVector
    get() {
        if (_iconHeart != null) {
            return _iconHeart!!
        }
        _iconHeart = Builder(name = "IconHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.904f, 21.527f)
                curveTo(11.57f, 21.967f, 12.429f, 21.967f, 13.094f, 21.527f)
                curveTo(15.209f, 20.131f, 19.814f, 16.794f, 21.798f, 13.06f)
                curveTo(24.413f, 8.134f, 21.342f, 3.221f, 17.282f, 3.221f)
                curveTo(14.968f, 3.221f, 13.576f, 4.43f, 12.806f, 5.469f)
                curveTo(12.7135f, 5.5963f, 12.5922f, 5.6998f, 12.4521f, 5.7712f)
                curveTo(12.3119f, 5.8426f, 12.1568f, 5.8798f, 11.9995f, 5.8798f)
                curveTo(11.8422f, 5.8798f, 11.6871f, 5.8426f, 11.5469f, 5.7712f)
                curveTo(11.4068f, 5.6998f, 11.2855f, 5.5963f, 11.193f, 5.469f)
                curveTo(10.423f, 4.43f, 9.031f, 3.221f, 6.717f, 3.221f)
                curveTo(2.657f, 3.221f, -0.414f, 8.134f, 2.202f, 13.06f)
                curveTo(4.184f, 16.794f, 8.791f, 20.131f, 10.904f, 21.527f)
            }
        }
        .build()
        return _iconHeart!!
    }

private var _iconHeart: ImageVector? = null
