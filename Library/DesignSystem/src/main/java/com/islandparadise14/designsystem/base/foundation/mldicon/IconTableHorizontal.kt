package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconTableHorizontal: ImageVector
    get() {
        if (_iconTableHorizontal != null) {
            return _iconTableHorizontal!!
        }
        _iconTableHorizontal = Builder(name = "IconTableHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF8B95A1)),
                    strokeLineWidth = 2.4f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.6f, 20.4f)
                horizontalLineTo(5.6f)
                curveTo(4.6f, 20.4f, 3.9f, 19.6f, 3.9f, 18.7f)
                verticalLineTo(5.7f)
                curveTo(3.9f, 4.7f, 4.7f, 4.0f, 5.6f, 4.0f)
                horizontalLineTo(18.6f)
                curveTo(19.6f, 4.0f, 20.3f, 4.8f, 20.3f, 5.7f)
                verticalLineTo(18.7f)
                curveTo(20.3f, 19.7f, 19.6f, 20.4f, 18.6f, 20.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF8B95A1)),
                    strokeLineWidth = 2.4f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1f, 12.2f)
                horizontalLineTo(20.1f)
            }
        }
        .build()
        return _iconTableHorizontal!!
    }

private var _iconTableHorizontal: ImageVector? = null
