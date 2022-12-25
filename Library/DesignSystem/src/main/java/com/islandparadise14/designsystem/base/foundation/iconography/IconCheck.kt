package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconCheck: ImageVector
    get() {
        if (_iconCheck != null) {
            return _iconCheck!!
        }
        _iconCheck = Builder(name = "IconCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6f, 17.2f)
                curveTo(10.3f, 17.2f, 10.0f, 17.1f, 9.8f, 16.8f)
                lineTo(5.2f, 12.2f)
                curveTo(4.7f, 11.7f, 4.7f, 11.0f, 5.2f, 10.5f)
                curveTo(5.7f, 10.0f, 6.4f, 10.0f, 6.9f, 10.5f)
                lineTo(10.6f, 14.2f)
                lineTo(17.2f, 7.6f)
                curveTo(17.7f, 7.1f, 18.4f, 7.1f, 18.9f, 7.6f)
                curveTo(19.4f, 8.1f, 19.4f, 8.8f, 18.9f, 9.3f)
                lineTo(11.5f, 16.7f)
                curveTo(11.2f, 17.1f, 10.9f, 17.2f, 10.6f, 17.2f)
                verticalLineTo(17.2f)
                close()
            }
        }
        .build()
        return _iconCheck!!
    }

private var _iconCheck: ImageVector? = null
