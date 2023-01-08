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

public val Iconography.IconEyeOff: ImageVector
    get() {
        if (_iconEyeOff != null) {
            return _iconEyeOff!!
        }
        _iconEyeOff = Builder(name = "IconEyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.779f, 4.672f)
                curveTo(13.871f, 4.454f, 12.943f, 4.324f, 12.0f, 4.324f)
                curveTo(7.788f, 4.324f, 3.805f, 6.585f, 1.182f, 10.352f)
                curveTo(0.498f, 11.334f, 0.498f, 12.667f, 1.182f, 13.649f)
                curveTo(1.822f, 14.568f, 2.545f, 15.393f, 3.33f, 16.122f)
                lineTo(14.779f, 4.672f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.819f, 10.352f)
                curveTo(21.769f, 8.844f, 20.494f, 7.591f, 19.079f, 6.619f)
                lineTo(21.648f, 4.05f)
                curveTo(22.117f, 3.581f, 22.117f, 2.821f, 21.648f, 2.353f)
                curveTo(21.179f, 1.885f, 20.419f, 1.884f, 19.951f, 2.353f)
                lineTo(2.352f, 19.95f)
                curveTo(1.883f, 20.419f, 1.883f, 21.179f, 2.352f, 21.647f)
                curveTo(2.586f, 21.881f, 2.894f, 21.999f, 3.201f, 21.999f)
                curveTo(3.508f, 21.999f, 3.815f, 21.882f, 4.05f, 21.647f)
                lineTo(7.094f, 18.603f)
                curveTo(8.643f, 19.294f, 10.3f, 19.676f, 12.0f, 19.676f)
                curveTo(16.213f, 19.676f, 20.196f, 17.415f, 22.819f, 13.648f)
                curveTo(23.502f, 12.667f, 23.502f, 11.334f, 22.819f, 10.352f)
                verticalLineTo(10.352f)
                close()
                moveTo(11.999f, 15.974f)
                curveTo(11.34f, 15.974f, 10.725f, 15.803f, 10.18f, 15.516f)
                lineTo(15.515f, 10.181f)
                curveTo(15.802f, 10.726f, 15.973f, 11.34f, 15.973f, 11.999f)
                curveTo(15.973f, 14.192f, 14.19f, 15.974f, 11.999f, 15.974f)
                verticalLineTo(15.974f)
                close()
            }
        }
        .build()
        return _iconEyeOff!!
    }

private var _iconEyeOff: ImageVector? = null
