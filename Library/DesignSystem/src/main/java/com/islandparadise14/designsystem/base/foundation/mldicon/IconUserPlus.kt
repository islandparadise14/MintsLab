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

public val MLDIcon.IconUserPlus: ImageVector
    get() {
        if (_iconUserPlus != null) {
            return _iconUserPlus!!
        }
        _iconUserPlus = Builder(name = "IconUserPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 10.1f)
                horizontalLineTo(20.9f)
                verticalLineTo(8.0f)
                curveTo(20.8922f, 7.7666f, 20.794f, 7.5454f, 20.6262f, 7.3831f)
                curveTo(20.4584f, 7.2207f, 20.234f, 7.13f, 20.0005f, 7.13f)
                curveTo(19.767f, 7.13f, 19.5426f, 7.2207f, 19.3748f, 7.3831f)
                curveTo(19.207f, 7.5454f, 19.1088f, 7.7666f, 19.101f, 8.0f)
                verticalLineTo(10.1f)
                horizontalLineTo(17.0f)
                curveTo(16.7613f, 10.1f, 16.5324f, 10.1948f, 16.3636f, 10.3636f)
                curveTo(16.1948f, 10.5324f, 16.1f, 10.7613f, 16.1f, 11.0f)
                curveTo(16.1f, 11.2387f, 16.1948f, 11.4676f, 16.3636f, 11.6364f)
                curveTo(16.5324f, 11.8052f, 16.7613f, 11.9f, 17.0f, 11.9f)
                horizontalLineTo(19.101f)
                verticalLineTo(14.0f)
                curveTo(19.097f, 14.1206f, 19.1173f, 14.2409f, 19.1607f, 14.3535f)
                curveTo(19.2041f, 14.4662f, 19.2697f, 14.5689f, 19.3536f, 14.6557f)
                curveTo(19.4375f, 14.7425f, 19.538f, 14.8115f, 19.6492f, 14.8586f)
                curveTo(19.7603f, 14.9057f, 19.8798f, 14.93f, 20.0005f, 14.93f)
                curveTo(20.1212f, 14.93f, 20.2407f, 14.9057f, 20.3518f, 14.8586f)
                curveTo(20.463f, 14.8115f, 20.5635f, 14.7425f, 20.6474f, 14.6557f)
                curveTo(20.7313f, 14.5689f, 20.797f, 14.4662f, 20.8403f, 14.3535f)
                curveTo(20.8837f, 14.2409f, 20.904f, 14.1206f, 20.9f, 14.0f)
                verticalLineTo(11.9f)
                horizontalLineTo(23.0f)
                curveTo(23.2387f, 11.9f, 23.4676f, 11.8052f, 23.6364f, 11.6364f)
                curveTo(23.8052f, 11.4676f, 23.9f, 11.2387f, 23.9f, 11.0f)
                curveTo(23.9f, 10.7613f, 23.8052f, 10.5324f, 23.6364f, 10.3636f)
                curveTo(23.4676f, 10.1948f, 23.2387f, 10.1f, 23.0f, 10.1f)
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
        return _iconUserPlus!!
    }

private var _iconUserPlus: ImageVector? = null
