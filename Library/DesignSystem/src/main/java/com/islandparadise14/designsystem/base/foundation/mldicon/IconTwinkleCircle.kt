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

public val MLDIcon.IconTwinkleCircle: ImageVector
    get() {
        if (_iconTwinkleCircle != null) {
            return _iconTwinkleCircle!!
        }
        _iconTwinkleCircle = Builder(name = "IconTwinkleCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 12.5f)
                lineTo(15.8f, 13.2f)
                curveTo(14.6f, 13.6f, 13.7f, 14.5f, 13.3f, 15.7f)
                lineTo(12.5f, 18.0f)
                curveTo(12.3f, 18.5f, 11.7f, 18.5f, 11.6f, 18.0f)
                lineTo(10.9f, 15.8f)
                curveTo(10.5f, 14.6f, 9.6f, 13.7f, 8.4f, 13.3f)
                lineTo(6.0f, 12.5f)
                curveTo(5.5f, 12.3f, 5.5f, 11.7f, 6.0f, 11.6f)
                lineTo(8.2f, 10.9f)
                curveTo(9.4f, 10.5f, 10.3f, 9.6f, 10.7f, 8.4f)
                lineTo(11.5f, 6.0f)
                curveTo(11.7f, 5.5f, 12.3f, 5.5f, 12.4f, 6.0f)
                lineTo(13.1f, 8.2f)
                curveTo(13.5f, 9.4f, 14.4f, 10.3f, 15.6f, 10.7f)
                lineTo(17.8f, 11.4f)
                curveTo(18.5f, 11.7f, 18.5f, 12.3f, 18.0f, 12.5f)
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                curveTo(1.0f, 18.1f, 5.9f, 23.0f, 12.0f, 23.0f)
                curveTo(18.1f, 23.0f, 23.0f, 18.1f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9f, 18.1f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconTwinkleCircle!!
    }

private var _iconTwinkleCircle: ImageVector? = null
