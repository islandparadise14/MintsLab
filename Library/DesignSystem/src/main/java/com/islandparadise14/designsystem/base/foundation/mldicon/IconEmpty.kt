package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconEmpty: ImageVector
    get() {
        if (_iconEmpty != null) {
            return _iconEmpty!!
        }
        _iconEmpty = Builder(name = "IconEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF848484)),
                        strokeAlpha = 0.01f, strokeLineWidth = 0.01f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.0f, 1.0f)
                    horizontalLineTo(1.0f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(23.0f)
                    verticalLineTo(1.0f)
                    close()
                }
            }
        }
        .build()
        return _iconEmpty!!
    }

private var _iconEmpty: ImageVector? = null
