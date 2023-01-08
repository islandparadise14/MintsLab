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

public val MLDIcon.IconLock: ImageVector
    get() {
        if (_iconLock != null) {
            return _iconLock!!
        }
        _iconLock = Builder(name = "IconLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.9f, 14.075f)
                verticalLineTo(16.274f)
                curveTo(12.9f, 16.5127f, 12.8052f, 16.7416f, 12.6364f, 16.9104f)
                curveTo(12.4676f, 17.0792f, 12.2387f, 17.174f, 12.0f, 17.174f)
                curveTo(11.7613f, 17.174f, 11.5324f, 17.0792f, 11.3636f, 16.9104f)
                curveTo(11.1948f, 16.7416f, 11.1f, 16.5127f, 11.1f, 16.274f)
                verticalLineTo(14.075f)
                curveTo(10.827f, 13.9182f, 10.6002f, 13.6924f, 10.4422f, 13.4201f)
                curveTo(10.2842f, 13.1478f, 10.2007f, 12.8388f, 10.2f, 12.524f)
                curveTo(10.2111f, 12.0541f, 10.4055f, 11.6072f, 10.7418f, 11.2787f)
                curveTo(11.0781f, 10.9503f, 11.5295f, 10.7664f, 11.9995f, 10.7664f)
                curveTo(12.4695f, 10.7664f, 12.9209f, 10.9503f, 13.2572f, 11.2787f)
                curveTo(13.5935f, 11.6072f, 13.7879f, 12.0541f, 13.799f, 12.524f)
                curveTo(13.799f, 13.189f, 13.435f, 13.763f, 12.9f, 14.075f)
                verticalLineTo(14.075f)
                close()
                moveTo(8.82f, 6.499f)
                curveTo(8.8211f, 5.656f, 9.1565f, 4.8479f, 9.7526f, 4.2519f)
                curveTo(10.3488f, 3.656f, 11.157f, 3.3208f, 12.0f, 3.32f)
                curveTo(12.8429f, 3.3208f, 13.651f, 3.656f, 14.247f, 4.252f)
                curveTo(14.843f, 4.848f, 15.1782f, 5.6561f, 15.179f, 6.499f)
                horizontalLineTo(8.82f)
                close()
                moveTo(18.599f, 6.499f)
                horizontalLineTo(17.179f)
                curveTo(17.1777f, 5.1259f, 16.6316f, 3.8093f, 15.6606f, 2.8384f)
                curveTo(14.6897f, 1.8674f, 13.3731f, 1.3213f, 12.0f, 1.32f)
                curveTo(10.6268f, 1.3213f, 9.3101f, 1.8674f, 8.339f, 2.8383f)
                curveTo(7.3679f, 3.8092f, 6.8216f, 5.1258f, 6.82f, 6.499f)
                horizontalLineTo(5.4f)
                curveTo(4.7635f, 6.499f, 4.153f, 6.7519f, 3.7029f, 7.2019f)
                curveTo(3.2529f, 7.652f, 3.0f, 8.2625f, 3.0f, 8.899f)
                verticalLineTo(19.099f)
                curveTo(3.0f, 19.7355f, 3.2529f, 20.346f, 3.7029f, 20.7961f)
                curveTo(4.153f, 21.2461f, 4.7635f, 21.499f, 5.4f, 21.499f)
                horizontalLineTo(18.599f)
                curveTo(18.9143f, 21.4991f, 19.2265f, 21.4372f, 19.5177f, 21.3166f)
                curveTo(19.809f, 21.196f, 20.0737f, 21.0193f, 20.2967f, 20.7964f)
                curveTo(20.5197f, 20.5735f, 20.6965f, 20.3089f, 20.8172f, 20.0177f)
                curveTo(20.9379f, 19.7264f, 21.0f, 19.4143f, 21.0f, 19.099f)
                verticalLineTo(8.899f)
                curveTo(21.0f, 8.5837f, 20.9379f, 8.2716f, 20.8172f, 7.9803f)
                curveTo(20.6965f, 7.6891f, 20.5197f, 7.4245f, 20.2967f, 7.2016f)
                curveTo(20.0737f, 6.9787f, 19.809f, 6.8019f, 19.5177f, 6.6814f)
                curveTo(19.2265f, 6.5609f, 18.9143f, 6.4989f, 18.599f, 6.499f)
                verticalLineTo(6.499f)
                close()
            }
        }
        .build()
        return _iconLock!!
    }

private var _iconLock: ImageVector? = null
