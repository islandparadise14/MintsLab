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

public val MLDIcon.IconQuestionCircle: ImageVector
    get() {
        if (_iconQuestionCircle != null) {
            return _iconQuestionCircle!!
        }
        _iconQuestionCircle = Builder(name = "IconQuestionCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.604f, 10.245f)
                curveTo(15.317f, 11.494f, 14.457f, 12.044f, 13.828f, 12.447f)
                curveTo(13.177f, 12.863f, 12.952f, 13.037f, 12.952f, 13.626f)
                curveTo(12.952f, 13.8647f, 12.8572f, 14.0936f, 12.6884f, 14.2624f)
                curveTo(12.5196f, 14.4312f, 12.2907f, 14.526f, 12.052f, 14.526f)
                curveTo(11.8133f, 14.526f, 11.5844f, 14.4312f, 11.4156f, 14.2624f)
                curveTo(11.2468f, 14.0936f, 11.152f, 13.8647f, 11.152f, 13.626f)
                curveTo(11.152f, 12.021f, 12.138f, 11.391f, 12.858f, 10.93f)
                curveTo(13.43f, 10.565f, 13.733f, 10.35f, 13.85f, 9.842f)
                curveTo(13.951f, 9.401f, 13.871f, 9.011f, 13.61f, 8.683f)
                curveTo(13.268f, 8.254f, 12.657f, 7.976f, 12.052f, 7.976f)
                curveTo(11.074f, 7.976f, 10.278f, 8.773f, 10.278f, 9.751f)
                curveTo(10.278f, 9.9897f, 10.1832f, 10.2186f, 10.0144f, 10.3874f)
                curveTo(9.8456f, 10.5562f, 9.6167f, 10.651f, 9.378f, 10.651f)
                curveTo(9.1393f, 10.651f, 8.9104f, 10.5562f, 8.7416f, 10.3874f)
                curveTo(8.5728f, 10.2186f, 8.478f, 9.9897f, 8.478f, 9.751f)
                curveTo(8.4791f, 8.8034f, 8.8559f, 7.895f, 9.526f, 7.225f)
                curveTo(10.196f, 6.5549f, 11.1044f, 6.1781f, 12.052f, 6.177f)
                curveTo(13.201f, 6.177f, 14.337f, 6.707f, 15.018f, 7.562f)
                curveTo(15.62f, 8.318f, 15.828f, 9.271f, 15.604f, 10.245f)
                moveTo(12.068f, 17.984f)
                curveTo(11.7497f, 17.984f, 11.4445f, 17.8576f, 11.2195f, 17.6325f)
                curveTo(10.9944f, 17.4075f, 10.868f, 17.1023f, 10.868f, 16.784f)
                curveTo(10.868f, 16.4657f, 10.9944f, 16.1605f, 11.2195f, 15.9355f)
                curveTo(11.4445f, 15.7104f, 11.7497f, 15.584f, 12.068f, 15.584f)
                curveTo(12.3863f, 15.584f, 12.6915f, 15.7104f, 12.9165f, 15.9355f)
                curveTo(13.1416f, 16.1605f, 13.268f, 16.4657f, 13.268f, 16.784f)
                curveTo(13.268f, 17.1023f, 13.1416f, 17.4075f, 12.9165f, 17.6325f)
                curveTo(12.6915f, 17.8576f, 12.3863f, 17.984f, 12.068f, 17.984f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.924f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.076f, 5.924f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.076f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconQuestionCircle!!
    }

private var _iconQuestionCircle: ImageVector? = null
