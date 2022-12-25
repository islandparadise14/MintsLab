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

public val Iconography.IconExclamationCircle: ImageVector
    get() {
        if (_iconExclamationCircle != null) {
            return _iconExclamationCircle!!
        }
        _iconExclamationCircle = Builder(name = "IconExclamationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 17.118f)
                curveTo(11.6817f, 17.118f, 11.3765f, 16.9916f, 11.1515f, 16.7665f)
                curveTo(10.9264f, 16.5415f, 10.8f, 16.2363f, 10.8f, 15.918f)
                curveTo(10.8f, 15.5997f, 10.9264f, 15.2945f, 11.1515f, 15.0695f)
                curveTo(11.3765f, 14.8444f, 11.6817f, 14.718f, 12.0f, 14.718f)
                curveTo(12.3183f, 14.718f, 12.6235f, 14.8444f, 12.8485f, 15.0695f)
                curveTo(13.0736f, 15.2945f, 13.2f, 15.5997f, 13.2f, 15.918f)
                curveTo(13.2f, 16.2363f, 13.0736f, 16.5415f, 12.8485f, 16.7665f)
                curveTo(12.6235f, 16.9916f, 12.3183f, 17.118f, 12.0f, 17.118f)
                verticalLineTo(17.118f)
                close()
                moveTo(11.0f, 7.283f)
                curveTo(11.0f, 7.0178f, 11.1054f, 6.7634f, 11.2929f, 6.5759f)
                curveTo(11.4804f, 6.3884f, 11.7348f, 6.283f, 12.0f, 6.283f)
                curveTo(12.2652f, 6.283f, 12.5196f, 6.3884f, 12.7071f, 6.5759f)
                curveTo(12.8946f, 6.7634f, 13.0f, 7.0178f, 13.0f, 7.283f)
                verticalLineTo(12.283f)
                curveTo(13.0f, 12.5482f, 12.8946f, 12.8026f, 12.7071f, 12.9901f)
                curveTo(12.5196f, 13.1776f, 12.2652f, 13.283f, 12.0f, 13.283f)
                curveTo(11.7348f, 13.283f, 11.4804f, 13.1776f, 11.2929f, 12.9901f)
                curveTo(11.1054f, 12.8026f, 11.0f, 12.5482f, 11.0f, 12.283f)
                verticalLineTo(7.283f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.076f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.076f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _iconExclamationCircle!!
    }

private var _iconExclamationCircle: ImageVector? = null
