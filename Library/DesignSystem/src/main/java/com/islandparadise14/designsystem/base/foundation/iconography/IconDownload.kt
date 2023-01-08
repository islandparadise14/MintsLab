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

public val Iconography.IconDownload: ImageVector
    get() {
        if (_iconDownload != null) {
            return _iconDownload!!
        }
        _iconDownload = Builder(name = "IconDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.21f, 15.4f)
                curveTo(11.42f, 15.61f, 11.71f, 15.72f, 11.99f, 15.72f)
                curveTo(12.27f, 15.72f, 12.55f, 15.61f, 12.77f, 15.4f)
                lineTo(18.0f, 10.16f)
                curveTo(18.43f, 9.73f, 18.43f, 9.03f, 18.0f, 8.6f)
                curveTo(17.57f, 8.17f, 16.87f, 8.17f, 16.44f, 8.6f)
                lineTo(13.09f, 11.95f)
                verticalLineTo(2.78f)
                curveTo(13.09f, 2.17f, 12.6f, 1.68f, 11.99f, 1.68f)
                curveTo(11.38f, 1.68f, 10.89f, 2.17f, 10.89f, 2.78f)
                verticalLineTo(11.96f)
                lineTo(7.53f, 8.61f)
                curveTo(7.1f, 8.18f, 6.4f, 8.18f, 5.97f, 8.61f)
                curveTo(5.54f, 9.04f, 5.54f, 9.74f, 5.97f, 10.17f)
                lineTo(11.21f, 15.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.38f, 13.09f)
                curveTo(20.77f, 13.09f, 20.28f, 13.58f, 20.28f, 14.19f)
                verticalLineTo(18.4f)
                curveTo(20.28f, 19.12f, 19.7f, 19.7f, 18.98f, 19.7f)
                horizontalLineTo(5.0f)
                curveTo(4.28f, 19.7f, 3.7f, 19.12f, 3.7f, 18.4f)
                verticalLineTo(14.19f)
                curveTo(3.7f, 13.58f, 3.21f, 13.09f, 2.6f, 13.09f)
                curveTo(1.99f, 13.09f, 1.5f, 13.58f, 1.5f, 14.19f)
                verticalLineTo(18.4f)
                curveTo(1.5f, 20.33f, 3.07f, 21.9f, 5.0f, 21.9f)
                horizontalLineTo(18.98f)
                curveTo(20.91f, 21.9f, 22.48f, 20.33f, 22.48f, 18.4f)
                verticalLineTo(14.19f)
                curveTo(22.48f, 13.58f, 21.99f, 13.09f, 21.38f, 13.09f)
                verticalLineTo(13.09f)
                close()
            }
        }
        .build()
        return _iconDownload!!
    }

private var _iconDownload: ImageVector? = null
