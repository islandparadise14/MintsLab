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

public val MLDIcon.IconUserSquare: ImageVector
    get() {
        if (_iconUserSquare != null) {
            return _iconUserSquare!!
        }
        _iconUserSquare = Builder(name = "IconUserSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.992f, 17.892f)
                curveTo(9.77f, 17.892f, 6.492f, 17.58f, 6.492f, 16.408f)
                curveTo(6.492f, 15.236f, 8.032f, 12.716f, 11.992f, 12.716f)
                curveTo(15.952f, 12.716f, 17.492f, 15.236f, 17.492f, 16.408f)
                curveTo(17.492f, 17.58f, 14.214f, 17.892f, 11.992f, 17.892f)
                moveTo(11.992f, 6.116f)
                curveTo(12.7213f, 6.116f, 13.4208f, 6.4057f, 13.9365f, 6.9215f)
                curveTo(14.4523f, 7.4372f, 14.742f, 8.1367f, 14.742f, 8.866f)
                curveTo(14.742f, 9.5954f, 14.4523f, 10.2948f, 13.9365f, 10.8105f)
                curveTo(13.4208f, 11.3263f, 12.7213f, 11.616f, 11.992f, 11.616f)
                curveTo(11.2627f, 11.616f, 10.5632f, 11.3263f, 10.0475f, 10.8105f)
                curveTo(9.5317f, 10.2948f, 9.242f, 9.5954f, 9.242f, 8.866f)
                curveTo(9.242f, 8.1367f, 9.5317f, 7.4372f, 10.0475f, 6.9215f)
                curveTo(10.5632f, 6.4057f, 11.2627f, 6.116f, 11.992f, 6.116f)
                moveTo(19.5f, 2.5f)
                horizontalLineTo(4.5f)
                curveTo(3.9696f, 2.5f, 3.4609f, 2.7107f, 3.0858f, 3.0858f)
                curveTo(2.7107f, 3.4609f, 2.5f, 3.9696f, 2.5f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(2.5f, 20.0304f, 2.7107f, 20.5391f, 3.0858f, 20.9142f)
                curveTo(3.4609f, 21.2893f, 3.9696f, 21.5f, 4.5f, 21.5f)
                horizontalLineTo(19.5f)
                curveTo(20.0304f, 21.5f, 20.5391f, 21.2893f, 20.9142f, 20.9142f)
                curveTo(21.2893f, 20.5391f, 21.5f, 20.0304f, 21.5f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(21.5f, 3.9696f, 21.2893f, 3.4609f, 20.9142f, 3.0858f)
                curveTo(20.5391f, 2.7107f, 20.0304f, 2.5f, 19.5f, 2.5f)
                close()
            }
        }
        .build()
        return _iconUserSquare!!
    }

private var _iconUserSquare: ImageVector? = null
