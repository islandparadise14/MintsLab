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

public val MLDIcon.IconHome: ImageVector
    get() {
        if (_iconHome != null) {
            return _iconHome!!
        }
        _iconHome = Builder(name = "IconHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.069f, 8.204f)
                lineTo(12.622f, 1.487f)
                curveTo(12.4453f, 1.3462f, 12.226f, 1.2694f, 12.0f, 1.2694f)
                curveTo(11.774f, 1.2694f, 11.5547f, 1.3462f, 11.378f, 1.487f)
                lineTo(2.93f, 8.204f)
                curveTo(2.6946f, 8.3913f, 2.5044f, 8.6292f, 2.3737f, 8.9002f)
                curveTo(2.2429f, 9.1712f, 2.175f, 9.4682f, 2.175f, 9.769f)
                verticalLineTo(19.187f)
                curveTo(2.175f, 19.8235f, 2.4279f, 20.434f, 2.8779f, 20.8841f)
                curveTo(3.328f, 21.3341f, 3.9385f, 21.587f, 4.575f, 21.587f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.835f)
                curveTo(10.0f, 16.5698f, 10.1054f, 16.3154f, 10.2929f, 16.1279f)
                curveTo(10.4804f, 15.9404f, 10.7348f, 15.835f, 11.0f, 15.835f)
                horizontalLineTo(13.0f)
                curveTo(13.2652f, 15.835f, 13.5196f, 15.9404f, 13.7071f, 16.1279f)
                curveTo(13.8946f, 16.3154f, 14.0f, 16.5698f, 14.0f, 16.835f)
                verticalLineTo(21.587f)
                horizontalLineTo(19.424f)
                curveTo(20.0605f, 21.587f, 20.671f, 21.3341f, 21.1211f, 20.8841f)
                curveTo(21.5711f, 20.434f, 21.824f, 19.8235f, 21.824f, 19.187f)
                verticalLineTo(9.77f)
                curveTo(21.824f, 9.4691f, 21.7561f, 9.1722f, 21.6253f, 8.9012f)
                curveTo(21.4946f, 8.6302f, 21.3045f, 8.3923f, 21.069f, 8.205f)
            }
        }
        .build()
        return _iconHome!!
    }

private var _iconHome: ImageVector? = null
