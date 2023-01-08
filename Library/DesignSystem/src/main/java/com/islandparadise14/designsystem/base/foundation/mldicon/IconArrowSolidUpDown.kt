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

public val MLDIcon.IconArrowSolidUpDown: ImageVector
    get() {
        if (_iconArrowSolidUpDown != null) {
            return _iconArrowSolidUpDown!!
        }
        _iconArrowSolidUpDown = Builder(name = "IconArrowSolidUpDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.726f, 0.766f)
                lineTo(20.201f, 8.656f)
                curveTo(20.2683f, 8.7269f, 20.3133f, 8.8161f, 20.3304f, 8.9123f)
                curveTo(20.3475f, 9.0086f, 20.3361f, 9.1077f, 20.2975f, 9.1975f)
                curveTo(20.2588f, 9.2874f, 20.1947f, 9.3639f, 20.1131f, 9.4176f)
                curveTo(20.0314f, 9.4714f, 19.9358f, 9.5f, 19.838f, 9.5f)
                horizontalLineTo(4.162f)
                curveTo(4.0642f, 9.5f, 3.9686f, 9.4714f, 3.8869f, 9.4176f)
                curveTo(3.8053f, 9.3639f, 3.7412f, 9.2874f, 3.7025f, 9.1975f)
                curveTo(3.6639f, 9.1077f, 3.6525f, 9.0086f, 3.6696f, 8.9123f)
                curveTo(3.6867f, 8.8161f, 3.7317f, 8.7269f, 3.799f, 8.656f)
                lineTo(11.274f, 0.766f)
                curveTo(11.3674f, 0.6673f, 11.48f, 0.5888f, 11.6048f, 0.5351f)
                curveTo(11.7297f, 0.4814f, 11.8641f, 0.4537f, 12.0f, 0.4537f)
                curveTo(12.1359f, 0.4537f, 12.2703f, 0.4814f, 12.3952f, 0.5351f)
                curveTo(12.52f, 0.5888f, 12.6326f, 0.6673f, 12.726f, 0.766f)
                verticalLineTo(0.766f)
                close()
                moveTo(12.726f, 23.234f)
                lineTo(20.201f, 15.344f)
                curveTo(20.2683f, 15.273f, 20.3133f, 15.1839f, 20.3304f, 15.0877f)
                curveTo(20.3475f, 14.9914f, 20.3361f, 14.8923f, 20.2975f, 14.8024f)
                curveTo(20.2588f, 14.7126f, 20.1947f, 14.6361f, 20.1131f, 14.5824f)
                curveTo(20.0314f, 14.5286f, 19.9358f, 14.5f, 19.838f, 14.5f)
                horizontalLineTo(4.162f)
                curveTo(4.0642f, 14.5f, 3.9686f, 14.5286f, 3.8869f, 14.5824f)
                curveTo(3.8053f, 14.6361f, 3.7412f, 14.7126f, 3.7025f, 14.8024f)
                curveTo(3.6639f, 14.8923f, 3.6525f, 14.9914f, 3.6696f, 15.0877f)
                curveTo(3.6867f, 15.1839f, 3.7317f, 15.273f, 3.799f, 15.344f)
                lineTo(11.274f, 23.234f)
                curveTo(11.3674f, 23.3326f, 11.48f, 23.4112f, 11.6048f, 23.4649f)
                curveTo(11.7297f, 23.5186f, 11.8641f, 23.5463f, 12.0f, 23.5463f)
                curveTo(12.1359f, 23.5463f, 12.2703f, 23.5186f, 12.3952f, 23.4649f)
                curveTo(12.52f, 23.4112f, 12.6326f, 23.3326f, 12.726f, 23.234f)
                close()
            }
        }
        .build()
        return _iconArrowSolidUpDown!!
    }

private var _iconArrowSolidUpDown: ImageVector? = null
