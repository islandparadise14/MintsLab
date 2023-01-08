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

public val MLDIcon.IconArrowUpLimit: ImageVector
    get() {
        if (_iconArrowUpLimit != null) {
            return _iconArrowUpLimit!!
        }
        _iconArrowUpLimit = Builder(name = "IconArrowUpLimit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.766f, 6.604f)
                curveTo(12.6115f, 6.4515f, 12.4156f, 6.3477f, 12.2026f, 6.3056f)
                curveTo(11.9896f, 6.2634f, 11.7689f, 6.2848f, 11.568f, 6.367f)
                curveTo(11.4344f, 6.422f, 11.3128f, 6.5025f, 11.21f, 6.604f)
                lineTo(5.504f, 12.31f)
                curveTo(5.3021f, 12.5171f, 5.1899f, 12.7954f, 5.1918f, 13.0847f)
                curveTo(5.1936f, 13.3739f, 5.3092f, 13.6508f, 5.5137f, 13.8553f)
                curveTo(5.7181f, 14.0599f, 5.9949f, 14.1757f, 6.2842f, 14.1777f)
                curveTo(6.5734f, 14.1797f, 6.8517f, 14.0677f, 7.059f, 13.866f)
                lineTo(10.888f, 10.036f)
                verticalLineTo(21.381f)
                curveTo(10.888f, 21.6727f, 11.0039f, 21.9525f, 11.2102f, 22.1588f)
                curveTo(11.4165f, 22.3651f, 11.6963f, 22.481f, 11.988f, 22.481f)
                curveTo(12.2797f, 22.481f, 12.5595f, 22.3651f, 12.7658f, 22.1588f)
                curveTo(12.9721f, 21.9525f, 13.088f, 21.6727f, 13.088f, 21.381f)
                verticalLineTo(10.038f)
                lineTo(16.917f, 13.867f)
                curveTo(17.132f, 14.082f, 17.413f, 14.189f, 17.695f, 14.189f)
                curveTo(17.9126f, 14.1891f, 18.1254f, 14.1246f, 18.3063f, 14.0037f)
                curveTo(18.4873f, 13.8829f, 18.6283f, 13.7111f, 18.7116f, 13.51f)
                curveTo(18.7949f, 13.309f, 18.8167f, 13.0877f, 18.7742f, 12.8743f)
                curveTo(18.7317f, 12.6609f, 18.6269f, 12.4648f, 18.473f, 12.311f)
                lineTo(12.766f, 6.604f)
                verticalLineTo(6.604f)
                close()
                moveTo(21.38f, 2.1f)
                horizontalLineTo(2.596f)
                curveTo(2.3043f, 2.1f, 2.0245f, 2.2159f, 1.8182f, 2.4222f)
                curveTo(1.6119f, 2.6285f, 1.496f, 2.9083f, 1.496f, 3.2f)
                curveTo(1.496f, 3.4917f, 1.6119f, 3.7715f, 1.8182f, 3.9778f)
                curveTo(2.0245f, 4.1841f, 2.3043f, 4.3f, 2.596f, 4.3f)
                horizontalLineTo(21.381f)
                curveTo(21.6727f, 4.3f, 21.9525f, 4.1841f, 22.1588f, 3.9778f)
                curveTo(22.3651f, 3.7715f, 22.481f, 3.4917f, 22.481f, 3.2f)
                curveTo(22.481f, 2.9083f, 22.3651f, 2.6285f, 22.1588f, 2.4222f)
                curveTo(21.9525f, 2.2159f, 21.6727f, 2.1f, 21.381f, 2.1f)
            }
        }
        .build()
        return _iconArrowUpLimit!!
    }

private var _iconArrowUpLimit: ImageVector? = null
