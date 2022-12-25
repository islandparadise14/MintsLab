package com.islandparadise14.bitcoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.MintsLabTheme.color
import com.islandparadise14.designsystem.MintsLabTheme.typography
import com.islandparadise14.designsystem.base.atom.*
import com.islandparadise14.designsystem.base.foundation.Iconography
import com.islandparadise14.designsystem.base.foundation.iconography.IconBookmark
import com.islandparadise14.designsystem.base.foundation.iconography.IconCamera
import com.islandparadise14.designsystem.base.foundation.iconography.IconCheck
import com.islandparadise14.designsystem.base.foundation.iconography.IconCheckCircle
import com.islandparadise14.designsystem.base.foundation.value.ButtonColor
import com.islandparadise14.designsystem.base.foundation.value.ButtonSize
import com.islandparadise14.designsystem.component.TitleBar

class MainActivity : ComponentActivity() {
    private val iconState = mutableStateOf<ImageVector?>(Iconography.IconCheck)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MintsLabTheme {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    TitleBar(
                        title = "Hello World",
                        subTitle = "welcome to MintsLab",
                        iconography1 = Iconography.IconCamera,
                        iconography2 = Iconography.IconCheckCircle
                    )
                    MLDIconButton(
                        iconography = Iconography.IconBookmark,
                        contentDescription = null,
                        text = "북마크"
                    )
                    Space(16)
                    MLDText("Let's Draw with MintsLab DesignSystem", tint = color.subText)
                    MLDText("Let's Draw with MintsLab DesignSystem", tint = color.primaryText, textStyle = typography.body1)
                    Space(16)
                    BoxButton(
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        iconography = iconState.value
                    ) {
                        if (iconState.value == null) {
                            iconState.value = Iconography.IconCheck
                        } else {
                            iconState.value = null
                        }
                    }
                    Row {
                        BoxButton(
                            buttonSize = ButtonSize.Large,
                            buttonColor = ButtonColor.Sub,
                            modifier = Modifier
                                .width(180.dp)
                                .padding(all = 16.dp)
                        )
                        BoxButton(
                            buttonSize = ButtonSize.Large,
                            modifier = Modifier
                                .width(180.dp)
                                .padding(all = 16.dp)
                        )
                    }
                    BoxButton(buttonSize = ButtonSize.Medium, text = "분석")
                    BoxButton(text = "수정", buttonSize = ButtonSize.Small, buttonColor = ButtonColor.Gray)
                    Spacer(Modifier.height(10.dp))


                    Column(
                        Modifier
                            .background(color.background)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        PreviewBoxButton()
                    }
                }
            }
        }
    }
}