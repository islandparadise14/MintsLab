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

public val MLDIcon.IconDots: ImageVector
    get() {
        if (_iconDots != null) {
            return _iconDots!!
        }
        _iconDots = Builder(name = "IconDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.23f, 14.0f)
                curveTo(4.9673f, 13.9999f, 4.7072f, 13.9481f, 4.4645f, 13.8475f)
                curveTo(4.2218f, 13.7469f, 4.0013f, 13.5995f, 3.8156f, 13.4137f)
                curveTo(3.6299f, 13.2279f, 3.4826f, 13.0073f, 3.3821f, 12.7646f)
                curveTo(3.2816f, 12.5219f, 3.2299f, 12.2617f, 3.23f, 11.999f)
                curveTo(3.2301f, 11.7363f, 3.2819f, 11.4762f, 3.3825f, 11.2335f)
                curveTo(3.4831f, 10.9908f, 3.6305f, 10.7703f, 3.8163f, 10.5846f)
                curveTo(4.0021f, 10.3989f, 4.2227f, 10.2516f, 4.4654f, 10.1511f)
                curveTo(4.7081f, 10.0506f, 4.9683f, 9.9989f, 5.231f, 9.999f)
                curveTo(5.7616f, 9.9991f, 6.2703f, 10.21f, 6.6454f, 10.5853f)
                curveTo(7.0205f, 10.9605f, 7.2311f, 11.4694f, 7.231f, 12.0f)
                curveTo(7.2309f, 12.5306f, 7.02f, 13.0393f, 6.6447f, 13.4144f)
                curveTo(6.2695f, 13.7895f, 5.7606f, 14.0001f, 5.23f, 14.0f)
                moveTo(12.001f, 14.0f)
                curveTo(11.4706f, 14.0f, 10.9619f, 13.7893f, 10.5868f, 13.4142f)
                curveTo(10.2117f, 13.0391f, 10.001f, 12.5304f, 10.001f, 12.0f)
                curveTo(10.001f, 11.4696f, 10.2117f, 10.9609f, 10.5868f, 10.5858f)
                curveTo(10.9619f, 10.2107f, 11.4706f, 10.0f, 12.001f, 10.0f)
                curveTo(12.5314f, 10.0f, 13.0401f, 10.2107f, 13.4152f, 10.5858f)
                curveTo(13.7903f, 10.9609f, 14.001f, 11.4696f, 14.001f, 12.0f)
                curveTo(14.001f, 12.5304f, 13.7903f, 13.0391f, 13.4152f, 13.4142f)
                curveTo(13.0401f, 13.7893f, 12.5314f, 14.0f, 12.001f, 14.0f)
                close()
                moveTo(18.771f, 14.0f)
                curveTo(18.5083f, 13.9999f, 18.2482f, 13.9481f, 18.0055f, 13.8475f)
                curveTo(17.7628f, 13.7469f, 17.5423f, 13.5995f, 17.3566f, 13.4137f)
                curveTo(17.1709f, 13.2279f, 17.0236f, 13.0073f, 16.9231f, 12.7646f)
                curveTo(16.8226f, 12.5219f, 16.7709f, 12.2617f, 16.771f, 11.999f)
                curveTo(16.7711f, 11.7363f, 16.8229f, 11.4762f, 16.9235f, 11.2335f)
                curveTo(17.0241f, 10.9908f, 17.1715f, 10.7703f, 17.3573f, 10.5846f)
                curveTo(17.5431f, 10.3989f, 17.7637f, 10.2516f, 18.0064f, 10.1511f)
                curveTo(18.2491f, 10.0506f, 18.5093f, 9.9989f, 18.772f, 9.999f)
                curveTo(19.3026f, 9.9991f, 19.8113f, 10.21f, 20.1864f, 10.5853f)
                curveTo(20.5615f, 10.9605f, 20.7721f, 11.4694f, 20.772f, 12.0f)
                curveTo(20.7719f, 12.5306f, 20.561f, 13.0393f, 20.1857f, 13.4144f)
                curveTo(19.8104f, 13.7895f, 19.3016f, 14.0001f, 18.771f, 14.0f)
            }
        }
        .build()
        return _iconDots!!
    }

private var _iconDots: ImageVector? = null
