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

public val MLDIcon.IconCall: ImageVector
    get() {
        if (_iconCall != null) {
            return _iconCall!!
        }
        _iconCall = Builder(name = "IconCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.34f, 16.913f)
                lineTo(18.361f, 13.833f)
                curveTo(18.1688f, 13.6847f, 17.9292f, 13.6115f, 17.687f, 13.6272f)
                curveTo(17.4447f, 13.6428f, 17.2165f, 13.7462f, 17.045f, 13.918f)
                lineTo(14.933f, 16.031f)
                curveTo(14.7757f, 16.1899f, 14.5694f, 16.2911f, 14.3474f, 16.3181f)
                curveTo(14.1254f, 16.3451f, 13.9009f, 16.2965f, 13.71f, 16.18f)
                curveTo(13.03f, 15.763f, 11.892f, 14.955f, 10.468f, 13.53f)
                curveTo(9.044f, 12.107f, 8.236f, 10.968f, 7.819f, 10.289f)
                curveTo(7.7024f, 10.0983f, 7.6537f, 9.8737f, 7.6809f, 9.6518f)
                curveTo(7.7082f, 9.43f, 7.8097f, 9.2238f, 7.969f, 9.067f)
                lineTo(10.081f, 6.954f)
                curveTo(10.253f, 6.7826f, 10.3565f, 6.5542f, 10.372f, 6.3119f)
                curveTo(10.3874f, 6.0695f, 10.3138f, 5.8299f, 10.165f, 5.638f)
                lineTo(7.086f, 1.658f)
                curveTo(6.386f, 0.755f, 5.066f, 0.612f, 4.206f, 1.367f)
                curveTo(3.073f, 2.361f, 1.712f, 3.85f, 1.316f, 5.521f)
                curveTo(0.599f, 8.531f, 1.732f, 12.308f, 6.712f, 17.288f)
                curveTo(11.692f, 22.267f, 15.469f, 23.401f, 18.478f, 22.685f)
                curveTo(20.149f, 22.287f, 21.639f, 20.925f, 22.633f, 19.793f)
                curveTo(23.387f, 18.933f, 23.244f, 17.613f, 22.34f, 16.913f)
            }
        }
        .build()
        return _iconCall!!
    }

private var _iconCall: ImageVector? = null
