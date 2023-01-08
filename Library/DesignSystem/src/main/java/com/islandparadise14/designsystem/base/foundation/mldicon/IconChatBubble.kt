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

public val MLDIcon.IconChatBubble: ImageVector
    get() {
        if (_iconChatBubble != null) {
            return _iconChatBubble!!
        }
        _iconChatBubble = Builder(name = "IconChatBubble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.565f)
                curveTo(6.201f, 1.565f, 1.5f, 5.818f, 1.5f, 11.065f)
                curveTo(1.5f, 13.592f, 2.598f, 15.882f, 4.376f, 17.585f)
                lineTo(3.508f, 21.834f)
                curveTo(3.4895f, 21.9249f, 3.4967f, 22.0191f, 3.5287f, 22.1062f)
                curveTo(3.5607f, 22.1932f, 3.6162f, 22.2696f, 3.6892f, 22.3269f)
                curveTo(3.7621f, 22.3842f, 3.8496f, 22.42f, 3.9417f, 22.4305f)
                curveTo(4.0339f, 22.4409f, 4.1271f, 22.4255f, 4.211f, 22.386f)
                lineTo(8.942f, 20.153f)
                curveTo(9.9383f, 20.4267f, 10.9668f, 20.5653f, 12.0f, 20.565f)
                curveTo(17.799f, 20.565f, 22.5f, 16.312f, 22.5f, 11.065f)
                curveTo(22.5f, 5.818f, 17.799f, 1.565f, 12.0f, 1.565f)
            }
        }
        .build()
        return _iconChatBubble!!
    }

private var _iconChatBubble: ImageVector? = null
