package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconEnter: ImageVector
    get() {
        if (_iconEnter != null) {
            return _iconEnter!!
        }
        _iconEnter = Builder(name = "IconEnter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 4.0f)
                curveTo(20.71f, 3.39f, 20.22f, 2.91f, 19.61f, 2.91f)
                horizontalLineTo(19.6f)
                curveTo(18.99f, 2.91f, 18.5f, 3.41f, 18.51f, 4.02f)
                lineTo(18.55f, 12.6f)
                curveTo(18.55f, 13.0f, 18.4f, 13.38f, 18.11f, 13.66f)
                curveTo(17.83f, 13.94f, 17.45f, 14.1f, 17.05f, 14.1f)
                horizontalLineTo(5.99f)
                lineTo(9.92f, 10.17f)
                curveTo(10.35f, 9.74f, 10.35f, 9.04f, 9.92f, 8.61f)
                curveTo(9.49f, 8.18f, 8.8f, 8.18f, 8.36f, 8.61f)
                lineTo(2.55f, 14.42f)
                curveTo(2.34f, 14.63f, 2.23f, 14.91f, 2.23f, 15.2f)
                curveTo(2.23f, 15.49f, 2.35f, 15.77f, 2.55f, 15.98f)
                lineTo(8.36f, 21.79f)
                curveTo(8.57f, 22.0f, 8.86f, 22.11f, 9.14f, 22.11f)
                curveTo(9.42f, 22.11f, 9.7f, 22.0f, 9.92f, 21.79f)
                curveTo(10.35f, 21.36f, 10.35f, 20.66f, 9.92f, 20.24f)
                lineTo(5.99f, 16.31f)
                horizontalLineTo(17.06f)
                curveTo(18.05f, 16.31f, 18.98f, 15.92f, 19.68f, 15.22f)
                curveTo(20.38f, 14.52f, 20.76f, 13.59f, 20.76f, 12.6f)
                lineTo(20.71f, 4.0f)
                close()
            }
        }
        .build()
        return _iconEnter!!
    }

private var _iconEnter: ImageVector? = null
