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

public val MLDIcon.IconCopy: ImageVector
    get() {
        if (_iconCopy != null) {
            return _iconCopy!!
        }
        _iconCopy = Builder(name = "IconCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.1f, 8.3f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.7f)
                horizontalLineTo(19.1f)
                curveTo(19.8f, 10.7f, 20.3f, 11.2f, 20.3f, 11.9f)
                verticalLineTo(19.1f)
                curveTo(20.3f, 19.8f, 19.8f, 20.3f, 19.1f, 20.3f)
                horizontalLineTo(11.9f)
                curveTo(11.2f, 20.3f, 10.7f, 19.8f, 10.7f, 19.1f)
                verticalLineTo(17.7f)
                horizontalLineTo(8.3f)
                verticalLineTo(19.1f)
                curveTo(8.3f, 21.1f, 9.9f, 22.7f, 11.9f, 22.7f)
                horizontalLineTo(19.1f)
                curveTo(21.1f, 22.7f, 22.7f, 21.1f, 22.7f, 19.1f)
                verticalLineTo(11.9f)
                curveTo(22.7f, 9.9f, 21.1f, 8.3f, 19.1f, 8.3f)
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.9f, 3.7f)
                curveTo(4.2f, 3.7f, 3.7f, 4.2f, 3.7f, 4.9f)
                verticalLineTo(12.1f)
                curveTo(3.7f, 12.8f, 4.2f, 13.3f, 4.9f, 13.3f)
                horizontalLineTo(12.1f)
                curveTo(12.8f, 13.3f, 13.3f, 12.8f, 13.3f, 12.1f)
                verticalLineTo(4.9f)
                curveTo(13.3f, 4.2f, 12.8f, 3.7f, 12.1f, 3.7f)
                horizontalLineTo(4.9f)
                close()
                moveTo(12.1f, 15.7f)
                horizontalLineTo(4.9f)
                curveTo(2.9f, 15.7f, 1.3f, 14.1f, 1.3f, 12.1f)
                verticalLineTo(4.9f)
                curveTo(1.3f, 2.9f, 2.9f, 1.3f, 4.9f, 1.3f)
                horizontalLineTo(12.1f)
                curveTo(14.1f, 1.3f, 15.7f, 2.9f, 15.7f, 4.9f)
                verticalLineTo(12.1f)
                curveTo(15.7f, 14.1f, 14.1f, 15.7f, 12.1f, 15.7f)
                verticalLineTo(15.7f)
                close()
            }
        }
        .build()
        return _iconCopy!!
    }

private var _iconCopy: ImageVector? = null
