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

public val Iconography.IconPlusCircle: ImageVector
    get() {
        if (_iconPlusCircle != null) {
            return _iconPlusCircle!!
        }
        _iconPlusCircle = Builder(name = "IconPlusCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.492f, 13.0f)
                horizontalLineTo(12.992f)
                verticalLineTo(16.5f)
                curveTo(12.992f, 16.7652f, 12.8866f, 17.0196f, 12.6991f, 17.2071f)
                curveTo(12.5116f, 17.3946f, 12.2572f, 17.5f, 11.992f, 17.5f)
                curveTo(11.7268f, 17.5f, 11.4724f, 17.3946f, 11.2849f, 17.2071f)
                curveTo(11.0974f, 17.0196f, 10.992f, 16.7652f, 10.992f, 16.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.492f)
                curveTo(7.2268f, 13.0f, 6.9724f, 12.8946f, 6.7849f, 12.7071f)
                curveTo(6.5974f, 12.5196f, 6.492f, 12.2652f, 6.492f, 12.0f)
                curveTo(6.492f, 11.7348f, 6.5974f, 11.4804f, 6.7849f, 11.2929f)
                curveTo(6.9724f, 11.1054f, 7.2268f, 11.0f, 7.492f, 11.0f)
                horizontalLineTo(10.992f)
                verticalLineTo(7.5f)
                curveTo(10.992f, 7.2348f, 11.0974f, 6.9804f, 11.2849f, 6.7929f)
                curveTo(11.4724f, 6.6054f, 11.7268f, 6.5f, 11.992f, 6.5f)
                curveTo(12.2572f, 6.5f, 12.5116f, 6.6054f, 12.6991f, 6.7929f)
                curveTo(12.8866f, 6.9804f, 12.992f, 7.2348f, 12.992f, 7.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.492f)
                curveTo(16.7572f, 11.0f, 17.0116f, 11.1054f, 17.1991f, 11.2929f)
                curveTo(17.3866f, 11.4804f, 17.492f, 11.7348f, 17.492f, 12.0f)
                curveTo(17.492f, 12.2652f, 17.3866f, 12.5196f, 17.1991f, 12.7071f)
                curveTo(17.0116f, 12.8946f, 16.7572f, 13.0f, 16.492f, 13.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconPlusCircle!!
    }

private var _iconPlusCircle: ImageVector? = null
