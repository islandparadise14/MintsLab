package com.islandparadise14.bitcoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.islandparadise14.designsystem.MintsLabTheme
import com.islandparadise14.designsystem.MintsLabTheme.color
import com.islandparadise14.designsystem.base.atom.*
import com.islandparadise14.designsystem.base.foundation.MLDIcon
import com.islandparadise14.designsystem.base.foundation._12dp
import com.islandparadise14.designsystem.base.foundation._16dp
import com.islandparadise14.designsystem.base.foundation.mldicon.*
import com.islandparadise14.designsystem.base.foundation.value.ButtonColor
import com.islandparadise14.designsystem.base.foundation.value.ButtonSize
import com.islandparadise14.designsystem.base.undercarriage.IconButtonListener
import com.islandparadise14.designsystem.component.button.CTAButton
import com.islandparadise14.designsystem.component.layout.ScrollColumn
import com.islandparadise14.designsystem.component.list.IconTextList
import com.islandparadise14.designsystem.component.list.ListHeader
import com.islandparadise14.designsystem.component.list.TextList
import com.islandparadise14.designsystem.component.navigation.BottomNavigation
import com.islandparadise14.designsystem.component.navigation.TitleNavigation
import com.islandparadise14.designsystem.component.section.HeaderSection
import com.islandparadise14.designsystem.component.section.TextSection
import com.islandparadise14.designsystem.component.textField.TextInputArea

class MainActivity : ComponentActivity() {
    private val iconState = mutableStateOf<ImageVector?>(MLDIcon.IconCall)
    private val textFieldValue = mutableStateOf("")
    private val selectedIndex = mutableStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MintsLabTheme {
                Column {
                    ScrollColumn(
                        Modifier
                            .weight(1f, true)) {
                        TitleNavigation(
                            title = "Hello World",
                            subTitle = "welcome to MintsLab",
                            icon1 = object: IconButtonListener {
                                override val iconography: ImageVector = MLDIcon.IconCamera
                                override val contentDescription: String = ""
                                override val onClickIcon: () -> Unit = {}
                            },
                            icon2 = object: IconButtonListener {
                                override val iconography: ImageVector = MLDIcon.IconCheckCircle
                                override val contentDescription: String = ""
                                override val onClickIcon: () -> Unit = {}
                            },
                        )
                        Row {
                            MLDIconButton(
                                object: IconButtonListener {
                                    override val iconography: ImageVector = MLDIcon.IconBookmark
                                    override val contentDescription: String = ""
                                    override val onClickIcon: () -> Unit = {}
                                },
                                text = "?????????"
                            )
                            MLDIconButton(
                                object: IconButtonListener {
                                    override val iconography: ImageVector = MLDIcon.IconCall
                                    override val contentDescription: String = ""
                                    override val onClickIcon: () -> Unit = {}
                                },
                                isActive = false,
                                text = "??????"
                            )
                            MLDIconButton(
                                object: IconButtonListener {
                                    override val iconography: ImageVector = MLDIcon.IconBookmark
                                    override val contentDescription: String = ""
                                    override val onClickIcon: () -> Unit = {}
                                },
                                isHighLight = true,
                                text = "?????????"
                            )
                        }
                        Spacer(_16dp)
                        HeaderSection(
                            "Let's Draw with MintsLab DesignSystem",
                            "Let's Draw with MintsLab DesignSystem"
                        )
                        ListHeader("??????")
                        TextList("??????", true)
                        TextList("????????????", true)
                        TextList("????????? ?????????", true)
                        TextList("????????????~", true)
                        IconTextList(icon = MLDIcon.IconPlus, text = "????????????", iconTint = color.itemGreen)
                        IconTextList(icon = MLDIcon.IconStar, text = "????????????", iconTint = color.itemYellow)
                        IconTextList(icon = MLDIcon.IconHeart, text = "????????????", iconTint = color.itemRed)
                        MLDTextButton("??????", isBig = true)
                        MLDTextButton(
                            "??? ????????? ???????????????????",
                            leftIcon = MLDIcon.IconBookmark,
                            rightIcon = MLDIcon.IconArrowRightSmall
                        )
                        Spacer(_16dp)
                        TextInputArea(
                            value = textFieldValue.value,
                            onValueChange = {
                                textFieldValue.value = it
                            },
                            hint = "????????? ?????????",
                        )
                        MLDBoxButton(
                            "Button",
                            Modifier
                                .fillMaxWidth()
                                .padding(horizontal = _16dp),
                            leftIcon = iconState.value,
                        ) {
                            if (iconState.value == null) {
                                iconState.value = MLDIcon.IconCall
                            } else {
                                iconState.value = null
                            }
                        }
                        Row {
                            MLDBoxButton(
                                "Button",
                                buttonSize = ButtonSize.Large,
                                buttonColor = ButtonColor.Sub,
                                isFull = true,
                                modifier = Modifier
                                    .width(180.dp)
                                    .padding(all = _16dp)
                            )
                            MLDBoxButton(
                                "Button",
                                buttonSize = ButtonSize.Large,
                                modifier = Modifier
                                    .width(180.dp)
                                    .padding(all = _16dp)
                            )
                        }
                        MLDBoxButton(buttonSize = ButtonSize.Medium, text = "??????")
                        MLDBoxButton(
                            text = "??????",
                            buttonSize = ButtonSize.Small,
                            buttonColor = ButtonColor.Gray
                        )
                        Spacer(Modifier.height(_12dp))


                        Column(
                            Modifier
                                .background(color.background)
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            PreviewBoxButton()
                        }
                        TextSection(
                            text = "??????????????? ???????????? ?????? ??????????????????????????????????????????????????????????????????????????????????????????" + "\n" +
                                    "????????? ????????? ??? ???????????? ????????? ?????? ???????????????????????????????????????????????????????????????" + "\n" +
                                    "????????? ???????????? ????????? ????????? ????????? ????????? ?????????????????????????????????????????????????????????"
                        )
                    }
                    CTAButton(text = "??????") {

                    }
//                    BottomNavigation(
//                        selectedIndex = selectedIndex.value,
//                        icon1 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconHome
//                            override val contentDescription: String = "???"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 0
//                            }
//                        },
//                        text1 = "???",
//                        icon2 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconHeart
//                            override val contentDescription: String = "???"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 1
//                            }
//                        },
//                        text2 = "?????????",
//                        icon3 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconUmbrella
//                            override val contentDescription: String = "???"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 2
//                            }
//                        },
//                        icon4 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconPlus
//                            override val contentDescription: String = "???"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 3
//                            }
//                        },
//                        icon5 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconDots
//                            override val contentDescription: String = "???"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 4
//                            }
//                        },
//                    )
                }
            }
        }
    }
}