package com.islandparadise14.designsystem.base.atom

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.foundation.MLDIcon
import com.islandparadise14.designsystem.base.foundation.mldicon.IconCamera
import com.islandparadise14.designsystem.base.foundation.value.IconSize

@Composable
fun MLDIcon(
    iconography: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    iconSize: IconSize = IconSize.Origin,
    tint: Color = MintsLabTheme.color.normalIcon
) {
    val padding = when (iconSize) {
        IconSize.Origin -> 0.dp
        IconSize.Normal -> 8.dp
    }

    /** Content */
    Icon(
        modifier = Modifier
            .then(modifier)
            .padding(all = padding),
        imageVector = iconography,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Preview
@Composable
fun PreviewMLDIcon() {
    MLDIcon(iconography = MLDIcon.IconCamera, contentDescription = null)
}