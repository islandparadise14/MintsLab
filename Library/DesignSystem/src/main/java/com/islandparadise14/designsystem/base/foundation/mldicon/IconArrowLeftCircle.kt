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

public val MLDIcon.IconArrowLeftCircle: ImageVector
    get() {
        if (_iconArrowLeftCircle != null) {
            return _iconArrowLeftCircle!!
        }
        _iconArrowLeftCircle = Builder(name = "IconArrowLeftCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                curveTo(1.0f, 18.1f, 5.9f, 23.0f, 12.0f, 23.0f)
                curveTo(18.1f, 23.0f, 23.0f, 18.1f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9f, 18.1f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(16.5f, 13.0f)
                horizontalLineTo(9.9f)
                lineTo(12.2f, 15.3f)
                curveTo(12.6f, 15.7f, 12.6f, 16.3f, 12.2f, 16.7f)
                curveTo(12.0f, 16.9f, 11.7f, 17.0f, 11.5f, 17.0f)
                curveTo(11.3f, 17.0f, 11.0f, 16.9f, 10.8f, 16.7f)
                lineTo(6.8f, 12.7f)
                curveTo(6.4f, 12.3f, 6.4f, 11.7f, 6.8f, 11.3f)
                lineTo(10.8f, 7.3f)
                curveTo(11.2f, 6.9f, 11.8f, 6.9f, 12.2f, 7.3f)
                curveTo(12.6f, 7.7f, 12.6f, 8.3f, 12.2f, 8.7f)
                lineTo(9.9f, 11.0f)
                horizontalLineTo(16.5f)
                curveTo(17.1f, 11.0f, 17.5f, 11.4f, 17.5f, 12.0f)
                curveTo(17.5f, 12.6f, 17.0f, 13.0f, 16.5f, 13.0f)
                close()
            }
        }
        .build()
        return _iconArrowLeftCircle!!
    }

private var _iconArrowLeftCircle: ImageVector? = null
