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

public val MLDIcon.IconCheckCircle: ImageVector
    get() {
        if (_iconCheckCircle != null) {
            return _iconCheckCircle!!
        }
        _iconCheckCircle = Builder(name = "IconCheckCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.207f, 10.215f)
                lineTo(11.624f, 15.799f)
                curveTo(11.4359f, 15.9858f, 11.1816f, 16.0906f, 10.9165f, 16.0906f)
                curveTo(10.6514f, 16.0906f, 10.3971f, 15.9858f, 10.209f, 15.799f)
                lineTo(6.793f, 12.383f)
                curveTo(6.7002f, 12.2902f, 6.6265f, 12.1799f, 6.5763f, 12.0586f)
                curveTo(6.526f, 11.9373f, 6.5002f, 11.8073f, 6.5002f, 11.676f)
                curveTo(6.5002f, 11.4108f, 6.6055f, 11.1565f, 6.793f, 10.969f)
                curveTo(6.9805f, 10.7815f, 7.2348f, 10.6762f, 7.5f, 10.6762f)
                curveTo(7.7652f, 10.6762f, 8.0195f, 10.7815f, 8.207f, 10.969f)
                lineTo(10.916f, 13.678f)
                lineTo(15.793f, 8.801f)
                curveTo(15.8858f, 8.7082f, 15.9961f, 8.6345f, 16.1174f, 8.5843f)
                curveTo(16.2387f, 8.534f, 16.3687f, 8.5082f, 16.5f, 8.5082f)
                curveTo(16.6313f, 8.5082f, 16.7613f, 8.534f, 16.8826f, 8.5843f)
                curveTo(17.0039f, 8.6345f, 17.1142f, 8.7082f, 17.207f, 8.801f)
                curveTo(17.2998f, 8.8938f, 17.3735f, 9.0041f, 17.4237f, 9.1254f)
                curveTo(17.474f, 9.2467f, 17.4998f, 9.3767f, 17.4998f, 9.508f)
                curveTo(17.4998f, 9.6393f, 17.474f, 9.7693f, 17.4237f, 9.8906f)
                curveTo(17.3735f, 10.0119f, 17.2998f, 10.1222f, 17.207f, 10.215f)
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconCheckCircle!!
    }

private var _iconCheckCircle: ImageVector? = null
