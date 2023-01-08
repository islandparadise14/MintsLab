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

public val MLDIcon.IconShoppingBag: ImageVector
    get() {
        if (_iconShoppingBag != null) {
            return _iconShoppingBag!!
        }
        _iconShoppingBag = Builder(name = "IconShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.435f, 4.482f)
                curveTo(9.4358f, 3.802f, 9.7063f, 3.15f, 10.1871f, 2.6692f)
                curveTo(10.668f, 2.1883f, 11.32f, 1.9178f, 12.0f, 1.917f)
                curveTo(12.6801f, 1.9178f, 13.3322f, 2.1883f, 13.8132f, 2.6691f)
                curveTo(14.2942f, 3.1499f, 14.5649f, 3.8019f, 14.566f, 4.482f)
                horizontalLineTo(9.436f)
                horizontalLineTo(9.435f)
                close()
                moveTo(21.466f, 18.024f)
                lineTo(19.506f, 5.33f)
                curveTo(19.4697f, 5.094f, 19.3501f, 4.8787f, 19.1689f, 4.7232f)
                curveTo(18.9877f, 4.5676f, 18.7568f, 4.4821f, 18.518f, 4.482f)
                horizontalLineTo(16.366f)
                curveTo(16.3647f, 3.3246f, 15.9042f, 2.2149f, 15.0857f, 1.3966f)
                curveTo(14.2672f, 0.5783f, 13.1574f, 0.1181f, 12.0f, 0.117f)
                curveTo(10.8427f, 0.1183f, 9.7332f, 0.5786f, 8.9149f, 1.3969f)
                curveTo(8.0966f, 2.2153f, 7.6363f, 3.3247f, 7.635f, 4.482f)
                horizontalLineTo(5.483f)
                curveTo(5.2442f, 4.4821f, 5.0133f, 4.5676f, 4.8321f, 4.7232f)
                curveTo(4.6509f, 4.8787f, 4.5313f, 5.094f, 4.495f, 5.33f)
                lineTo(2.535f, 18.024f)
                curveTo(2.4688f, 18.4517f, 2.4959f, 18.8886f, 2.6144f, 19.3048f)
                curveTo(2.733f, 19.721f, 2.9403f, 20.1066f, 3.222f, 20.4351f)
                curveTo(3.5037f, 20.7636f, 3.8531f, 21.0273f, 4.2463f, 21.208f)
                curveTo(4.6396f, 21.3887f, 5.0672f, 21.4822f, 5.5f, 21.482f)
                horizontalLineTo(18.502f)
                curveTo(18.9347f, 21.482f, 19.3623f, 21.3884f, 19.7554f, 21.2077f)
                curveTo(20.1486f, 21.0269f, 20.498f, 20.7632f, 20.7796f, 20.4348f)
                curveTo(21.0613f, 20.1063f, 21.2685f, 19.7207f, 21.3872f, 19.3046f)
                curveTo(21.5058f, 18.8885f, 21.5331f, 18.4516f, 21.467f, 18.024f)
                horizontalLineTo(21.466f)
                close()
            }
        }
        .build()
        return _iconShoppingBag!!
    }

private var _iconShoppingBag: ImageVector? = null
