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

public val MLDIcon.IconLoudspeaker: ImageVector
    get() {
        if (_iconLoudspeaker != null) {
            return _iconLoudspeaker!!
        }
        _iconLoudspeaker = Builder(name = "IconLoudspeaker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.517f, 2.15f)
                lineTo(6.035f, 7.537f)
                horizontalLineTo(2.921f)
                curveTo(2.351f, 7.537f, 1.888f, 8.0f, 1.888f, 8.57f)
                verticalLineTo(15.43f)
                curveTo(1.888f, 16.0f, 2.351f, 16.463f, 2.921f, 16.463f)
                horizontalLineTo(6.035f)
                lineTo(16.517f, 21.85f)
                curveTo(16.6695f, 21.9283f, 16.8395f, 21.9662f, 17.0109f, 21.9599f)
                curveTo(17.1822f, 21.9535f, 17.349f, 21.9033f, 17.4953f, 21.8139f)
                curveTo(17.6416f, 21.7246f, 17.7624f, 21.5991f, 17.8463f, 21.4495f)
                curveTo(17.9301f, 21.3f, 17.9741f, 21.1314f, 17.974f, 20.96f)
                verticalLineTo(3.04f)
                curveTo(17.9741f, 2.8686f, 17.9301f, 2.7f, 17.8463f, 2.5505f)
                curveTo(17.7624f, 2.4009f, 17.6416f, 2.2754f, 17.4953f, 2.1861f)
                curveTo(17.349f, 2.0967f, 17.1822f, 2.0465f, 17.0109f, 2.0401f)
                curveTo(16.8395f, 2.0338f, 16.6695f, 2.0717f, 16.517f, 2.15f)
                close()
                moveTo(21.236f, 9.167f)
                horizontalLineTo(19.28f)
                verticalLineTo(14.833f)
                horizontalLineTo(21.235f)
                curveTo(21.959f, 14.833f, 22.545f, 14.246f, 22.545f, 13.522f)
                verticalLineTo(10.479f)
                curveTo(22.545f, 9.754f, 21.959f, 9.167f, 21.235f, 9.167f)
            }
        }
        .build()
        return _iconLoudspeaker!!
    }

private var _iconLoudspeaker: ImageVector? = null
