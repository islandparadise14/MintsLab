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

public val MLDIcon.IconWarningTriangle: ImageVector
    get() {
        if (_iconWarningTriangle != null) {
            return _iconWarningTriangle!!
        }
        _iconWarningTriangle = Builder(name = "IconWarningTriangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF8B95A1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 19.191f)
                curveTo(11.8424f, 19.191f, 11.6864f, 19.16f, 11.5408f, 19.0997f)
                curveTo(11.3952f, 19.0393f, 11.2629f, 18.951f, 11.1515f, 18.8395f)
                curveTo(11.04f, 18.7281f, 10.9516f, 18.5958f, 10.8913f, 18.4502f)
                curveTo(10.831f, 18.3046f, 10.8f, 18.1486f, 10.8f, 17.991f)
                curveTo(10.8f, 17.8334f, 10.831f, 17.6774f, 10.8913f, 17.5318f)
                curveTo(10.9516f, 17.3862f, 11.04f, 17.2539f, 11.1515f, 17.1425f)
                curveTo(11.2629f, 17.031f, 11.3952f, 16.9427f, 11.5408f, 16.8823f)
                curveTo(11.6864f, 16.822f, 11.8424f, 16.791f, 12.0f, 16.791f)
                curveTo(12.3183f, 16.791f, 12.6235f, 16.9174f, 12.8485f, 17.1425f)
                curveTo(13.0736f, 17.3675f, 13.2f, 17.6727f, 13.2f, 17.991f)
                curveTo(13.2f, 18.3093f, 13.0736f, 18.6145f, 12.8485f, 18.8395f)
                curveTo(12.6235f, 19.0646f, 12.3183f, 19.191f, 12.0f, 19.191f)
                verticalLineTo(19.191f)
                close()
                moveTo(11.0f, 9.208f)
                curveTo(11.0f, 8.9428f, 11.1054f, 8.6884f, 11.2929f, 8.5009f)
                curveTo(11.4804f, 8.3134f, 11.7348f, 8.208f, 12.0f, 8.208f)
                curveTo(12.2652f, 8.208f, 12.5196f, 8.3134f, 12.7071f, 8.5009f)
                curveTo(12.8946f, 8.6884f, 13.0f, 8.9428f, 13.0f, 9.208f)
                verticalLineTo(14.208f)
                curveTo(13.0f, 14.4732f, 12.8946f, 14.7276f, 12.7071f, 14.9151f)
                curveTo(12.5196f, 15.1026f, 12.2652f, 15.208f, 12.0f, 15.208f)
                curveTo(11.7348f, 15.208f, 11.4804f, 15.1026f, 11.2929f, 14.9151f)
                curveTo(11.1054f, 14.7276f, 11.0f, 14.4732f, 11.0f, 14.208f)
                verticalLineTo(9.208f)
                close()
                moveTo(22.914f, 18.815f)
                lineTo(14.079f, 3.512f)
                curveTo(13.155f, 1.912f, 10.845f, 1.912f, 9.921f, 3.512f)
                lineTo(1.086f, 18.815f)
                curveTo(0.163f, 20.415f, 1.316f, 22.415f, 3.165f, 22.415f)
                horizontalLineTo(20.835f)
                curveTo(22.683f, 22.415f, 23.837f, 20.415f, 22.914f, 18.815f)
                verticalLineTo(18.815f)
                close()
            }
        }
        .build()
        return _iconWarningTriangle!!
    }

private var _iconWarningTriangle: ImageVector? = null
