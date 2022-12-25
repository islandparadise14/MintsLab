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

public val Iconography.IconArrowDiagonal: ImageVector
    get() {
        if (_iconArrowDiagonal != null) {
            return _iconArrowDiagonal!!
        }
        _iconArrowDiagonal = Builder(name = "IconArrowDiagonal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.9827f, 4.6119f)
                curveTo(19.8717f, 4.3429f, 19.6567f, 4.1289f, 19.3877f, 4.0169f)
                curveTo(19.2537f, 3.9619f, 19.1107f, 3.9319f, 18.9677f, 3.9319f)
                horizontalLineTo(10.8967f)
                curveTo(10.2897f, 3.9319f, 9.7967f, 4.4249f, 9.7967f, 5.0329f)
                curveTo(9.7967f, 5.6399f, 10.2897f, 6.1329f, 10.8967f, 6.1329f)
                horizontalLineTo(16.3117f)
                lineTo(6.1327f, 16.3119f)
                verticalLineTo(10.8969f)
                curveTo(6.1327f, 10.2889f, 5.6397f, 9.7969f, 5.0327f, 9.7969f)
                curveTo(4.4247f, 9.7969f, 3.9327f, 10.2889f, 3.9327f, 10.8969f)
                verticalLineTo(18.9679f)
                curveTo(3.9327f, 19.1109f, 3.9617f, 19.2539f, 4.0177f, 19.3879f)
                curveTo(4.1287f, 19.6569f, 4.3427f, 19.8709f, 4.6117f, 19.9829f)
                curveTo(4.7467f, 20.0379f, 4.8887f, 20.0679f, 5.0327f, 20.0679f)
                horizontalLineTo(13.1037f)
                curveTo(13.7107f, 20.0679f, 14.2037f, 19.5749f, 14.2037f, 18.9679f)
                curveTo(14.2037f, 18.3599f, 13.7107f, 17.8669f, 13.1037f, 17.8669f)
                horizontalLineTo(7.6887f)
                lineTo(17.8677f, 7.6879f)
                verticalLineTo(13.1029f)
                curveTo(17.8677f, 13.7109f, 18.3597f, 14.2029f, 18.9677f, 14.2029f)
                curveTo(19.5747f, 14.2029f, 20.0677f, 13.7109f, 20.0677f, 13.1029f)
                verticalLineTo(5.0329f)
                curveTo(20.0677f, 4.8889f, 20.0387f, 4.7469f, 19.9827f, 4.6119f)
            }
        }
        .build()
        return _iconArrowDiagonal!!
    }

private var _iconArrowDiagonal: ImageVector? = null
