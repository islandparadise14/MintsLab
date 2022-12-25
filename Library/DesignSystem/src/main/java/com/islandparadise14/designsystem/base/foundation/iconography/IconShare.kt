package com.islandparadise14.designsystem.base.foundation.iconography

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
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconShare: ImageVector
    get() {
        if (_iconShare != null) {
            return _iconShare!!
        }
        _iconShare = Builder(name = "IconShare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.533f, 9.211f)
                lineTo(10.887f, 5.856f)
                verticalLineTo(15.037f)
                curveTo(10.887f, 15.3289f, 11.0029f, 15.6088f, 11.2093f, 15.8152f)
                curveTo(11.4157f, 16.0216f, 11.6956f, 16.1375f, 11.9875f, 16.1375f)
                curveTo(12.2794f, 16.1375f, 12.5593f, 16.0216f, 12.7657f, 15.8152f)
                curveTo(12.9721f, 15.6088f, 13.088f, 15.3289f, 13.088f, 15.037f)
                verticalLineTo(5.857f)
                lineTo(16.443f, 9.211f)
                curveTo(16.5448f, 9.3137f, 16.6659f, 9.3951f, 16.7994f, 9.4507f)
                curveTo(16.9328f, 9.5063f, 17.0759f, 9.535f, 17.2205f, 9.535f)
                curveTo(17.3651f, 9.535f, 17.5082f, 9.5063f, 17.6416f, 9.4507f)
                curveTo(17.7751f, 9.3951f, 17.8962f, 9.3137f, 17.998f, 9.211f)
                curveTo(18.1002f, 9.1088f, 18.1813f, 8.9876f, 18.2366f, 8.8541f)
                curveTo(18.2919f, 8.7206f, 18.3204f, 8.5775f, 18.3204f, 8.433f)
                curveTo(18.3204f, 8.2885f, 18.2919f, 8.1454f, 18.2366f, 8.0119f)
                curveTo(18.1813f, 7.8784f, 18.1002f, 7.7572f, 17.998f, 7.655f)
                lineTo(12.765f, 2.422f)
                curveTo(12.5582f, 2.2169f, 12.2788f, 2.1018f, 11.9875f, 2.1018f)
                curveTo(11.6962f, 2.1018f, 11.4168f, 2.2169f, 11.21f, 2.422f)
                lineTo(5.977f, 7.655f)
                curveTo(5.783f, 7.8638f, 5.6775f, 8.1397f, 5.6828f, 8.4246f)
                curveTo(5.688f, 8.7096f, 5.8035f, 8.9814f, 6.0051f, 9.183f)
                curveTo(6.2066f, 9.3845f, 6.4784f, 9.5f, 6.7634f, 9.5052f)
                curveTo(7.0483f, 9.5105f, 7.3242f, 9.405f, 7.533f, 9.211f)
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.381f, 13.093f)
                curveTo(19.774f, 13.093f, 19.28f, 13.586f, 19.28f, 14.193f)
                verticalLineTo(18.4f)
                curveTo(19.28f, 19.117f, 18.697f, 19.7f, 17.981f, 19.7f)
                horizontalLineTo(5.996f)
                curveTo(5.279f, 19.7f, 4.696f, 19.117f, 4.696f, 18.4f)
                verticalLineTo(14.192f)
                curveTo(4.696f, 13.9003f, 4.5801f, 13.6205f, 4.3738f, 13.4142f)
                curveTo(4.1675f, 13.2079f, 3.8877f, 13.092f, 3.596f, 13.092f)
                curveTo(3.3043f, 13.092f, 3.0245f, 13.2079f, 2.8182f, 13.4142f)
                curveTo(2.6119f, 13.6205f, 2.496f, 13.9003f, 2.496f, 14.192f)
                verticalLineTo(18.4f)
                curveTo(2.496f, 20.33f, 4.066f, 21.9f, 5.996f, 21.9f)
                horizontalLineTo(17.981f)
                curveTo(19.91f, 21.9f, 21.481f, 20.33f, 21.481f, 18.4f)
                verticalLineTo(14.192f)
                curveTo(21.481f, 13.9003f, 21.3651f, 13.6205f, 21.1588f, 13.4142f)
                curveTo(20.9525f, 13.2079f, 20.6727f, 13.092f, 20.381f, 13.092f)
            }
        }
        .build()
        return _iconShare!!
    }

private var _iconShare: ImageVector? = null
