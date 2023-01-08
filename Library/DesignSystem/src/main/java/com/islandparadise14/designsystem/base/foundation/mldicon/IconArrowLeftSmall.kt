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

public val MLDIcon.IconArrowLeftSmall: ImageVector
    get() {
        if (_iconArrowLeftSmall != null) {
            return _iconArrowLeftSmall!!
        }
        _iconArrowLeftSmall = Builder(name = "IconArrowLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.375f, 20.1f)
                curveTo(15.1977f, 20.1001f, 15.0222f, 20.0652f, 14.8585f, 19.9972f)
                curveTo(14.6948f, 19.9292f, 14.5461f, 19.8296f, 14.421f, 19.704f)
                lineTo(7.671f, 12.954f)
                curveTo(7.5456f, 12.8286f, 7.4461f, 12.6798f, 7.3782f, 12.516f)
                curveTo(7.3104f, 12.3522f, 7.2754f, 12.1766f, 7.2754f, 11.9993f)
                curveTo(7.2754f, 11.8219f, 7.3104f, 11.6464f, 7.3782f, 11.4825f)
                curveTo(7.4461f, 11.3187f, 7.5456f, 11.1699f, 7.671f, 11.0445f)
                lineTo(14.421f, 4.2945f)
                curveTo(14.5454f, 4.1648f, 14.6944f, 4.0612f, 14.8593f, 3.9898f)
                curveTo(15.0243f, 3.9185f, 15.2018f, 3.8807f, 15.3815f, 3.8789f)
                curveTo(15.5612f, 3.877f, 15.7395f, 3.9111f, 15.9059f, 3.979f)
                curveTo(16.0723f, 4.047f, 16.2234f, 4.1475f, 16.3504f, 4.2746f)
                curveTo(16.4775f, 4.4017f, 16.5778f, 4.5529f, 16.6456f, 4.7194f)
                curveTo(16.7135f, 4.8858f, 16.7474f, 5.0641f, 16.7454f, 5.2438f)
                curveTo(16.7434f, 5.4235f, 16.7055f, 5.601f, 16.634f, 5.7659f)
                curveTo(16.5625f, 5.9308f, 16.4588f, 6.0797f, 16.329f, 6.204f)
                lineTo(10.5345f, 12.0f)
                lineTo(16.329f, 17.7945f)
                curveTo(16.5181f, 17.9832f, 16.6469f, 18.2238f, 16.6992f, 18.4858f)
                curveTo(16.7515f, 18.7477f, 16.7249f, 19.0193f, 16.6227f, 19.2662f)
                curveTo(16.5206f, 19.513f, 16.3475f, 19.724f, 16.1254f, 19.8724f)
                curveTo(15.9033f, 20.0209f, 15.6421f, 20.1001f, 15.375f, 20.1f)
                close()
            }
        }
        .build()
        return _iconArrowLeftSmall!!
    }

private var _iconArrowLeftSmall: ImageVector? = null
