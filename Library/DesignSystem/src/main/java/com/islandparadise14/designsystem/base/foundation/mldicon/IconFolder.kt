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

public val MLDIcon.IconFolder: ImageVector
    get() {
        if (_iconFolder != null) {
            return _iconFolder!!
        }
        _iconFolder = Builder(name = "IconFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.061f, 3.181f)
                curveTo(9.666f, 2.7862f, 9.1305f, 2.5643f, 8.572f, 2.564f)
                horizontalLineTo(4.106f)
                curveTo(3.5475f, 2.564f, 3.0118f, 2.7859f, 2.6168f, 3.1808f)
                curveTo(2.2219f, 3.5758f, 2.0f, 4.1115f, 2.0f, 4.67f)
                verticalLineTo(5.647f)
                horizontalLineTo(12.527f)
                lineTo(10.061f, 3.181f)
                close()
                moveTo(19.895f, 6.647f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.331f)
                curveTo(2.0f, 20.494f, 2.943f, 21.436f, 4.106f, 21.436f)
                horizontalLineTo(19.895f)
                curveTo(20.1715f, 21.4361f, 20.4453f, 21.3818f, 20.7007f, 21.276f)
                curveTo(20.9562f, 21.1703f, 21.1883f, 21.0152f, 21.3838f, 20.8197f)
                curveTo(21.5792f, 20.6243f, 21.7343f, 20.3921f, 21.84f, 20.1367f)
                curveTo(21.9458f, 19.8812f, 22.0001f, 19.6075f, 22.0f, 19.331f)
                verticalLineTo(8.752f)
                curveTo(22.0001f, 8.4755f, 21.9458f, 8.2017f, 21.84f, 7.9463f)
                curveTo(21.7343f, 7.6908f, 21.5792f, 7.4587f, 21.3838f, 7.2632f)
                curveTo(21.1883f, 7.0677f, 20.9562f, 6.9127f, 20.7007f, 6.807f)
                curveTo(20.4453f, 6.7012f, 20.1715f, 6.6469f, 19.895f, 6.647f)
            }
        }
        .build()
        return _iconFolder!!
    }

private var _iconFolder: ImageVector? = null
