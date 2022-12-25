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

public val Iconography.IconX: ImageVector
    get() {
        if (_iconX != null) {
            return _iconX!!
        }
        _iconX = Builder(name = "IconX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.815f, 12.0f)
                lineTo(19.466f, 6.349f)
                curveTo(19.5775f, 6.2376f, 19.6659f, 6.1053f, 19.7263f, 5.9597f)
                curveTo(19.7867f, 5.8141f, 19.8178f, 5.658f, 19.8178f, 5.5003f)
                curveTo(19.8179f, 5.3427f, 19.7869f, 5.1866f, 19.7266f, 5.041f)
                curveTo(19.6663f, 4.8953f, 19.5779f, 4.763f, 19.4665f, 4.6515f)
                curveTo(19.3551f, 4.54f, 19.2228f, 4.4516f, 19.0772f, 4.3912f)
                curveTo(18.9315f, 4.3308f, 18.7755f, 4.2997f, 18.6178f, 4.2997f)
                curveTo(18.4602f, 4.2996f, 18.3041f, 4.3306f, 18.1585f, 4.3909f)
                curveTo(18.0128f, 4.4512f, 17.8805f, 4.5396f, 17.769f, 4.651f)
                lineTo(12.118f, 10.303f)
                lineTo(6.466f, 4.651f)
                curveTo(6.2383f, 4.4384f, 5.937f, 4.3225f, 5.6255f, 4.3279f)
                curveTo(5.3141f, 4.3332f, 5.0169f, 4.4594f, 4.7967f, 4.6797f)
                curveTo(4.5765f, 4.9f, 4.4505f, 5.1973f, 4.4454f, 5.5087f)
                curveTo(4.4402f, 5.8202f, 4.5562f, 6.1215f, 4.769f, 6.349f)
                lineTo(10.421f, 12.0f)
                lineTo(4.769f, 17.651f)
                curveTo(4.602f, 17.8192f, 4.4884f, 18.033f, 4.4425f, 18.2656f)
                curveTo(4.3967f, 18.4982f, 4.4207f, 18.7391f, 4.5114f, 18.9581f)
                curveTo(4.6021f, 19.1771f, 4.7556f, 19.3644f, 4.9525f, 19.4964f)
                curveTo(5.1494f, 19.6284f, 5.3809f, 19.6992f, 5.618f, 19.7f)
                curveTo(5.925f, 19.7f, 6.232f, 19.583f, 6.466f, 19.349f)
                lineTo(12.118f, 13.697f)
                lineTo(17.769f, 19.349f)
                curveTo(17.8803f, 19.4607f, 18.0125f, 19.5493f, 18.1581f, 19.6097f)
                curveTo(18.3037f, 19.6702f, 18.4598f, 19.7013f, 18.6175f, 19.7013f)
                curveTo(18.7751f, 19.7013f, 18.9313f, 19.6702f, 19.0769f, 19.6097f)
                curveTo(19.2225f, 19.5493f, 19.3547f, 19.4607f, 19.466f, 19.349f)
                curveTo(19.5776f, 19.2375f, 19.6661f, 19.1052f, 19.7265f, 18.9595f)
                curveTo(19.7869f, 18.8138f, 19.8179f, 18.6577f, 19.8179f, 18.5f)
                curveTo(19.8179f, 18.3423f, 19.7869f, 18.1861f, 19.7265f, 18.0405f)
                curveTo(19.6661f, 17.8948f, 19.5776f, 17.7624f, 19.466f, 17.651f)
                lineTo(13.815f, 12.0f)
                close()
            }
        }
        .build()
        return _iconX!!
    }

private var _iconX: ImageVector? = null
