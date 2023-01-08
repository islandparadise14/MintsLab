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

public val MLDIcon.IconPin: ImageVector
    get() {
        if (_iconPin != null) {
            return _iconPin!!
        }
        _iconPin = Builder(name = "IconPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.079f, 5.31f)
                lineTo(12.989f, 0.64f)
                curveTo(12.8327f, 0.5499f, 12.6554f, 0.5024f, 12.4749f, 0.5024f)
                curveTo(12.2945f, 0.5024f, 12.1172f, 0.5499f, 11.9609f, 0.6401f)
                curveTo(11.8046f, 0.7302f, 11.6747f, 0.8599f, 11.5843f, 1.0161f)
                curveTo(11.494f, 1.1723f, 11.4463f, 1.3495f, 11.446f, 1.53f)
                verticalLineTo(2.97f)
                curveTo(11.4462f, 3.8724f, 11.2088f, 4.7589f, 10.7577f, 5.5404f)
                curveTo(10.3065f, 6.3219f, 9.6575f, 6.9709f, 8.876f, 7.422f)
                lineTo(2.923f, 10.86f)
                curveTo(2.7666f, 10.9502f, 2.6367f, 11.08f, 2.5464f, 11.2363f)
                curveTo(2.4562f, 11.3926f, 2.4086f, 11.57f, 2.4086f, 11.7505f)
                curveTo(2.4086f, 11.931f, 2.4562f, 12.1084f, 2.5464f, 12.2647f)
                curveTo(2.6367f, 12.421f, 2.7666f, 12.5508f, 2.923f, 12.641f)
                lineTo(8.318f, 15.755f)
                curveTo(8.271f, 15.81f, 8.214f, 15.851f, 8.178f, 15.915f)
                lineTo(4.722f, 21.9f)
                curveTo(4.5697f, 22.1751f, 4.5316f, 22.4991f, 4.6157f, 22.8021f)
                curveTo(4.6998f, 23.1051f, 4.8995f, 23.363f, 5.1719f, 23.5202f)
                curveTo(5.4442f, 23.6775f, 5.7674f, 23.7216f, 6.0718f, 23.643f)
                curveTo(6.3763f, 23.5644f, 6.6378f, 23.3694f, 6.8f, 23.1f)
                lineTo(10.256f, 17.116f)
                curveTo(10.293f, 17.051f, 10.3f, 16.981f, 10.323f, 16.914f)
                lineTo(15.719f, 20.028f)
                curveTo(15.8753f, 20.1182f, 16.0525f, 20.1657f, 16.2329f, 20.1657f)
                curveTo(16.4134f, 20.1657f, 16.5906f, 20.1183f, 16.7469f, 20.0281f)
                curveTo(16.9032f, 19.9379f, 17.0329f, 19.8081f, 17.1232f, 19.6519f)
                curveTo(17.2134f, 19.4957f, 17.261f, 19.3184f, 17.261f, 19.138f)
                verticalLineTo(12.264f)
                curveTo(17.261f, 10.427f, 18.24f, 8.73f, 19.831f, 7.812f)
                lineTo(21.079f, 7.092f)
                curveTo(21.2356f, 7.0019f, 21.3657f, 6.872f, 21.4562f, 6.7156f)
                curveTo(21.5466f, 6.5592f, 21.5943f, 6.3817f, 21.5943f, 6.201f)
                curveTo(21.5943f, 6.0203f, 21.5466f, 5.8428f, 21.4562f, 5.6864f)
                curveTo(21.3657f, 5.5299f, 21.2356f, 5.4001f, 21.079f, 5.31f)
            }
        }
        .build()
        return _iconPin!!
    }

private var _iconPin: ImageVector? = null
