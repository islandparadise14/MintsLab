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

public val Iconography.IconArrowRight: ImageVector
    get() {
        if (_iconArrowRight != null) {
            return _iconArrowRight!!
        }
        _iconArrowRight = Builder(name = "IconArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.8675f, 10.7998f)
                horizontalLineTo(17.9035f)
                lineTo(12.4525f, 5.3488f)
                curveTo(11.9835f, 4.8797f, 11.9835f, 4.1198f, 12.4525f, 3.6518f)
                curveTo(12.9215f, 3.1827f, 13.6805f, 3.1827f, 14.1495f, 3.6518f)
                lineTo(21.6495f, 11.1518f)
                curveTo(21.6525f, 11.1538f, 21.6535f, 11.1578f, 21.6565f, 11.1608f)
                curveTo(21.7635f, 11.2698f, 21.8495f, 11.3988f, 21.9085f, 11.5408f)
                curveTo(22.0305f, 11.8348f, 22.0305f, 12.1648f, 21.9085f, 12.4588f)
                curveTo(21.8495f, 12.6018f, 21.7635f, 12.7298f, 21.6565f, 12.8388f)
                curveTo(21.6535f, 12.8418f, 21.6525f, 12.8458f, 21.6495f, 12.8488f)
                lineTo(14.1495f, 20.3488f)
                curveTo(13.9155f, 20.5828f, 13.6085f, 20.6998f, 13.3015f, 20.6998f)
                curveTo(12.9935f, 20.6998f, 12.6865f, 20.5828f, 12.4525f, 20.3488f)
                curveTo(11.9835f, 19.8798f, 11.9835f, 19.1198f, 12.4525f, 18.6518f)
                lineTo(17.9035f, 13.1998f)
                horizontalLineTo(3.8675f)
                curveTo(3.2045f, 13.1998f, 2.6675f, 12.6628f, 2.6675f, 11.9998f)
                curveTo(2.6675f, 11.3378f, 3.2045f, 10.7998f, 3.8675f, 10.7998f)
                close()
            }
        }
        .build()
        return _iconArrowRight!!
    }

private var _iconArrowRight: ImageVector? = null
