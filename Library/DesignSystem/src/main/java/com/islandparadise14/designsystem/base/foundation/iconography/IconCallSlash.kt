package com.islandparadise14.designsystem.base.foundation.iconography

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.Iconography

public val Iconography.IconCallSlash: ImageVector
    get() {
        if (_iconCallSlash != null) {
            return _iconCallSlash!!
        }
        _iconCallSlash = Builder(name = "IconCallSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.46f, 11.231f)
                    curveTo(8.2336f, 10.9261f, 8.0201f, 10.6118f, 7.82f, 10.289f)
                    curveTo(7.7035f, 10.0981f, 7.6549f, 9.8734f, 7.6821f, 9.6514f)
                    curveTo(7.7093f, 9.4294f, 7.8108f, 9.2231f, 7.97f, 9.066f)
                    lineTo(10.082f, 6.954f)
                    curveTo(10.2541f, 6.7824f, 10.3576f, 6.5539f, 10.3731f, 6.3114f)
                    curveTo(10.3886f, 6.0689f, 10.3149f, 5.8291f, 10.166f, 5.637f)
                    lineTo(7.086f, 1.66f)
                    curveTo(6.386f, 0.755f, 5.065f, 0.613f, 4.206f, 1.367f)
                    curveTo(3.074f, 2.361f, 1.713f, 3.851f, 1.315f, 5.522f)
                    curveTo(0.712f, 8.06f, 1.433f, 11.146f, 4.655f, 15.036f)
                    lineTo(8.461f, 11.232f)
                    lineTo(8.46f, 11.231f)
                    close()
                    moveTo(22.34f, 16.913f)
                    lineTo(18.362f, 13.833f)
                    curveTo(18.1698f, 13.6847f, 17.9302f, 13.6115f, 17.688f, 13.6272f)
                    curveTo(17.4457f, 13.6428f, 17.2175f, 13.7462f, 17.046f, 13.918f)
                    lineTo(14.934f, 16.031f)
                    curveTo(14.7767f, 16.1899f, 14.5704f, 16.2911f, 14.3484f, 16.3181f)
                    curveTo(14.1264f, 16.3451f, 13.9019f, 16.2965f, 13.711f, 16.18f)
                    curveTo(13.177f, 15.852f, 12.357f, 15.278f, 11.34f, 14.358f)
                    lineTo(20.849f, 4.848f)
                    curveTo(21.071f, 4.6223f, 21.1949f, 4.3181f, 21.1936f, 4.0015f)
                    curveTo(21.1923f, 3.685f, 21.066f, 3.3817f, 20.8421f, 3.1579f)
                    curveTo(20.6183f, 2.934f, 20.315f, 2.8077f, 19.9985f, 2.8064f)
                    curveTo(19.6819f, 2.8051f, 19.3777f, 2.929f, 19.152f, 3.151f)
                    lineTo(1.152f, 21.151f)
                    curveTo(0.9268f, 21.376f, 0.8003f, 21.6813f, 0.8002f, 21.9997f)
                    curveTo(0.8001f, 22.318f, 0.9265f, 22.6233f, 1.1515f, 22.8485f)
                    curveTo(1.3765f, 23.0737f, 1.6818f, 23.2002f, 2.0001f, 23.2003f)
                    curveTo(2.3185f, 23.2004f, 2.6238f, 23.074f, 2.849f, 22.849f)
                    lineTo(7.575f, 18.122f)
                    curveTo(12.132f, 22.392f, 15.645f, 23.359f, 18.479f, 22.685f)
                    curveTo(20.149f, 22.287f, 21.639f, 20.925f, 22.634f, 19.793f)
                    curveTo(23.388f, 18.933f, 23.244f, 17.613f, 22.341f, 16.913f)
                }
            }
        }
        .build()
        return _iconCallSlash!!
    }

private var _iconCallSlash: ImageVector? = null
