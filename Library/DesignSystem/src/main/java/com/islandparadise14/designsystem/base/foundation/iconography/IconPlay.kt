package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconPlay: ImageVector
    get() {
        if (_iconPlay != null) {
            return _iconPlay!!
        }
        _iconPlay = Builder(name = "IconPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.714f, 13.088f)
                    lineTo(8.046f, 21.993f)
                    curveTo(7.8951f, 22.0914f, 7.7204f, 22.1471f, 7.5404f, 22.1544f)
                    curveTo(7.3604f, 22.1617f, 7.1818f, 22.1202f, 7.0235f, 22.0344f)
                    curveTo(6.8651f, 21.9485f, 6.7329f, 21.8215f, 6.6407f, 21.6667f)
                    curveTo(6.5486f, 21.5119f, 6.5f, 21.3351f, 6.5f, 21.155f)
                    verticalLineTo(3.345f)
                    curveTo(6.5f, 3.1649f, 6.5486f, 2.9881f, 6.6407f, 2.8333f)
                    curveTo(6.7329f, 2.6785f, 6.8651f, 2.5515f, 7.0235f, 2.4656f)
                    curveTo(7.1818f, 2.3798f, 7.3604f, 2.3383f, 7.5404f, 2.3456f)
                    curveTo(7.7204f, 2.3529f, 7.8951f, 2.4086f, 8.046f, 2.507f)
                    lineTo(21.714f, 11.412f)
                    curveTo(21.8535f, 11.5028f, 21.9681f, 11.627f, 22.0474f, 11.7734f)
                    curveTo(22.1268f, 11.9197f, 22.1683f, 12.0835f, 22.1683f, 12.25f)
                    curveTo(22.1683f, 12.4165f, 22.1268f, 12.5803f, 22.0474f, 12.7266f)
                    curveTo(21.9681f, 12.873f, 21.8535f, 12.9972f, 21.714f, 13.088f)
                    verticalLineTo(13.088f)
                    close()
                }
            }
        }
        .build()
        return _iconPlay!!
    }

private var _iconPlay: ImageVector? = null
