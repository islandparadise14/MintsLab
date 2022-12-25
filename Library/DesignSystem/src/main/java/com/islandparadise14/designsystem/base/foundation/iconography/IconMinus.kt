package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconMinus: ImageVector
    get() {
        if (_iconMinus != null) {
            return _iconMinus!!
        }
        _iconMinus = Builder(name = "IconMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.118f, 13.2f)
                horizontalLineTo(4.118f)
                curveTo(3.7997f, 13.2f, 3.4945f, 13.0736f, 3.2695f, 12.8485f)
                curveTo(3.0444f, 12.6235f, 2.918f, 12.3183f, 2.918f, 12.0f)
                curveTo(2.918f, 11.6817f, 3.0444f, 11.3765f, 3.2695f, 11.1515f)
                curveTo(3.4945f, 10.9264f, 3.7997f, 10.8f, 4.118f, 10.8f)
                horizontalLineTo(20.118f)
                curveTo(20.4363f, 10.8f, 20.7415f, 10.9264f, 20.9665f, 11.1515f)
                curveTo(21.1916f, 11.3765f, 21.318f, 11.6817f, 21.318f, 12.0f)
                curveTo(21.318f, 12.3183f, 21.1916f, 12.6235f, 20.9665f, 12.8485f)
                curveTo(20.7415f, 13.0736f, 20.4363f, 13.2f, 20.118f, 13.2f)
            }
        }
        .build()
        return _iconMinus!!
    }

private var _iconMinus: ImageVector? = null
