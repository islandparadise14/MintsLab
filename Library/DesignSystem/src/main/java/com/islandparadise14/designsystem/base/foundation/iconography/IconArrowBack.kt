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

public val Iconography.IconArrowBack: ImageVector
    get() {
        if (_iconArrowBack != null) {
            return _iconArrowBack!!
        }
        _iconArrowBack = Builder(name = "IconArrowBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.966f, 10.8f)
                horizontalLineTo(6.93f)
                lineTo(12.381f, 5.349f)
                curveTo(12.4939f, 5.2379f, 12.5837f, 5.1055f, 12.6452f, 4.9596f)
                curveTo(12.7068f, 4.8136f, 12.7388f, 4.6569f, 12.7394f, 4.4985f)
                curveTo(12.74f, 4.3401f, 12.7093f, 4.1831f, 12.649f, 4.0366f)
                curveTo(12.5887f, 3.8902f, 12.4999f, 3.7571f, 12.3879f, 3.6451f)
                curveTo(12.2759f, 3.5331f, 12.1428f, 3.4443f, 11.9964f, 3.384f)
                curveTo(11.8499f, 3.3237f, 11.6929f, 3.293f, 11.5345f, 3.2936f)
                curveTo(11.3761f, 3.2943f, 11.2194f, 3.3263f, 11.0734f, 3.3878f)
                curveTo(10.9274f, 3.4493f, 10.7951f, 3.5391f, 10.684f, 3.652f)
                lineTo(3.184f, 11.152f)
                curveTo(3.181f, 11.154f, 3.18f, 11.158f, 3.177f, 11.161f)
                curveTo(3.0125f, 11.3289f, 2.9009f, 11.5414f, 2.8561f, 11.7722f)
                curveTo(2.8113f, 12.0029f, 2.8353f, 12.2417f, 2.925f, 12.459f)
                curveTo(2.985f, 12.602f, 3.07f, 12.729f, 3.177f, 12.839f)
                lineTo(3.184f, 12.849f)
                lineTo(10.684f, 20.349f)
                curveTo(10.919f, 20.583f, 11.226f, 20.699f, 11.532f, 20.699f)
                curveTo(11.7693f, 20.699f, 12.0012f, 20.6286f, 12.1985f, 20.4968f)
                curveTo(12.3958f, 20.3651f, 12.5496f, 20.1777f, 12.6405f, 19.9585f)
                curveTo(12.7313f, 19.7394f, 12.7552f, 19.4982f, 12.709f, 19.2654f)
                curveTo(12.6628f, 19.0327f, 12.5487f, 18.8189f, 12.381f, 18.651f)
                lineTo(6.931f, 13.2f)
                horizontalLineTo(20.967f)
                curveTo(21.2853f, 13.2f, 21.5905f, 13.0736f, 21.8155f, 12.8485f)
                curveTo(22.0406f, 12.6235f, 22.167f, 12.3183f, 22.167f, 12.0f)
                curveTo(22.167f, 11.6817f, 22.0406f, 11.3765f, 21.8155f, 11.1515f)
                curveTo(21.5905f, 10.9264f, 21.2853f, 10.8f, 20.967f, 10.8f)
            }
        }
        .build()
        return _iconArrowBack!!
    }

private var _iconArrowBack: ImageVector? = null
