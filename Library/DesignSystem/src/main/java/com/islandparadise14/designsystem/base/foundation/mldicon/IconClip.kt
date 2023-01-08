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

public val MLDIcon.IconClip: ImageVector
    get() {
        if (_iconClip != null) {
            return _iconClip!!
        }
        _iconClip = Builder(name = "IconClip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4f, 21.6f)
                curveTo(6.5f, 21.6f, 4.5f, 20.9f, 3.1f, 19.4f)
                curveTo(0.2f, 16.5f, 0.2f, 11.7f, 3.1f, 8.7f)
                lineTo(7.6f, 4.2f)
                curveTo(8.0f, 3.8f, 8.7f, 3.8f, 9.2f, 4.2f)
                curveTo(9.6f, 4.6f, 9.6f, 5.3f, 9.2f, 5.8f)
                lineTo(4.7f, 10.3f)
                curveTo(2.6f, 12.4f, 2.6f, 15.8f, 4.7f, 17.8f)
                curveTo(6.8f, 19.9f, 10.2f, 19.9f, 12.2f, 17.8f)
                lineTo(20.0f, 10.0f)
                curveTo(21.2f, 8.8f, 21.2f, 6.7f, 20.0f, 5.5f)
                curveTo(18.8f, 4.3f, 16.7f, 4.3f, 15.5f, 5.5f)
                lineTo(8.4f, 12.6f)
                curveTo(8.0f, 13.0f, 8.0f, 13.7f, 8.4f, 14.1f)
                curveTo(8.8f, 14.5f, 9.5f, 14.5f, 9.9f, 14.1f)
                lineTo(14.7f, 9.3f)
                curveTo(15.1f, 8.9f, 15.8f, 8.9f, 16.3f, 9.3f)
                curveTo(16.7f, 9.7f, 16.7f, 10.4f, 16.3f, 10.9f)
                lineTo(11.5f, 15.7f)
                curveTo(10.1f, 17.0f, 8.0f, 17.0f, 6.8f, 15.7f)
                curveTo(5.5f, 14.4f, 5.5f, 12.4f, 6.8f, 11.1f)
                lineTo(13.9f, 4.0f)
                curveTo(16.0f, 1.9f, 19.4f, 1.9f, 21.5f, 4.0f)
                curveTo(23.6f, 6.1f, 23.6f, 9.5f, 21.5f, 11.6f)
                lineTo(13.7f, 19.4f)
                curveTo(12.3f, 20.8f, 10.4f, 21.6f, 8.4f, 21.6f)
                verticalLineTo(21.6f)
                close()
            }
        }
        .build()
        return _iconClip!!
    }

private var _iconClip: ImageVector? = null
