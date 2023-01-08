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

public val MLDIcon.IconPicture: ImageVector
    get() {
        if (_iconPicture != null) {
            return _iconPicture!!
        }
        _iconPicture = Builder(name = "IconPicture", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.003f, 10.668f)
                curveTo(15.7647f, 10.6736f, 15.5277f, 10.6314f, 15.3059f, 10.5441f)
                curveTo(15.0841f, 10.4567f, 14.8821f, 10.3259f, 14.7116f, 10.1593f)
                curveTo(14.5411f, 9.9927f, 14.4057f, 9.7937f, 14.3132f, 9.574f)
                curveTo(14.2207f, 9.3543f, 14.1732f, 9.1184f, 14.1732f, 8.88f)
                curveTo(14.1733f, 8.6416f, 14.221f, 8.4057f, 14.3136f, 8.186f)
                curveTo(14.4062f, 7.9664f, 14.5417f, 7.7675f, 14.7123f, 7.601f)
                curveTo(14.8829f, 7.4345f, 15.085f, 7.3038f, 15.3069f, 7.2165f)
                curveTo(15.5287f, 7.1293f, 15.7657f, 7.0873f, 16.004f, 7.093f)
                curveTo(16.4708f, 7.1042f, 16.9146f, 7.2975f, 17.2407f, 7.6316f)
                curveTo(17.5669f, 7.9657f, 17.7494f, 8.4141f, 17.7492f, 8.881f)
                curveTo(17.7491f, 9.3479f, 17.5663f, 9.7962f, 17.24f, 10.1301f)
                curveTo(16.9137f, 10.464f, 16.4698f, 10.6571f, 16.003f, 10.668f)
                moveTo(14.279f, 16.78f)
                horizontalLineTo(8.255f)
                curveTo(8.0426f, 16.7803f, 7.8341f, 16.7233f, 7.6513f, 16.6152f)
                curveTo(7.4685f, 16.507f, 7.3183f, 16.3515f, 7.2164f, 16.1652f)
                curveTo(7.1144f, 15.9789f, 7.0646f, 15.7685f, 7.0721f, 15.5562f)
                curveTo(7.0796f, 15.344f, 7.1442f, 15.1377f, 7.259f, 14.959f)
                lineTo(10.272f, 10.264f)
                curveTo(10.3789f, 10.097f, 10.5261f, 9.9595f, 10.7001f, 9.8644f)
                curveTo(10.8741f, 9.7692f, 11.0692f, 9.7193f, 11.2675f, 9.7193f)
                curveTo(11.4658f, 9.7193f, 11.6609f, 9.7692f, 11.8349f, 9.8644f)
                curveTo(12.0089f, 9.9595f, 12.1561f, 10.097f, 12.263f, 10.264f)
                lineTo(15.274f, 14.959f)
                curveTo(15.3888f, 15.1376f, 15.4533f, 15.3438f, 15.4609f, 15.556f)
                curveTo(15.4684f, 15.7682f, 15.4187f, 15.9785f, 15.3169f, 16.1648f)
                curveTo(15.2151f, 16.3511f, 15.065f, 16.5065f, 14.8823f, 16.6148f)
                curveTo(14.6997f, 16.723f, 14.4913f, 16.7801f, 14.279f, 16.78f)
                moveTo(19.287f, 2.25f)
                horizontalLineTo(4.713f)
                curveTo(4.0598f, 2.25f, 3.4333f, 2.5095f, 2.9714f, 2.9714f)
                curveTo(2.5095f, 3.4333f, 2.25f, 4.0598f, 2.25f, 4.713f)
                verticalLineTo(19.287f)
                curveTo(2.25f, 19.9402f, 2.5095f, 20.5667f, 2.9714f, 21.0286f)
                curveTo(3.4333f, 21.4905f, 4.0598f, 21.75f, 4.713f, 21.75f)
                horizontalLineTo(19.287f)
                curveTo(19.9402f, 21.75f, 20.5667f, 21.4905f, 21.0286f, 21.0286f)
                curveTo(21.4905f, 20.5667f, 21.75f, 19.9402f, 21.75f, 19.287f)
                verticalLineTo(4.713f)
                curveTo(21.75f, 4.0598f, 21.4905f, 3.4333f, 21.0286f, 2.9714f)
                curveTo(20.5667f, 2.5095f, 19.9402f, 2.25f, 19.287f, 2.25f)
            }
        }
        .build()
        return _iconPicture!!
    }

private var _iconPicture: ImageVector? = null
