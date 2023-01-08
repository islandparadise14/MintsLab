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

public val MLDIcon.IconGraphBarUp: ImageVector
    get() {
        if (_iconGraphBarUp != null) {
            return _iconGraphBarUp!!
        }
        _iconGraphBarUp = Builder(name = "IconGraphBarUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.737f, 21.25f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 21.25f, 3.4804f, 21.1446f, 3.2929f, 20.9571f)
                curveTo(3.1054f, 20.7696f, 3.0f, 20.5152f, 3.0f, 20.25f)
                verticalLineTo(13.724f)
                curveTo(3.0f, 13.4588f, 3.1054f, 13.2044f, 3.2929f, 13.0169f)
                curveTo(3.4804f, 12.8294f, 3.7348f, 12.724f, 4.0f, 12.724f)
                horizontalLineTo(6.737f)
                curveTo(7.0022f, 12.724f, 7.2566f, 12.8294f, 7.4441f, 13.0169f)
                curveTo(7.6316f, 13.2044f, 7.737f, 13.4588f, 7.737f, 13.724f)
                verticalLineTo(20.25f)
                curveTo(7.737f, 20.5152f, 7.6316f, 20.7696f, 7.4441f, 20.9571f)
                curveTo(7.2566f, 21.1446f, 7.0022f, 21.25f, 6.737f, 21.25f)
                close()
                moveTo(13.369f, 21.25f)
                horizontalLineTo(10.632f)
                curveTo(10.3668f, 21.25f, 10.1124f, 21.1446f, 9.9249f, 20.9571f)
                curveTo(9.7374f, 20.7696f, 9.632f, 20.5152f, 9.632f, 20.25f)
                verticalLineTo(8.987f)
                curveTo(9.632f, 8.7218f, 9.7374f, 8.4674f, 9.9249f, 8.2799f)
                curveTo(10.1124f, 8.0924f, 10.3668f, 7.987f, 10.632f, 7.987f)
                horizontalLineTo(13.369f)
                curveTo(13.6342f, 7.987f, 13.8886f, 8.0924f, 14.0761f, 8.2799f)
                curveTo(14.2636f, 8.4674f, 14.369f, 8.7218f, 14.369f, 8.987f)
                verticalLineTo(20.25f)
                curveTo(14.369f, 20.5152f, 14.2636f, 20.7696f, 14.0761f, 20.9571f)
                curveTo(13.8886f, 21.1446f, 13.6342f, 21.25f, 13.369f, 21.25f)
                close()
                moveTo(20.0f, 21.25f)
                horizontalLineTo(17.263f)
                curveTo(16.9978f, 21.25f, 16.7434f, 21.1446f, 16.5559f, 20.9571f)
                curveTo(16.3684f, 20.7696f, 16.263f, 20.5152f, 16.263f, 20.25f)
                verticalLineTo(4.25f)
                curveTo(16.263f, 3.9848f, 16.3684f, 3.7304f, 16.5559f, 3.5429f)
                curveTo(16.7434f, 3.3554f, 16.9978f, 3.25f, 17.263f, 3.25f)
                horizontalLineTo(20.0f)
                curveTo(20.2652f, 3.25f, 20.5196f, 3.3554f, 20.7071f, 3.5429f)
                curveTo(20.8946f, 3.7304f, 21.0f, 3.9848f, 21.0f, 4.25f)
                verticalLineTo(20.25f)
                curveTo(21.0f, 20.5152f, 20.8946f, 20.7696f, 20.7071f, 20.9571f)
                curveTo(20.5196f, 21.1446f, 20.2652f, 21.25f, 20.0f, 21.25f)
                close()
            }
        }
        .build()
        return _iconGraphBarUp!!
    }

private var _iconGraphBarUp: ImageVector? = null
