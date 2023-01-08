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

public val MLDIcon.IconUserCheck: ImageVector
    get() {
        if (_iconUserCheck != null) {
            return _iconUserCheck!!
        }
        _iconUserCheck = Builder(name = "IconUserCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.436f, 8.455f)
                curveTo(23.3524f, 8.3714f, 23.2532f, 8.3051f, 23.144f, 8.2598f)
                curveTo(23.0348f, 8.2146f, 22.9177f, 8.1913f, 22.7995f, 8.1913f)
                curveTo(22.6813f, 8.1913f, 22.5642f, 8.2146f, 22.455f, 8.2598f)
                curveTo(22.3458f, 8.3051f, 22.2466f, 8.3714f, 22.163f, 8.455f)
                lineTo(18.982f, 11.637f)
                lineTo(17.436f, 10.091f)
                curveTo(17.2672f, 9.9222f, 17.0382f, 9.8273f, 16.7995f, 9.8273f)
                curveTo(16.5608f, 9.8273f, 16.3318f, 9.9222f, 16.163f, 10.091f)
                curveTo(15.9942f, 10.2598f, 15.8994f, 10.4888f, 15.8994f, 10.7275f)
                curveTo(15.8994f, 10.9662f, 15.9942f, 11.1952f, 16.163f, 11.364f)
                lineTo(18.981f, 14.182f)
                lineTo(23.435f, 9.728f)
                curveTo(23.5186f, 9.6444f, 23.5849f, 9.5452f, 23.6302f, 9.436f)
                curveTo(23.6754f, 9.3268f, 23.6987f, 9.2097f, 23.6987f, 9.0915f)
                curveTo(23.6987f, 8.9733f, 23.6754f, 8.8562f, 23.6302f, 8.747f)
                curveTo(23.5849f, 8.6378f, 23.5186f, 8.5386f, 23.435f, 8.455f)
                moveTo(10.0f, 11.456f)
                curveTo(11.1548f, 11.456f, 12.2622f, 10.9973f, 13.0787f, 10.1807f)
                curveTo(13.8953f, 9.3642f, 14.354f, 8.2568f, 14.354f, 7.102f)
                curveTo(14.354f, 5.9472f, 13.8953f, 4.8398f, 13.0787f, 4.0233f)
                curveTo(12.2622f, 3.2067f, 11.1548f, 2.748f, 10.0f, 2.748f)
                curveTo(8.8453f, 2.748f, 7.7378f, 3.2067f, 6.9213f, 4.0233f)
                curveTo(6.1047f, 4.8398f, 5.646f, 5.9472f, 5.646f, 7.102f)
                curveTo(5.646f, 8.2568f, 6.1047f, 9.3642f, 6.9213f, 10.1807f)
                curveTo(7.7378f, 10.9973f, 8.8453f, 11.456f, 10.0f, 11.456f)
                moveTo(10.0f, 12.788f)
                curveTo(3.731f, 12.788f, 1.294f, 16.777f, 1.294f, 18.633f)
                curveTo(1.294f, 20.488f, 6.483f, 20.982f, 10.0f, 20.982f)
                curveTo(13.517f, 20.982f, 18.706f, 20.488f, 18.706f, 18.632f)
                curveTo(18.706f, 16.777f, 16.269f, 12.788f, 10.0f, 12.788f)
            }
        }
        .build()
        return _iconUserCheck!!
    }

private var _iconUserCheck: ImageVector? = null
