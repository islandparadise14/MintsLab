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

public val MLDIcon.IconMap: ImageVector
    get() {
        if (_iconMap != null) {
            return _iconMap!!
        }
        _iconMap = Builder(name = "IconMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.36f, 20.84f)
                lineTo(18.923f, 16.03f)
                curveTo(18.6391f, 15.6358f, 18.2274f, 15.3521f, 17.758f, 15.227f)
                lineTo(17.704f, 15.292f)
                curveTo(16.809f, 16.352f, 15.671f, 17.542f, 14.121f, 19.04f)
                curveTo(13.5525f, 19.59f, 12.792f, 19.8967f, 12.001f, 19.895f)
                curveTo(11.2104f, 19.8972f, 10.4501f, 19.5908f, 9.882f, 19.041f)
                curveTo(8.3f, 17.511f, 7.144f, 16.298f, 6.242f, 15.224f)
                curveTo(5.7684f, 15.347f, 5.3527f, 15.6317f, 5.067f, 16.029f)
                lineTo(1.63f, 20.84f)
                curveTo(1.5179f, 20.997f, 1.4513f, 21.1819f, 1.4374f, 21.3743f)
                curveTo(1.4235f, 21.5667f, 1.4628f, 21.7593f, 1.5512f, 21.9308f)
                curveTo(1.6395f, 22.1023f, 1.7734f, 22.2462f, 1.9381f, 22.3466f)
                curveTo(2.1029f, 22.447f, 2.2921f, 22.5001f, 2.485f, 22.5f)
                horizontalLineTo(21.505f)
                curveTo(22.359f, 22.5f, 22.855f, 21.535f, 22.359f, 20.84f)
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.302f)
                curveTo(12.2663f, 6.2959f, 12.5312f, 6.3431f, 12.7791f, 6.4408f)
                curveTo(13.0269f, 6.5385f, 13.2527f, 6.6847f, 13.4433f, 6.8708f)
                curveTo(13.6339f, 7.057f, 13.7853f, 7.2794f, 13.8888f, 7.5249f)
                curveTo(13.9922f, 7.7704f, 14.0456f, 8.0341f, 14.0457f, 8.3005f)
                curveTo(14.0458f, 8.5669f, 13.9927f, 8.8306f, 13.8895f, 9.0762f)
                curveTo(13.7863f, 9.3218f, 13.6351f, 9.5443f, 13.4447f, 9.7307f)
                curveTo(13.2544f, 9.9171f, 13.0287f, 10.0635f, 12.7809f, 10.1614f)
                curveTo(12.5332f, 10.2594f, 12.2683f, 10.3068f, 12.002f, 10.301f)
                curveTo(11.4716f, 10.3011f, 10.9628f, 10.0905f, 10.5876f, 9.7156f)
                curveTo(10.2125f, 9.3406f, 10.0016f, 8.8319f, 10.0015f, 8.3015f)
                curveTo(10.0014f, 7.7711f, 10.212f, 7.2623f, 10.5869f, 6.8871f)
                curveTo(10.9619f, 6.512f, 11.4706f, 6.3011f, 12.001f, 6.301f)
                moveTo(11.273f, 17.603f)
                curveTo(11.4693f, 17.7907f, 11.7306f, 17.8954f, 12.0022f, 17.8953f)
                curveTo(12.2738f, 17.8951f, 12.5349f, 17.79f, 12.731f, 17.602f)
                curveTo(17.349f, 13.14f, 18.803f, 10.902f, 18.803f, 8.302f)
                curveTo(18.803f, 3.898f, 14.616f, 0.471f, 10.006f, 1.784f)
                curveTo(7.096f, 2.614f, 5.2f, 5.276f, 5.2f, 8.302f)
                curveTo(5.2f, 10.904f, 6.655f, 13.141f, 11.273f, 17.602f)
            }
        }
        .build()
        return _iconMap!!
    }

private var _iconMap: ImageVector? = null
