package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconZoomIn: ImageVector
    get() {
        if (_iconZoomIn != null) {
            return _iconZoomIn!!
        }
        _iconZoomIn = Builder(name = "IconZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6f, 9.1f)
                horizontalLineTo(2.2f)
                verticalLineTo(5.4f)
                curveTo(2.2f, 3.6f, 3.6f, 2.2f, 5.4f, 2.2f)
                horizontalLineTo(9.2f)
                verticalLineTo(4.6f)
                horizontalLineTo(5.4f)
                curveTo(5.0f, 4.6f, 4.6f, 5.0f, 4.6f, 5.4f)
                verticalLineTo(9.1f)
                verticalLineTo(9.1f)
                close()
                moveTo(9.1f, 21.8f)
                horizontalLineTo(5.4f)
                curveTo(3.6f, 21.8f, 2.2f, 20.4f, 2.2f, 18.6f)
                verticalLineTo(14.8f)
                horizontalLineTo(4.6f)
                verticalLineTo(18.6f)
                curveTo(4.6f, 19.0f, 5.0f, 19.4f, 5.4f, 19.4f)
                horizontalLineTo(9.2f)
                verticalLineTo(21.8f)
                horizontalLineTo(9.1f)
                close()
                moveTo(18.6f, 21.8f)
                horizontalLineTo(14.8f)
                verticalLineTo(19.4f)
                horizontalLineTo(18.6f)
                curveTo(19.0f, 19.4f, 19.4f, 19.0f, 19.4f, 18.6f)
                verticalLineTo(14.8f)
                horizontalLineTo(21.8f)
                verticalLineTo(18.6f)
                curveTo(21.8f, 20.4f, 20.4f, 21.8f, 18.6f, 21.8f)
                close()
                moveTo(21.8f, 9.1f)
                horizontalLineTo(19.4f)
                verticalLineTo(5.4f)
                curveTo(19.4f, 5.0f, 19.0f, 4.6f, 18.6f, 4.6f)
                horizontalLineTo(14.8f)
                verticalLineTo(2.2f)
                horizontalLineTo(18.6f)
                curveTo(20.4f, 2.2f, 21.8f, 3.6f, 21.8f, 5.4f)
                verticalLineTo(9.1f)
                verticalLineTo(9.1f)
                close()
            }
        }
        .build()
        return _iconZoomIn!!
    }

private var _iconZoomIn: ImageVector? = null
