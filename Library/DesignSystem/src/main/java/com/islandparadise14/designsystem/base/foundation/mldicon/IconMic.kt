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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconMic: ImageVector
    get() {
        if (_iconMic != null) {
            return _iconMic!!
        }
        _iconMic = Builder(name = "IconMic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 0.612f)
                    curveTo(10.8065f, 0.612f, 9.6619f, 1.0861f, 8.818f, 1.93f)
                    curveTo(7.9741f, 2.7739f, 7.5f, 3.9185f, 7.5f, 5.112f)
                    verticalLineTo(11.315f)
                    curveTo(7.5f, 12.5085f, 7.9741f, 13.6531f, 8.818f, 14.497f)
                    curveTo(9.6619f, 15.3409f, 10.8065f, 15.815f, 12.0f, 15.815f)
                    curveTo(13.1935f, 15.815f, 14.3381f, 15.3409f, 15.182f, 14.497f)
                    curveTo(16.0259f, 13.6531f, 16.5f, 12.5085f, 16.5f, 11.315f)
                    verticalLineTo(5.112f)
                    curveTo(16.5f, 3.9185f, 16.0259f, 2.7739f, 15.182f, 1.93f)
                    curveTo(14.3381f, 1.0861f, 13.1935f, 0.612f, 12.0f, 0.612f)
                }
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.601f, 11.315f)
                    curveTo(20.601f, 11.0498f, 20.4956f, 10.7954f, 20.3081f, 10.6079f)
                    curveTo(20.1206f, 10.4204f, 19.8662f, 10.315f, 19.601f, 10.315f)
                    curveTo(19.3358f, 10.315f, 19.0814f, 10.4204f, 18.8939f, 10.6079f)
                    curveTo(18.7064f, 10.7954f, 18.601f, 11.0498f, 18.601f, 11.315f)
                    curveTo(18.5991f, 13.0651f, 17.9031f, 14.743f, 16.6656f, 15.9806f)
                    curveTo(15.428f, 17.2181f, 13.7501f, 17.9141f, 12.0f, 17.916f)
                    curveTo(10.2502f, 17.9139f, 8.5727f, 17.2178f, 7.3354f, 15.9806f)
                    curveTo(6.0981f, 14.7433f, 5.4021f, 13.0658f, 5.4f, 11.316f)
                    curveTo(5.4f, 11.0508f, 5.2946f, 10.7964f, 5.1071f, 10.6089f)
                    curveTo(4.9196f, 10.4214f, 4.6652f, 10.316f, 4.4f, 10.316f)
                    curveTo(4.1348f, 10.316f, 3.8804f, 10.4214f, 3.6929f, 10.6089f)
                    curveTo(3.5054f, 10.7964f, 3.4f, 11.0508f, 3.4f, 11.316f)
                    curveTo(3.4f, 15.719f, 6.728f, 19.356f, 11.0f, 19.853f)
                    verticalLineTo(23.0f)
                    curveTo(11.0f, 23.2652f, 11.1054f, 23.5196f, 11.2929f, 23.7071f)
                    curveTo(11.4804f, 23.8946f, 11.7348f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.2652f, 24.0f, 12.5196f, 23.8946f, 12.7071f, 23.7071f)
                    curveTo(12.8946f, 23.5196f, 13.0f, 23.2652f, 13.0f, 23.0f)
                    verticalLineTo(19.853f)
                    curveTo(17.273f, 19.355f, 20.601f, 15.719f, 20.601f, 11.315f)
                }
            }
        }
        .build()
        return _iconMic!!
    }

private var _iconMic: ImageVector? = null
