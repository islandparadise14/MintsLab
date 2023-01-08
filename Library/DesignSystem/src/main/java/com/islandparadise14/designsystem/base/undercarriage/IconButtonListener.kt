package com.islandparadise14.designsystem.base.undercarriage

import androidx.compose.ui.graphics.vector.ImageVector

interface IconButtonListener {
    val iconography: ImageVector
    val contentDescription: String
    val onClickIcon: () -> Unit
}