package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconClock: ImageVector
    get() {
        if (_iconClock != null) {
            return _iconClock!!
        }
        _iconClock = Builder(name = "IconClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 11.761f)
                curveTo(13.0f, 11.794f, 12.984f, 11.823f, 12.981f, 11.855f)
                curveTo(12.9754f, 11.9227f, 12.9616f, 11.9895f, 12.94f, 12.054f)
                curveTo(12.9038f, 12.1736f, 12.8447f, 12.285f, 12.766f, 12.382f)
                curveTo(12.722f, 12.435f, 12.676f, 12.482f, 12.622f, 12.526f)
                curveTo(12.597f, 12.546f, 12.582f, 12.575f, 12.555f, 12.593f)
                lineTo(7.829f, 15.743f)
                curveTo(7.6083f, 15.8846f, 7.3409f, 15.9338f, 7.0842f, 15.8801f)
                curveTo(6.8276f, 15.8264f, 6.6023f, 15.6741f, 6.4569f, 15.4559f)
                curveTo(6.3115f, 15.2377f, 6.2576f, 14.9712f, 6.3068f, 14.7136f)
                curveTo(6.356f, 14.4561f, 6.5044f, 14.2282f, 6.72f, 14.079f)
                lineTo(11.0f, 11.226f)
                verticalLineTo(6.556f)
                curveTo(11.0f, 6.2908f, 11.1054f, 6.0364f, 11.2929f, 5.8489f)
                curveTo(11.4804f, 5.6614f, 11.7348f, 5.556f, 12.0f, 5.556f)
                curveTo(12.2652f, 5.556f, 12.5196f, 5.6614f, 12.7071f, 5.8489f)
                curveTo(12.8946f, 6.0364f, 13.0f, 6.2908f, 13.0f, 6.556f)
                verticalLineTo(11.761f)
                verticalLineTo(11.761f)
                close()
                moveTo(12.0f, 1.5f)
                curveTo(6.201f, 1.5f, 1.5f, 6.201f, 1.5f, 12.0f)
                curveTo(1.5f, 17.799f, 6.201f, 22.5f, 12.0f, 22.5f)
                curveTo(17.799f, 22.5f, 22.5f, 17.799f, 22.5f, 12.0f)
                curveTo(22.5f, 6.201f, 17.799f, 1.5f, 12.0f, 1.5f)
                close()
            }
        }
        .build()
        return _iconClock!!
    }

private var _iconClock: ImageVector? = null
