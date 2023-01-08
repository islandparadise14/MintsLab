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

public val MLDIcon.IconPlus: ImageVector
    get() {
        if (_iconPlus != null) {
            return _iconPlus!!
        }
        _iconPlus = Builder(name = "IconPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.318f, 10.8f)
                horizontalLineTo(13.318f)
                verticalLineTo(3.8f)
                curveTo(13.318f, 3.4818f, 13.1916f, 3.1765f, 12.9665f, 2.9515f)
                curveTo(12.7415f, 2.7264f, 12.4363f, 2.6f, 12.118f, 2.6f)
                curveTo(11.7997f, 2.6f, 11.4945f, 2.7264f, 11.2695f, 2.9515f)
                curveTo(11.0444f, 3.1765f, 10.918f, 3.4818f, 10.918f, 3.8f)
                verticalLineTo(10.8f)
                horizontalLineTo(3.918f)
                curveTo(3.5997f, 10.8f, 3.2945f, 10.9264f, 3.0695f, 11.1515f)
                curveTo(2.8444f, 11.3765f, 2.718f, 11.6817f, 2.718f, 12.0f)
                curveTo(2.718f, 12.3183f, 2.8444f, 12.6235f, 3.0695f, 12.8485f)
                curveTo(3.2945f, 13.0736f, 3.5997f, 13.2f, 3.918f, 13.2f)
                horizontalLineTo(10.918f)
                verticalLineTo(20.2f)
                curveTo(10.918f, 20.5183f, 11.0444f, 20.8235f, 11.2695f, 21.0485f)
                curveTo(11.4945f, 21.2736f, 11.7997f, 21.4f, 12.118f, 21.4f)
                curveTo(12.4363f, 21.4f, 12.7415f, 21.2736f, 12.9665f, 21.0485f)
                curveTo(13.1916f, 20.8235f, 13.318f, 20.5183f, 13.318f, 20.2f)
                verticalLineTo(13.2f)
                horizontalLineTo(20.318f)
                curveTo(20.6363f, 13.2f, 20.9415f, 13.0736f, 21.1665f, 12.8485f)
                curveTo(21.3916f, 12.6235f, 21.518f, 12.3183f, 21.518f, 12.0f)
                curveTo(21.518f, 11.6817f, 21.3916f, 11.3765f, 21.1665f, 11.1515f)
                curveTo(20.9415f, 10.9264f, 20.6363f, 10.8f, 20.318f, 10.8f)
            }
        }
        .build()
        return _iconPlus!!
    }

private var _iconPlus: ImageVector? = null
