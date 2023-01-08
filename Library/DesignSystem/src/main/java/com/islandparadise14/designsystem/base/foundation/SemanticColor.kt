package com.islandparadise14.designsystem.base.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.islandparadise14.designsystem.brandColor
import com.islandparadise14.designsystem.base.foundation.BaseColor.GrayScale

/** 구조화된 디자인 규격으로 primaryPalette 값 하나만 바꿔도 앱의 테마가 변경될수 있도록 **/


fun getMintsLabLightColor(primaryPalette: BaseColorPalette) = SemanticColor(primaryPalette)

fun getMintsLabDarkColor(primaryPalette: BaseColorPalette) = SemanticColor(primaryPalette).apply {
    itemRed = BaseColor.red._400
    itemPink = BaseColor.pink._400
    itemPurple = BaseColor.purple._400
    itemDeepPurple = BaseColor.deepPurple._400
    itemIndigo = BaseColor.indigo._400
    itemBlue = BaseColor.blue._400
    itemLightBlue = BaseColor.lightBlue._400
    itemCyan = BaseColor.cyan._400
    itemTeal = BaseColor.teal._400
    itemGreen = BaseColor.green._400
    itemLightGreen = BaseColor.lightGreen._400
    itemLime = BaseColor.lime._400
    itemYellow = BaseColor.yellow._400
    itemAmber = BaseColor.amber._400
    itemOrange = BaseColor.orange._400
    itemDeepOrange = BaseColor.deepOrange._400
    itemBrown = BaseColor.brown._400

    background = GrayScale.gray950 // background 는 예외적으로 colors.xml 도 같이 관리 (Theme 관련)

    popupBackground = GrayScale.gray800

    mainText = GrayScale.white
    subText = GrayScale.gray300
    primaryText = primaryPalette._500
    brightText = GrayScale.white
    disableText = GrayScale.gray700

    normalIcon = GrayScale.gray100
    selectedIcon = primaryPalette._500
    pressedIcon = GrayScale.gray200
    disableIcon = GrayScale.gray700

    mainButton = primaryPalette._500
    subButton = primaryPalette._200
    grayButton = GrayScale.gray700
    disableButton = GrayScale.gray800
    primaryButtonText = primaryPalette._900

    borderPrimary = primaryPalette._500
    borderMain = GrayScale.gray100
    borderSub = GrayScale.gray500

    transparent = BaseColor.Alpha.transparent
    pressTransparent = BaseColor.Alpha.white10

    warning = BaseColor.red._500
}

val LocalMintsLabColors = staticCompositionLocalOf {
    SemanticColor(brandColor)
}

/** Preview 를 위해서 Light 모드를 Default 값으로 */
@Immutable
data class SemanticColor(private val primaryPalette: BaseColorPalette) {
    var itemRed: Color = BaseColor.red._500
    var itemPink: Color = BaseColor.pink._500
    var itemPurple: Color = BaseColor.purple._500
    var itemDeepPurple: Color = BaseColor.deepPurple._500
    var itemIndigo: Color = BaseColor.indigo._500
    var itemBlue: Color = BaseColor.blue._500
    var itemLightBlue: Color = BaseColor.lightBlue._500
    var itemCyan: Color = BaseColor.cyan._500
    var itemTeal: Color = BaseColor.teal._500
    var itemGreen: Color = BaseColor.green._500
    var itemLightGreen: Color = BaseColor.lightGreen._500
    var itemLime: Color = BaseColor.lime._500
    var itemYellow: Color = BaseColor.yellow._500
    var itemAmber: Color = BaseColor.amber._500
    var itemOrange: Color = BaseColor.orange._500
    var itemDeepOrange: Color = BaseColor.deepOrange._500
    var itemBrown: Color = BaseColor.brown._500

    var background: Color = GrayScale.white // background 는 예외적으로 colors.xml 도 같이 관리 (Theme 관련)
        internal set

    var popupBackground: Color = GrayScale.white
        internal set

    var mainText: Color = GrayScale.black
        internal set
    var subText: Color = GrayScale.gray600
        internal set
    var primaryText: Color = primaryPalette._700
        internal set
    var brightText: Color = GrayScale.white
        internal set
    var disableText: Color = GrayScale.gray300
        internal set

    var normalIcon: Color = GrayScale.gray800
        internal set
    var selectedIcon: Color = primaryPalette._700
        internal set
    var pressedIcon: Color = GrayScale.gray700
        internal set
    var disableIcon: Color = GrayScale.gray500
        internal set

    var mainButton: Color = primaryPalette._600
        internal set
    var subButton: Color = primaryPalette._100
        internal set
    var grayButton: Color = GrayScale.gray300
        internal set
    var disableButton: Color = GrayScale.gray200
        internal set
    var primaryButtonText: Color = primaryPalette._800
        internal set

    var borderPrimary: Color = primaryPalette._600
        internal set
    var borderMain: Color = GrayScale.gray800
        internal set
    var borderSub: Color = GrayScale.gray500
        internal set

    var transparent: Color = BaseColor.Alpha.transparent
        internal set
    var pressTransparent: Color = BaseColor.Alpha.black10
        internal set

    var warning: Color = BaseColor.red._500
        internal set
}