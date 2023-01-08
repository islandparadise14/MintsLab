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

public val MLDIcon.IconHeadphone: ImageVector
    get() {
        if (_iconHeadphone != null) {
            return _iconHeadphone!!
        }
        _iconHeadphone = Builder(name = "IconHeadphone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.255f, 14.251f)
                curveTo(23.255f, 11.99f, 21.695f, 10.102f, 19.6f, 9.564f)
                verticalLineTo(8.9f)
                curveTo(19.6f, 4.709f, 16.191f, 1.3f, 12.0f, 1.3f)
                curveTo(7.81f, 1.3f, 4.401f, 4.709f, 4.401f, 8.9f)
                verticalLineTo(9.564f)
                curveTo(2.305f, 10.102f, 0.745f, 11.99f, 0.745f, 14.251f)
                curveTo(0.7463f, 15.5384f, 1.2584f, 16.7727f, 2.1688f, 17.6829f)
                curveTo(3.0792f, 18.5931f, 4.3136f, 19.1049f, 5.601f, 19.106f)
                curveTo(5.9193f, 19.106f, 6.2245f, 18.9796f, 6.4495f, 18.7545f)
                curveTo(6.6746f, 18.5295f, 6.801f, 18.2243f, 6.801f, 17.906f)
                verticalLineTo(8.9f)
                curveTo(6.801f, 6.033f, 9.133f, 3.7f, 12.0f, 3.7f)
                curveTo(14.867f, 3.7f, 17.2f, 6.033f, 17.2f, 8.9f)
                verticalLineTo(17.409f)
                lineTo(14.66f, 19.949f)
                curveTo(14.5488f, 20.0606f, 14.4166f, 20.1491f, 14.2711f, 20.2093f)
                curveTo(14.1256f, 20.2696f, 13.9695f, 20.3004f, 13.812f, 20.3f)
                horizontalLineTo(11.889f)
                curveTo(11.5707f, 20.3f, 11.2655f, 20.4264f, 11.0405f, 20.6515f)
                curveTo(10.8154f, 20.8765f, 10.689f, 21.1817f, 10.689f, 21.5f)
                curveTo(10.689f, 21.8183f, 10.8154f, 22.1235f, 11.0405f, 22.3485f)
                curveTo(11.2655f, 22.5736f, 11.5707f, 22.7f, 11.889f, 22.7f)
                horizontalLineTo(13.812f)
                curveTo(14.774f, 22.7f, 15.678f, 22.326f, 16.358f, 21.646f)
                lineTo(18.953f, 19.05f)
                curveTo(21.367f, 18.772f, 23.255f, 16.739f, 23.255f, 14.251f)
            }
        }
        .build()
        return _iconHeadphone!!
    }

private var _iconHeadphone: ImageVector? = null
