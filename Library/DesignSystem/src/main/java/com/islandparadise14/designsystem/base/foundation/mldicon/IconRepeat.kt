package com.islandparadise14.designsystem.base.foundation.mldicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.base.foundation.MLDIcon

public val MLDIcon.IconRepeat: ImageVector
    get() {
        if (_iconRepeat != null) {
            return _iconRepeat!!
        }
        _iconRepeat = Builder(name = "IconRepeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3f, 12.37f)
                verticalLineTo(11.36f)
                curveTo(4.3f, 8.57f, 6.57f, 6.3f, 9.36f, 6.3f)
                horizontalLineTo(16.95f)
                lineTo(16.39f, 6.86f)
                curveTo(16.1646f, 7.0854f, 16.0379f, 7.3912f, 16.0379f, 7.71f)
                curveTo(16.0379f, 8.0288f, 16.1646f, 8.3346f, 16.39f, 8.56f)
                curveTo(16.6154f, 8.7854f, 16.9212f, 8.9121f, 17.24f, 8.9121f)
                curveTo(17.5588f, 8.9121f, 17.8646f, 8.7854f, 18.09f, 8.56f)
                lineTo(20.7f, 5.95f)
                curveTo(20.92f, 5.72f, 21.05f, 5.42f, 21.05f, 5.1f)
                curveTo(21.05f, 4.78f, 20.92f, 4.48f, 20.7f, 4.25f)
                lineTo(18.09f, 1.64f)
                curveTo(17.9784f, 1.5284f, 17.8459f, 1.4398f, 17.7f, 1.3794f)
                curveTo(17.5542f, 1.319f, 17.3979f, 1.2879f, 17.24f, 1.2879f)
                curveTo(17.0821f, 1.2879f, 16.9258f, 1.319f, 16.78f, 1.3794f)
                curveTo(16.6341f, 1.4398f, 16.5016f, 1.5284f, 16.39f, 1.64f)
                curveTo(16.1646f, 1.8654f, 16.0379f, 2.1712f, 16.0379f, 2.49f)
                curveTo(16.0379f, 2.8088f, 16.1646f, 3.1146f, 16.39f, 3.34f)
                lineTo(16.95f, 3.9f)
                horizontalLineTo(9.36f)
                curveTo(5.25f, 3.9f, 1.9f, 7.25f, 1.9f, 11.36f)
                verticalLineTo(12.37f)
                curveTo(1.9f, 13.03f, 2.44f, 13.57f, 3.1f, 13.57f)
                curveTo(3.76f, 13.57f, 4.3f, 13.04f, 4.3f, 12.37f)
                close()
                moveTo(20.9f, 10.43f)
                curveTo(20.24f, 10.43f, 19.7f, 10.97f, 19.7f, 11.63f)
                verticalLineTo(12.64f)
                curveTo(19.7f, 15.43f, 17.43f, 17.7f, 14.64f, 17.7f)
                horizontalLineTo(7.05f)
                lineTo(7.61f, 17.14f)
                curveTo(7.8354f, 16.9146f, 7.9621f, 16.6088f, 7.9621f, 16.29f)
                curveTo(7.9621f, 15.9712f, 7.8354f, 15.6654f, 7.61f, 15.44f)
                curveTo(7.3846f, 15.2146f, 7.0788f, 15.0879f, 6.76f, 15.0879f)
                curveTo(6.4412f, 15.0879f, 6.1354f, 15.2146f, 5.91f, 15.44f)
                lineTo(3.3f, 18.05f)
                curveTo(3.07f, 18.27f, 2.95f, 18.58f, 2.95f, 18.9f)
                curveTo(2.95f, 19.22f, 3.08f, 19.52f, 3.3f, 19.75f)
                lineTo(5.91f, 22.36f)
                curveTo(6.1357f, 22.585f, 6.4413f, 22.7113f, 6.76f, 22.7113f)
                curveTo(7.0787f, 22.7113f, 7.3843f, 22.585f, 7.61f, 22.36f)
                curveTo(8.08f, 21.89f, 8.08f, 21.13f, 7.61f, 20.66f)
                lineTo(7.05f, 20.1f)
                horizontalLineTo(14.64f)
                curveTo(18.75f, 20.1f, 22.1f, 16.75f, 22.1f, 12.64f)
                verticalLineTo(11.63f)
                curveTo(22.1f, 10.96f, 21.56f, 10.43f, 20.9f, 10.43f)
                verticalLineTo(10.43f)
                close()
            }
        }
        .build()
        return _iconRepeat!!
    }

private var _iconRepeat: ImageVector? = null
