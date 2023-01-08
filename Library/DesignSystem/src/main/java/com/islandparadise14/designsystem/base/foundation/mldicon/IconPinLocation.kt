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

public val MLDIcon.IconPinLocation: ImageVector
    get() {
        if (_iconPinLocation != null) {
            return _iconPinLocation!!
        }
        _iconPinLocation = Builder(name = "IconPinLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.742f)
                curveTo(11.6393f, 12.7489f, 11.2808f, 12.6839f, 10.9455f, 12.5506f)
                curveTo(10.6102f, 12.4173f, 10.3049f, 12.2186f, 10.0473f, 11.9659f)
                curveTo(9.7898f, 11.7133f, 9.5852f, 11.4118f, 9.4455f, 11.0791f)
                curveTo(9.3058f, 10.7465f, 9.2339f, 10.3893f, 9.2339f, 10.0285f)
                curveTo(9.2339f, 9.6677f, 9.3058f, 9.3105f, 9.4455f, 8.9779f)
                curveTo(9.5852f, 8.6452f, 9.7898f, 8.3437f, 10.0473f, 8.0911f)
                curveTo(10.3049f, 7.8384f, 10.6102f, 7.6396f, 10.9455f, 7.5064f)
                curveTo(11.2808f, 7.3731f, 11.6393f, 7.3081f, 12.0f, 7.315f)
                curveTo(12.7106f, 7.3286f, 13.3876f, 7.6205f, 13.8853f, 8.1279f)
                curveTo(14.3831f, 8.6353f, 14.6619f, 9.3177f, 14.6619f, 10.0285f)
                curveTo(14.6619f, 10.7393f, 14.3831f, 11.4217f, 13.8853f, 11.9291f)
                curveTo(13.3876f, 12.4365f, 12.7106f, 12.7284f, 12.0f, 12.742f)
                moveTo(9.876f, 1.037f)
                curveTo(5.606f, 1.99f, 2.612f, 6.009f, 2.78f, 10.381f)
                curveTo(2.912f, 13.815f, 5.019f, 16.887f, 11.288f, 22.914f)
                curveTo(11.684f, 23.294f, 12.318f, 23.296f, 12.715f, 22.915f)
                curveTo(19.199f, 16.682f, 21.231f, 13.61f, 21.231f, 10.028f)
                curveTo(21.231f, 4.238f, 15.898f, -0.307f, 9.876f, 1.038f)
            }
        }
        .build()
        return _iconPinLocation!!
    }

private var _iconPinLocation: ImageVector? = null
