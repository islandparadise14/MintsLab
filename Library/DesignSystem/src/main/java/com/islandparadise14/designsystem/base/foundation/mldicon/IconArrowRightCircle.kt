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

public val MLDIcon.IconArrowRightCircle: ImageVector
    get() {
        if (_iconArrowRightCircle != null) {
            return _iconArrowRightCircle!!
        }
        _iconArrowRightCircle = Builder(name = "IconArrowRightCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 18.1f, 5.9f, 23.0f, 12.0f, 23.0f)
                curveTo(18.1f, 23.0f, 23.0f, 18.1f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9f, 18.1f, 1.0f, 12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 11.4f, 6.9f, 11.0f, 7.5f, 11.0f)
                horizontalLineTo(14.1f)
                lineTo(11.8f, 8.7f)
                curveTo(11.4f, 8.3f, 11.4f, 7.7f, 11.8f, 7.3f)
                curveTo(12.2f, 6.9f, 12.8f, 6.9f, 13.2f, 7.3f)
                lineTo(17.2f, 11.3f)
                curveTo(17.6f, 11.7f, 17.6f, 12.3f, 17.2f, 12.7f)
                lineTo(13.2f, 16.7f)
                curveTo(13.0f, 16.9f, 12.8f, 17.0f, 12.5f, 17.0f)
                curveTo(12.2f, 17.0f, 12.0f, 16.9f, 11.8f, 16.7f)
                curveTo(11.4f, 16.3f, 11.4f, 15.7f, 11.8f, 15.3f)
                lineTo(14.1f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0f, 13.0f, 6.5f, 12.6f, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return _iconArrowRightCircle!!
    }

private var _iconArrowRightCircle: ImageVector? = null
