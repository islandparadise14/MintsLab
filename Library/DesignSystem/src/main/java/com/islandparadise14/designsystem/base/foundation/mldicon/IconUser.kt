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

public val MLDIcon.IconUser: ImageVector
    get() {
        if (_iconUser != null) {
            return _iconUser!!
        }
        _iconUser = Builder(name = "IconUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.887f, 6.644f)
                curveTo(16.8871f, 7.2868f, 16.7605f, 7.9234f, 16.5146f, 8.5173f)
                curveTo(16.2686f, 9.1112f, 15.9081f, 9.6508f, 15.4536f, 10.1054f)
                curveTo(14.9991f, 10.56f, 14.4596f, 10.9206f, 13.8657f, 11.1667f)
                curveTo(13.2718f, 11.4128f, 12.6353f, 11.5394f, 11.9925f, 11.5395f)
                curveTo(10.6943f, 11.5396f, 9.4492f, 11.024f, 8.5311f, 10.1061f)
                curveTo(7.613f, 9.1882f, 7.0971f, 7.9432f, 7.097f, 6.645f)
                curveTo(7.0969f, 6.0022f, 7.2235f, 5.3656f, 7.4694f, 4.7717f)
                curveTo(7.7154f, 4.1778f, 8.0759f, 3.6381f, 8.5304f, 3.1836f)
                curveTo(9.4483f, 2.2655f, 10.6933f, 1.7496f, 11.9915f, 1.7495f)
                curveTo(13.2897f, 1.7494f, 14.5349f, 2.265f, 15.4529f, 3.1829f)
                curveTo(16.371f, 4.1007f, 16.8869f, 5.3458f, 16.887f, 6.644f)
                moveTo(11.992f, 13.037f)
                curveTo(4.943f, 13.037f, 2.201f, 17.523f, 2.201f, 19.61f)
                curveTo(2.201f, 21.696f, 8.038f, 22.252f, 11.992f, 22.252f)
                curveTo(15.946f, 22.252f, 21.783f, 21.696f, 21.783f, 19.61f)
                curveTo(21.783f, 17.523f, 19.041f, 13.037f, 11.992f, 13.037f)
                close()
            }
        }
        .build()
        return _iconUser!!
    }

private var _iconUser: ImageVector? = null
