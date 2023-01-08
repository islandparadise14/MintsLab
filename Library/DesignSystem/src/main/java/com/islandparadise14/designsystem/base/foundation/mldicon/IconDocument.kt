package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconDocument: ImageVector
    get() {
        if (_iconDocument != null) {
            return _iconDocument!!
        }
        _iconDocument = Builder(name = "IconDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 2.0f)
                horizontalLineTo(4.5f)
                curveTo(4.2348f, 2.0f, 3.9804f, 2.1054f, 3.7929f, 2.2929f)
                curveTo(3.6054f, 2.4804f, 3.5f, 2.7348f, 3.5f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(3.5f, 21.2652f, 3.6054f, 21.5196f, 3.7929f, 21.7071f)
                curveTo(3.9804f, 21.8946f, 4.2348f, 22.0f, 4.5f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 15.622f, 14.122f, 14.5f, 15.5f, 14.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(3.0f)
                curveTo(20.5f, 2.7348f, 20.3946f, 2.4804f, 20.2071f, 2.2929f)
                curveTo(20.0196f, 2.1054f, 19.7652f, 2.0f, 19.5f, 2.0f)
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 17.0f)
                verticalLineTo(22.0f)
                lineTo(20.5f, 16.0f)
                horizontalLineTo(15.5f)
                curveTo(15.2348f, 16.0f, 14.9804f, 16.1054f, 14.7929f, 16.2929f)
                curveTo(14.6054f, 16.4804f, 14.5f, 16.7348f, 14.5f, 17.0f)
                close()
            }
        }
        .build()
        return _iconDocument!!
    }

private var _iconDocument: ImageVector? = null
