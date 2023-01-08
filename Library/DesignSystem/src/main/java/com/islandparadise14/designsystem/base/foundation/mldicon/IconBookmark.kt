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

public val MLDIcon.IconBookmark: ImageVector
    get() {
        if (_iconBookmark != null) {
            return _iconBookmark!!
        }
        _iconBookmark = Builder(name = "IconBookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 3.4f)
                curveTo(3.5f, 2.7f, 4.0f, 2.2f, 4.7f, 2.2f)
                horizontalLineTo(19.3f)
                curveTo(20.0f, 2.2f, 20.5f, 2.7f, 20.5f, 3.4f)
                verticalLineTo(20.7f)
                curveTo(20.5f, 21.2f, 20.0f, 21.5f, 19.6f, 21.2f)
                lineTo(12.6f, 17.2f)
                curveTo(12.2f, 17.0f, 11.8f, 17.0f, 11.4f, 17.2f)
                lineTo(4.4f, 21.2f)
                curveTo(4.0f, 21.4f, 3.5f, 21.1f, 3.5f, 20.7f)
                verticalLineTo(3.4f)
                verticalLineTo(3.4f)
                close()
            }
        }
        .build()
        return _iconBookmark!!
    }

private var _iconBookmark: ImageVector? = null
