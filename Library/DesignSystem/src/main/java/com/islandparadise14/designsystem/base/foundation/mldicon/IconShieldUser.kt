package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconShieldUser: ImageVector
    get() {
        if (_iconShieldUser != null) {
            return _iconShieldUser!!
        }
        _iconShieldUser = Builder(name = "IconShieldUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.111f, 4.259f)
                lineTo(12.38f, 0.674f)
                curveTo(12.137f, 0.574f, 11.864f, 0.574f, 11.62f, 0.674f)
                lineTo(2.889f, 4.259f)
                curveTo(2.514f, 4.413f, 2.269f, 4.778f, 2.269f, 5.184f)
                verticalLineTo(13.519f)
                curveTo(2.269f, 17.316f, 7.072f, 21.009f, 11.552f, 23.293f)
                curveTo(11.834f, 23.437f, 12.166f, 23.437f, 12.447f, 23.293f)
                curveTo(16.927f, 21.009f, 21.73f, 17.316f, 21.73f, 13.519f)
                verticalLineTo(5.184f)
                curveTo(21.731f, 4.779f, 21.486f, 4.413f, 21.111f, 4.259f)
                verticalLineTo(4.259f)
                close()
                moveTo(12.0f, 6.497f)
                curveTo(13.217f, 6.497f, 14.203f, 7.483f, 14.203f, 8.7f)
                curveTo(14.203f, 9.917f, 13.217f, 10.902f, 12.0f, 10.902f)
                curveTo(10.783f, 10.902f, 9.797f, 9.916f, 9.797f, 8.699f)
                curveTo(9.797f, 7.482f, 10.783f, 6.497f, 12.0f, 6.497f)
                close()
                moveTo(12.0f, 16.503f)
                curveTo(10.023f, 16.503f, 7.105f, 16.225f, 7.105f, 15.182f)
                curveTo(7.105f, 14.139f, 8.476f, 11.896f, 12.0f, 11.896f)
                curveTo(15.524f, 11.896f, 16.895f, 14.139f, 16.895f, 15.182f)
                curveTo(16.895f, 16.225f, 13.977f, 16.503f, 12.0f, 16.503f)
                close()
            }
        }
        .build()
        return _iconShieldUser!!
    }

private var _iconShieldUser: ImageVector? = null
