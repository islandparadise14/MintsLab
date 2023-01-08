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

public val MLDIcon.IconInfoCircle: ImageVector
    get() {
        if (_iconInfoCircle != null) {
            return _iconInfoCircle!!
        }
        _iconInfoCircle = Builder(name = "IconInfoCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.2f)
                curveTo(11.6817f, 9.2f, 11.3765f, 9.0736f, 11.1515f, 8.8485f)
                curveTo(10.9264f, 8.6235f, 10.8f, 8.3183f, 10.8f, 8.0f)
                curveTo(10.8f, 7.6817f, 10.9264f, 7.3765f, 11.1515f, 7.1515f)
                curveTo(11.3765f, 6.9264f, 11.6817f, 6.8f, 12.0f, 6.8f)
                curveTo(12.3183f, 6.8f, 12.6235f, 6.9264f, 12.8485f, 7.1515f)
                curveTo(13.0736f, 7.3765f, 13.2f, 7.6817f, 13.2f, 8.0f)
                curveTo(13.2f, 8.3183f, 13.0736f, 8.6235f, 12.8485f, 8.8485f)
                curveTo(12.6235f, 9.0736f, 12.3183f, 9.2f, 12.0f, 9.2f)
                verticalLineTo(9.2f)
                close()
                moveTo(13.0f, 16.635f)
                curveTo(13.0f, 16.9002f, 12.8946f, 17.1546f, 12.7071f, 17.3421f)
                curveTo(12.5196f, 17.5296f, 12.2652f, 17.635f, 12.0f, 17.635f)
                curveTo(11.7348f, 17.635f, 11.4804f, 17.5296f, 11.2929f, 17.3421f)
                curveTo(11.1054f, 17.1546f, 11.0f, 16.9002f, 11.0f, 16.635f)
                verticalLineTo(11.635f)
                curveTo(11.0f, 11.3698f, 11.1054f, 11.1154f, 11.2929f, 10.9279f)
                curveTo(11.4804f, 10.7404f, 11.7348f, 10.635f, 12.0f, 10.635f)
                curveTo(12.2652f, 10.635f, 12.5196f, 10.7404f, 12.7071f, 10.9279f)
                curveTo(12.8946f, 11.1154f, 13.0f, 11.3698f, 13.0f, 11.635f)
                verticalLineTo(16.635f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconInfoCircle!!
    }

private var _iconInfoCircle: ImageVector? = null
