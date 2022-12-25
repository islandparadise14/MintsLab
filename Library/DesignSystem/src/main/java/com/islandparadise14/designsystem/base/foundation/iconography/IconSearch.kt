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

public val Iconography.IconSearch: ImageVector
    get() {
        if (_iconSearch != null) {
            return _iconSearch!!
        }
        _iconSearch = Builder(name = "IconSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.849f, 20.151f)
                lineTo(17.242f, 15.544f)
                curveTo(18.327f, 14.106f, 18.978f, 12.324f, 18.978f, 10.388f)
                curveTo(18.978f, 5.652f, 15.124f, 1.799f, 10.389f, 1.799f)
                curveTo(5.653f, 1.8f, 1.8f, 5.653f, 1.8f, 10.389f)
                curveTo(1.8f, 15.124f, 5.653f, 18.978f, 10.389f, 18.978f)
                curveTo(12.324f, 18.978f, 14.107f, 18.327f, 15.545f, 17.242f)
                lineTo(20.152f, 21.849f)
                curveTo(20.386f, 22.083f, 20.693f, 22.2f, 21.0f, 22.2f)
                curveTo(21.307f, 22.2f, 21.614f, 22.083f, 21.849f, 21.848f)
                curveTo(22.317f, 21.38f, 22.317f, 20.62f, 21.849f, 20.151f)
                close()
                moveTo(4.2f, 10.389f)
                curveTo(4.2f, 6.976f, 6.976f, 4.2f, 10.389f, 4.2f)
                curveTo(13.801f, 4.2f, 16.577f, 6.976f, 16.577f, 10.388f)
                curveTo(16.577f, 13.8f, 13.801f, 16.576f, 10.389f, 16.576f)
                curveTo(6.976f, 16.577f, 4.2f, 13.801f, 4.2f, 10.389f)
                verticalLineTo(10.389f)
                close()
            }
        }
        .build()
        return _iconSearch!!
    }

private var _iconSearch: ImageVector? = null
