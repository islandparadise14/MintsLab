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

public val MLDIcon.IconShieldCheck: ImageVector
    get() {
        if (_iconShieldCheck != null) {
            return _iconShieldCheck!!
        }
        _iconShieldCheck = Builder(name = "IconShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1f, 4.3f)
                lineTo(12.4f, 0.7f)
                curveTo(12.2f, 0.6f, 11.9f, 0.6f, 11.6f, 0.7f)
                lineTo(2.9f, 4.3f)
                curveTo(2.5f, 4.4f, 2.3f, 4.8f, 2.3f, 5.2f)
                verticalLineTo(13.5f)
                curveTo(2.3f, 17.3f, 7.1f, 21.0f, 11.6f, 23.3f)
                curveTo(11.9f, 23.4f, 12.2f, 23.4f, 12.5f, 23.3f)
                curveTo(17.0f, 21.0f, 21.8f, 17.3f, 21.8f, 13.5f)
                verticalLineTo(5.2f)
                curveTo(21.7f, 4.8f, 21.5f, 4.4f, 21.1f, 4.3f)
                verticalLineTo(4.3f)
                close()
                moveTo(17.4f, 9.8f)
                lineTo(11.6f, 15.6f)
                curveTo(11.4f, 15.8f, 11.1f, 15.9f, 10.9f, 15.9f)
                curveTo(10.7f, 15.9f, 10.4f, 15.8f, 10.2f, 15.6f)
                lineTo(6.6f, 12.0f)
                curveTo(6.2f, 11.6f, 6.2f, 10.9f, 6.6f, 10.5f)
                curveTo(7.0f, 10.1f, 7.7f, 10.1f, 8.1f, 10.5f)
                lineTo(10.9f, 13.3f)
                lineTo(16.0f, 8.3f)
                curveTo(16.4f, 7.9f, 17.1f, 7.9f, 17.5f, 8.3f)
                curveTo(17.9f, 8.7f, 17.9f, 9.4f, 17.4f, 9.8f)
                verticalLineTo(9.8f)
                close()
            }
        }
        .build()
        return _iconShieldCheck!!
    }

private var _iconShieldCheck: ImageVector? = null
