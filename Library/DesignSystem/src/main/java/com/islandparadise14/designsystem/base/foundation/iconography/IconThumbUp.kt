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

public val Iconography.IconThumbUp: ImageVector
    get() {
        if (_iconThumbUp != null) {
            return _iconThumbUp!!
        }
        _iconThumbUp = Builder(name = "IconThumbUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.954f, 9.204f)
                curveTo(4.449f, 9.204f, 3.9647f, 9.4046f, 3.6077f, 9.7617f)
                curveTo(3.2506f, 10.1187f, 3.05f, 10.603f, 3.05f, 11.108f)
                verticalLineTo(19.095f)
                curveTo(3.05f, 20.147f, 3.902f, 21.0f, 4.954f, 21.0f)
                horizontalLineTo(6.884f)
                verticalLineTo(9.204f)
                horizontalLineTo(4.954f)
                close()
                moveTo(20.413f, 6.997f)
                horizontalLineTo(15.871f)
                verticalLineTo(2.736f)
                curveTo(15.8712f, 2.3537f, 15.7452f, 1.9819f, 15.5125f, 1.6786f)
                curveTo(15.2799f, 1.3752f, 14.9536f, 1.1571f, 14.5842f, 1.0581f)
                curveTo(14.2149f, 0.9592f, 13.8233f, 0.9849f, 13.4701f, 1.1314f)
                curveTo(13.1169f, 1.2778f, 12.822f, 1.5368f, 12.631f, 1.868f)
                lineTo(8.395f, 9.204f)
                horizontalLineTo(8.384f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.618f)
                curveTo(18.4694f, 21.0f, 19.2962f, 20.7148f, 19.9665f, 20.1899f)
                curveTo(20.6368f, 19.6649f, 21.1119f, 18.9306f, 21.316f, 18.104f)
                lineTo(23.186f, 10.54f)
                curveTo(23.2901f, 10.1191f, 23.2971f, 9.6801f, 23.2063f, 9.2562f)
                curveTo(23.1156f, 8.8322f, 22.9296f, 8.4345f, 22.6624f, 8.0931f)
                curveTo(22.3952f, 7.7517f, 22.0538f, 7.4756f, 21.6641f, 7.2857f)
                curveTo(21.2744f, 7.0958f, 20.8465f, 6.9971f, 20.413f, 6.997f)
            }
        }
        .build()
        return _iconThumbUp!!
    }

private var _iconThumbUp: ImageVector? = null
