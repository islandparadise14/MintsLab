package com.islandparadise14.designsystem.base.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.islandparadise14.designsystem.brandColor
import com.islandparadise14.designsystem.base.foundation.BaseColor.GrayScale

/** 구조화된 디자인 규격으로 primaryPalette 값 하나만 바꿔도 앱의 테마가 변경될수 있도록 **/


fun getMintsLabLightColor(primaryPalette: BaseColorPalette) = SemanticColor(primaryPalette)

fun getMintsLabDarkColor(primaryPalette: BaseColorPalette) = SemanticColor(primaryPalette).apply {
    background = GrayScale.gray950 // background 는 예외적으로 colors.xml 도 같이 관리 (Theme 관련)

    popupBackground = GrayScale.gray800

    mainText = GrayScale.white
    subText = GrayScale.gray400
    primaryText = primaryPalette._500
    brightText = GrayScale.white
    disableText = GrayScale.gray700

    normalIcon = GrayScale.white
    selectedIcon = primaryPalette._700
    pressedIcon = GrayScale.gray200
    disableIcon = GrayScale.gray700

    mainButton = primaryPalette._500
    subButton = primaryPalette._200
    grayButton = GrayScale.gray700
    disableButton = GrayScale.gray800
    primaryButtonText = primaryPalette._900

    transparent = BaseColor.Alpha.transparent
    pressTransparent = BaseColor.Alpha.white10

    warning = BaseColor.red._500
}

val LocalMintsLabColors = staticCompositionLocalOf {
    SemanticColor(brandColor)
}

/** Preview 를 위해서 Light 모드를 Default 값으로 */
@Immutable
data class SemanticColor(val primaryPalette: BaseColorPalette) {
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
    var disableIcon: Color = GrayScale.gray300
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

    var transparent: Color = BaseColor.Alpha.transparent
        internal set
    var pressTransparent: Color = BaseColor.Alpha.black10
        internal set

    var warning: Color = BaseColor.red._500
        internal set
}