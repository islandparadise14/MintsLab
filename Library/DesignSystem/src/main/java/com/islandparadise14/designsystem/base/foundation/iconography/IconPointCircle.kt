package com.islandparadise14.designsystem.base.foundation.iconography

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconPointCircle: ImageVector
    get() {
        if (_iconPointCircle != null) {
            return _iconPointCircle!!
        }
        _iconPointCircle = Builder(name = "IconPointCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.357f, 8.715f)
                    horizontalLineTo(10.982f)
                    verticalLineTo(12.109f)
                    horizontalLineTo(13.357f)
                    curveTo(14.293f, 12.109f, 15.054f, 11.349f, 15.054f, 10.412f)
                    curveTo(15.054f, 9.476f, 14.294f, 8.715f, 13.357f, 8.715f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.357f, 14.146f)
                    horizontalLineTo(10.982f)
                    verticalLineTo(16.861f)
                    curveTo(10.9679f, 17.1216f, 10.8544f, 17.3668f, 10.6649f, 17.5462f)
                    curveTo(10.4755f, 17.7257f, 10.2245f, 17.8257f, 9.9635f, 17.8257f)
                    curveTo(9.7025f, 17.8257f, 9.4515f, 17.7257f, 9.2621f, 17.5462f)
                    curveTo(9.0726f, 17.3668f, 8.9592f, 17.1216f, 8.945f, 16.861f)
                    verticalLineTo(6.678f)
                    horizontalLineTo(13.357f)
                    curveTo(14.3471f, 6.6791f, 15.2963f, 7.073f, 15.9962f, 7.7733f)
                    curveTo(16.6961f, 8.4735f, 17.0895f, 9.4229f, 17.09f, 10.413f)
                    curveTo(17.0889f, 11.4027f, 16.6953f, 12.3516f, 15.9955f, 13.0515f)
                    curveTo(15.2956f, 13.7513f, 14.3467f, 14.1449f, 13.357f, 14.146f)
                    moveTo(12.0f, 0.8f)
                    curveTo(5.814f, 0.8f, 0.8f, 5.815f, 0.8f, 12.0f)
                    curveTo(0.8f, 18.186f, 5.814f, 23.2f, 12.0f, 23.2f)
                    curveTo(18.185f, 23.2f, 23.2f, 18.186f, 23.2f, 12.0f)
                    curveTo(23.2f, 5.815f, 18.185f, 0.8f, 12.0f, 0.8f)
                    close()
                }
            }
        }
        .build()
        return _iconPointCircle!!
    }

private var _iconPointCircle: ImageVector? = null
