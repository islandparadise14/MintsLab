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

public val MLDIcon.IconSiren: ImageVector
    get() {
        if (_iconSiren != null) {
            return _iconSiren!!
        }
        _iconSiren = Builder(name = "IconSiren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.084f, 20.081f)
                curveTo(21.987f, 19.523f, 21.502f, 19.114f, 20.934f, 19.114f)
                horizontalLineTo(20.352f)
                verticalLineTo(9.879f)
                lineTo(20.348f, 9.628f)
                curveTo(20.216f, 5.131f, 16.529f, 1.527f, 12.0f, 1.527f)
                curveTo(7.388f, 1.527f, 3.647f, 5.266f, 3.647f, 9.88f)
                verticalLineTo(19.115f)
                horizontalLineTo(3.065f)
                curveTo(2.498f, 19.115f, 2.013f, 19.523f, 1.915f, 20.082f)
                lineTo(1.5f, 22.473f)
                horizontalLineTo(22.5f)
                lineTo(22.084f, 20.081f)
                close()
                moveTo(11.1f, 7.22f)
                curveTo(11.1f, 6.724f, 11.503f, 6.32f, 12.0f, 6.32f)
                curveTo(12.498f, 6.32f, 12.9f, 6.724f, 12.9f, 7.22f)
                verticalLineTo(10.936f)
                curveTo(12.9f, 11.434f, 12.498f, 11.838f, 12.0f, 11.838f)
                curveTo(11.503f, 11.838f, 11.1f, 11.434f, 11.1f, 10.936f)
                verticalLineTo(7.22f)
                close()
                moveTo(12.001f, 13.339f)
                curveTo(12.653f, 13.339f, 13.184f, 13.868f, 13.184f, 14.522f)
                curveTo(13.184f, 15.175f, 12.654f, 15.705f, 12.001f, 15.705f)
                curveTo(11.346f, 15.705f, 10.816f, 15.175f, 10.816f, 14.522f)
                curveTo(10.816f, 13.869f, 11.346f, 13.339f, 12.001f, 13.339f)
                close()
            }
        }
        .build()
        return _iconSiren!!
    }

private var _iconSiren: ImageVector? = null
