package com.islandparadise14.designsystem.component.navigation

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.base.atom.MLDIconButton
import com.islandparadise14.designsystem.base.foundation.*
import com.islandparadise14.designsystem.base.undercarriage.IconButtonListener

@Composable
fun BottomNavigation(
    selectedIndex: Int = 0,
    icon1: IconButtonListener? = null,
    icon2: IconButtonListener? = null,
    icon3: IconButtonListener? = null,
    icon4: IconButtonListener? = null,
    icon5: IconButtonListener? = null,
    text1: String? = null,
    text2: String? = null,
    text3: String? = null,
    text4: String? = null,
    text5: String? = null,
) {
    val context = LocalContext.current

    Row(
        Modifier
            .fillMaxWidth()
            .height(_64dp)
            .border(
                MinBorder,
                Brush.verticalGradient(
                    colors = listOf(
                        MintsLabTheme.color.borderSub,
                        MintsLabTheme.color.transparent
                    )
                ),
                RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .padding(_16dp, _4dp)
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        listOf(
            Pair(icon1, text1),
            Pair(icon2, text2),
            Pair(icon3, text3),
            Pair(icon4, text4),
            Pair(icon5, text5),
        ).forEachIndexed { index, pair ->
            pair.first?.let {
                MLDIconButton(
                    iconButtonListener = object : IconButtonListener {
                        override val iconography: ImageVector = it.iconography
                        override val contentDescription: String = it.contentDescription
                        override val onClickIcon: () -> Unit = {
                            context.vibe(Vibration.INTERACT)
                            it.onClickIcon.invoke()
                        }
                    },
                    modifier = Modifier.weight(1f, true)
                        .fillMaxHeight(),
                    text = pair.second,
                    isActive = index == selectedIndex,
                )
            }
        }
    }
}