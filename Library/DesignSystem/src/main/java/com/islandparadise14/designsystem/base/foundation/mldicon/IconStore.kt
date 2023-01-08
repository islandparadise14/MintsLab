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

public val MLDIcon.IconStore: ImageVector
    get() {
        if (_iconStore != null) {
            return _iconStore!!
        }
        _iconStore = Builder(name = "IconStore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 2.5f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 2.5f, 2.4804f, 2.6054f, 2.2929f, 2.7929f)
                curveTo(2.1054f, 2.9804f, 2.0f, 3.2348f, 2.0f, 3.5f)
                verticalLineTo(5.167f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.5f)
                curveTo(22.0f, 3.2348f, 21.8946f, 2.9804f, 21.7071f, 2.7929f)
                curveTo(21.5196f, 2.6054f, 21.2652f, 2.5f, 21.0f, 2.5f)
                moveTo(3.176f, 19.188f)
                curveTo(3.176f, 19.8243f, 3.4287f, 20.4346f, 3.8786f, 20.8847f)
                curveTo(4.3285f, 21.3348f, 4.9387f, 21.5877f, 5.575f, 21.588f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.834f)
                curveTo(10.0f, 17.5688f, 10.1054f, 17.3144f, 10.2929f, 17.1269f)
                curveTo(10.4804f, 16.9394f, 10.7348f, 16.834f, 11.0f, 16.834f)
                horizontalLineTo(13.0f)
                curveTo(13.2652f, 16.834f, 13.5196f, 16.9394f, 13.7071f, 17.1269f)
                curveTo(13.8946f, 17.3144f, 14.0f, 17.5688f, 14.0f, 17.834f)
                verticalLineTo(21.587f)
                horizontalLineTo(18.425f)
                curveTo(19.0613f, 21.5867f, 19.6715f, 21.3338f, 20.1214f, 20.8837f)
                curveTo(20.5713f, 20.4336f, 20.824f, 19.8233f, 20.824f, 19.187f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.176f)
                verticalLineTo(19.188f)
                verticalLineTo(19.188f)
                close()
                moveTo(2.0f, 8.5f)
                curveTo(2.0f, 8.7652f, 2.1054f, 9.0196f, 2.2929f, 9.2071f)
                curveTo(2.4804f, 9.3946f, 2.7348f, 9.5f, 3.0f, 9.5f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 9.5f, 21.5196f, 9.3946f, 21.7071f, 9.2071f)
                curveTo(21.8946f, 9.0196f, 22.0f, 8.7652f, 22.0f, 8.5f)
                verticalLineTo(6.833f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _iconStore!!
    }

private var _iconStore: ImageVector? = null
