package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val MLDIcon.IconBasketball: ImageVector
    get() {
        if (_iconBasketball != null) {
            return _iconBasketball!!
        }
        _iconBasketball = Builder(name = "IconBasketball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3f, 11.3f)
                verticalLineTo(1.036f)
                curveTo(8.599f, 1.206f, 6.164f, 2.343f, 4.34f, 4.115f)
                curveTo(6.208f, 5.98f, 7.426f, 8.498f, 7.602f, 11.3f)
                horizontalLineTo(11.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.202f, 11.3f)
                curveTo(6.03f, 8.909f, 4.988f, 6.76f, 3.4f, 5.152f)
                curveTo(2.038f, 6.86f, 1.182f, 8.982f, 1.035f, 11.3f)
                horizontalLineTo(6.202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7f, 11.3f)
                horizontalLineTo(16.398f)
                curveTo(16.573f, 8.499f, 17.792f, 5.981f, 19.66f, 4.115f)
                curveTo(17.836f, 2.343f, 15.401f, 1.206f, 12.7f, 1.036f)
                verticalLineTo(11.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.965f, 11.3f)
                curveTo(22.818f, 8.982f, 21.962f, 6.86f, 20.6f, 5.152f)
                curveTo(19.012f, 6.759f, 17.97f, 8.908f, 17.799f, 11.299f)
                horizontalLineTo(22.965f)
                verticalLineTo(11.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.398f, 12.7f)
                horizontalLineTo(12.7f)
                verticalLineTo(22.965f)
                curveTo(15.401f, 22.795f, 17.836f, 21.658f, 19.66f, 19.885f)
                curveTo(17.792f, 18.019f, 16.574f, 15.501f, 16.398f, 12.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.035f, 12.7f)
                curveTo(1.181f, 15.017f, 2.038f, 17.139f, 3.4f, 18.847f)
                curveTo(4.988f, 17.24f, 6.03f, 15.091f, 6.201f, 12.7f)
                horizontalLineTo(1.035f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.798f, 12.7f)
                curveTo(17.969f, 15.091f, 19.011f, 17.24f, 20.599f, 18.847f)
                curveTo(21.961f, 17.139f, 22.818f, 15.017f, 22.964f, 12.7f)
                horizontalLineTo(17.798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3f, 12.7f)
                horizontalLineTo(7.602f)
                curveTo(7.427f, 15.501f, 6.208f, 18.019f, 4.34f, 19.885f)
                curveTo(6.164f, 21.657f, 8.599f, 22.794f, 11.3f, 22.965f)
                verticalLineTo(12.7f)
                close()
            }
        }
        .build()
        return _iconBasketball!!
    }

private var _iconBasketball: ImageVector? = null
