package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconCard: ImageVector
    get() {
        if (_iconCard != null) {
            return _iconCard!!
        }
        _iconCard = Builder(name = "IconCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(18.0f, 1.5f)
                horizontalLineTo(6.0f)
                curveTo(5.4696f, 1.5f, 4.9609f, 1.7107f, 4.5858f, 2.0858f)
                curveTo(4.2107f, 2.4609f, 4.0f, 2.9696f, 4.0f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(4.0f, 21.0304f, 4.2107f, 21.5391f, 4.5858f, 21.9142f)
                curveTo(4.9609f, 22.2893f, 5.4696f, 22.5f, 6.0f, 22.5f)
                horizontalLineTo(18.0f)
                curveTo(18.5304f, 22.5f, 19.0391f, 22.2893f, 19.4142f, 21.9142f)
                curveTo(19.7893f, 21.5391f, 20.0f, 21.0304f, 20.0f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(20.0f, 2.9696f, 19.7893f, 2.4609f, 19.4142f, 2.0858f)
                curveTo(19.0391f, 1.7107f, 18.5304f, 1.5f, 18.0f, 1.5f)
                close()
            }
        }
        .build()
        return _iconCard!!
    }

private var _iconCard: ImageVector? = null
