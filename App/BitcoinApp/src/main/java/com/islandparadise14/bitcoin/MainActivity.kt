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
                                text = "북마크"
                            )
                            MLDIconButton(
                                object: IconButtonListener {
                                    override val iconography: ImageVector = MLDIcon.IconCall
                                    override val contentDescription: String = ""
                                    override val onClickIcon: () -> Unit = {}
                                },
                                isActive = false,
                                text = "전화"
                            )
                            MLDIconButton(
                                object: IconButtonListener {
                                    override val iconography: ImageVector = MLDIcon.IconBookmark
                                    override val contentDescription: String = ""
                                    override val onClickIcon: () -> Unit = {}
                                },
                                isHighLight = true,
                                text = "북마크"
                            )
                        }
                        Spacer(_16dp)
                        HeaderSection(
                            "Let's Draw with MintsLab DesignSystem",
                            "Let's Draw with MintsLab DesignSystem"
                        )
                        ListHeader("최근")
                        TextList("하이", true)
                        TextList("송금하기", true)
                        TextList("뭐라도 써보자", true)
                        TextList("매용구리~", true)
                        IconTextList(icon = MLDIcon.IconPlus, text = "추가하기", iconTint = color.itemGreen)
                        IconTextList(icon = MLDIcon.IconStar, text = "별표하기", iconTint = color.itemYellow)
                        IconTextList(icon = MLDIcon.IconHeart, text = "하트하기", iconTint = color.itemRed)
                        MLDTextButton("편집", isBig = true)
                        MLDTextButton(
                            "이 내용이 안보이시나요?",
                            leftIcon = MLDIcon.IconBookmark,
                            rightIcon = MLDIcon.IconArrowRightSmall
                        )
                        Spacer(_16dp)
                        TextInputArea(
                            value = textFieldValue.value,
                            onValueChange = {
                                textFieldValue.value = it
                            },
                            hint = "뭐라도 적어봐",
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
                        MLDBoxButton(buttonSize = ButtonSize.Medium, text = "분석")
                        MLDBoxButton(
                            text = "수정",
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
                            text = "아무말이나 적어보는 섹션 이야앙러민러ㅑㅈ더래어링ㄴ럼대ㅑ젊덜너리ㅓㅇㄴ리ㅏㅓ디ㅑㅓ럳" + "\n" +
                                    "뭐라고 적어야 잘 적었다고 소문이 날까 으마링넒댜ㅓㄹㅁ어리ㅓㄹㄷ러먕ㄴ러ㅑㅁㅇ넒" + "\n" +
                                    "뭐라고 적든간에 소문이 날리가 없잖아 바보냐 으아얄먿러리너림넝리ㅏㅓㅁㄴ아러ㅣㅁㄴ"
                        )
                    }
                    CTAButton(text = "확인") {

                    }
//                    BottomNavigation(
//                        selectedIndex = selectedIndex.value,
//                        icon1 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconHome
//                            override val contentDescription: String = "홈"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 0
//                            }
//                        },
//                        text1 = "홈",
//                        icon2 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconHeart
//                            override val contentDescription: String = "홈"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 1
//                            }
//                        },
//                        text2 = "좋아요",
//                        icon3 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconUmbrella
//                            override val contentDescription: String = "홈"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 2
//                            }
//                        },
//                        icon4 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconPlus
//                            override val contentDescription: String = "홈"
//                            override val onClickIcon: () -> Unit = {
//                                selectedIndex.value = 3
//                            }
//                        },
//                        icon5 = object : IconButtonListener {
//                            override val iconography: ImageVector = Iconography.IconDots
//                            override val contentDescription: String = "홈"
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