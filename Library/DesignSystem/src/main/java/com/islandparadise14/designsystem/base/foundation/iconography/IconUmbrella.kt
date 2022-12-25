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

public val Iconography.IconUmbrella: ImageVector
    get() {
        if (_iconUmbrella != null) {
            return _iconUmbrella!!
        }
        _iconUmbrella = Builder(name = "IconUmbrella", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.26f)
                curveTo(6.297f, 2.26f, 1.608f, 6.6f, 1.055f, 12.157f)
                curveTo(1.0415f, 12.2966f, 1.0573f, 12.4375f, 1.1014f, 12.5706f)
                curveTo(1.1456f, 12.7038f, 1.2171f, 12.8262f, 1.3113f, 12.9301f)
                curveTo(1.4056f, 13.0339f, 1.5206f, 13.1169f, 1.6488f, 13.1738f)
                curveTo(1.777f, 13.2306f, 1.9157f, 13.26f, 2.056f, 13.26f)
                horizontalLineTo(11.257f)
                verticalLineTo(19.807f)
                curveTo(11.2491f, 20.049f, 11.1474f, 20.2785f, 10.9733f, 20.4469f)
                curveTo(10.7993f, 20.6153f, 10.5667f, 20.7095f, 10.3245f, 20.7095f)
                curveTo(10.0823f, 20.7095f, 9.8497f, 20.6153f, 9.6756f, 20.4469f)
                curveTo(9.5016f, 20.2785f, 9.3999f, 20.049f, 9.392f, 19.807f)
                curveTo(9.3805f, 19.5495f, 9.2701f, 19.3064f, 9.0838f, 19.1283f)
                curveTo(8.8975f, 18.9501f, 8.6497f, 18.8507f, 8.392f, 18.8507f)
                curveTo(8.1343f, 18.8507f, 7.8864f, 18.9501f, 7.7002f, 19.1283f)
                curveTo(7.5139f, 19.3064f, 7.4035f, 19.5495f, 7.392f, 19.807f)
                curveTo(7.3928f, 20.5844f, 7.702f, 21.3297f, 8.2516f, 21.8794f)
                curveTo(8.8013f, 22.429f, 9.5466f, 22.7382f, 10.324f, 22.739f)
                curveTo(11.1015f, 22.7382f, 11.8469f, 22.4291f, 12.3967f, 21.8794f)
                curveTo(12.9466f, 21.3298f, 13.2559f, 20.5845f, 13.257f, 19.807f)
                verticalLineTo(13.26f)
                horizontalLineTo(21.944f)
                curveTo(22.537f, 13.26f, 23.004f, 12.747f, 22.945f, 12.157f)
                curveTo(22.393f, 6.6f, 17.703f, 2.26f, 12.0f, 2.26f)
                close()
            }
        }
        .build()
        return _iconUmbrella!!
    }

private var _iconUmbrella: ImageVector? = null
