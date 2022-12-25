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

public val Iconography.IconRefresh: ImageVector
    get() {
        if (_iconRefresh != null) {
            return _iconRefresh!!
        }
        _iconRefresh = Builder(name = "IconRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.967f, 12.362f)
                curveTo(20.6535f, 12.3074f, 20.3312f, 12.3796f, 20.0709f, 12.5626f)
                curveTo(19.8106f, 12.7456f, 19.6337f, 13.0245f, 19.579f, 13.338f)
                curveTo(19.2677f, 15.1268f, 18.3341f, 16.7479f, 16.9432f, 17.915f)
                curveTo(15.5523f, 19.0821f, 13.7937f, 19.72f, 11.978f, 19.716f)
                curveTo(7.724f, 19.716f, 4.263f, 16.255f, 4.263f, 12.0f)
                curveTo(4.263f, 7.746f, 7.724f, 4.285f, 11.978f, 4.285f)
                curveTo(13.912f, 4.285f, 15.731f, 4.999f, 17.153f, 6.289f)
                lineTo(16.161f, 7.281f)
                curveTo(16.0312f, 7.4103f, 15.9399f, 7.573f, 15.8971f, 7.7512f)
                curveTo(15.8543f, 7.9293f, 15.8618f, 8.1158f, 15.9187f, 8.2899f)
                curveTo(15.9756f, 8.464f, 16.0797f, 8.6189f, 16.2194f, 8.7374f)
                curveTo(16.3591f, 8.8559f, 16.5289f, 8.9333f, 16.71f, 8.961f)
                lineTo(20.922f, 9.611f)
                curveTo(21.0759f, 9.6347f, 21.2332f, 9.6218f, 21.3811f, 9.5733f)
                curveTo(21.5291f, 9.5248f, 21.6635f, 9.4422f, 21.7735f, 9.332f)
                curveTo(21.8835f, 9.2218f, 21.9659f, 9.0872f, 22.0142f, 8.9392f)
                curveTo(22.0624f, 8.7912f, 22.075f, 8.6338f, 22.051f, 8.48f)
                lineTo(21.402f, 4.269f)
                curveTo(21.3741f, 4.088f, 21.2967f, 3.9183f, 21.1782f, 3.7787f)
                curveTo(21.0597f, 3.6391f, 20.9049f, 3.5351f, 20.7309f, 3.4781f)
                curveTo(20.5569f, 3.4211f, 20.3705f, 3.4135f, 20.1924f, 3.456f)
                curveTo(20.0143f, 3.4985f, 19.8515f, 3.5896f, 19.722f, 3.719f)
                lineTo(18.85f, 4.592f)
                curveTo(16.9863f, 2.8496f, 14.5293f, 1.8818f, 11.978f, 1.885f)
                curveTo(6.401f, 1.885f, 1.863f, 6.423f, 1.863f, 12.0f)
                curveTo(1.863f, 17.578f, 6.401f, 22.115f, 11.978f, 22.115f)
                curveTo(16.906f, 22.115f, 21.096f, 18.597f, 21.943f, 13.75f)
                curveTo(21.9976f, 13.4365f, 21.9254f, 13.1142f, 21.7424f, 12.8539f)
                curveTo(21.5594f, 12.5936f, 21.2805f, 12.4167f, 20.967f, 12.362f)
            }
        }
        .build()
        return _iconRefresh!!
    }

private var _iconRefresh: ImageVector? = null
