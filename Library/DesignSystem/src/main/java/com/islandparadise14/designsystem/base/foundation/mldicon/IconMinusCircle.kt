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

public val MLDIcon.IconMinusCircle: ImageVector
    get() {
        if (_iconMinusCircle != null) {
            return _iconMinusCircle!!
        }
        _iconMinusCircle = Builder(name = "IconMinusCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.492f, 13.061f)
                horizontalLineTo(7.492f)
                curveTo(7.35f, 13.0654f, 7.2086f, 13.0412f, 7.0761f, 12.9898f)
                curveTo(6.9436f, 12.9385f, 6.8228f, 12.8611f, 6.7208f, 12.7622f)
                curveTo(6.6188f, 12.6633f, 6.5377f, 12.5449f, 6.4823f, 12.414f)
                curveTo(6.427f, 12.2832f, 6.3984f, 12.1426f, 6.3984f, 12.0005f)
                curveTo(6.3984f, 11.8584f, 6.427f, 11.7178f, 6.4823f, 11.587f)
                curveTo(6.5377f, 11.4561f, 6.6188f, 11.3377f, 6.7208f, 11.2388f)
                curveTo(6.8228f, 11.1399f, 6.9436f, 11.0625f, 7.0761f, 11.0112f)
                curveTo(7.2086f, 10.9598f, 7.35f, 10.9356f, 7.492f, 10.94f)
                horizontalLineTo(16.492f)
                curveTo(16.7676f, 10.9485f, 17.0291f, 11.0639f, 17.2211f, 11.2619f)
                curveTo(17.4131f, 11.4598f, 17.5204f, 11.7247f, 17.5204f, 12.0005f)
                curveTo(17.5204f, 12.2763f, 17.4131f, 12.5412f, 17.2211f, 12.7391f)
                curveTo(17.0291f, 12.9371f, 16.7676f, 13.0525f, 16.492f, 13.061f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.076f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.076f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconMinusCircle!!
    }

private var _iconMinusCircle: ImageVector? = null
