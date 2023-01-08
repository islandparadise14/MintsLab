package com.islandparadise14.designsystem.base.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.islandparadise14.designsystem.R

@Composable
fun getMintsLabTypography() = MintsLabTypography(
    headlineBold1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine1.fontSize.spToDp(),
        lineHeight = TypoSize.headLine1.lineHeight.spToDp()
    ),
    headlineNormal1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine1.fontSize.spToDp(),
        lineHeight = TypoSize.headLine1.lineHeight.spToDp()
    ),
    headlineBold2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine2.fontSize.spToDp(),
        lineHeight = TypoSize.headLine2.lineHeight.spToDp()
    ),
    headlineNormal2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine2.fontSize.spToDp(),
        lineHeight = TypoSize.headLine2.lineHeight.spToDp()
    ),
    headlineBold3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine3.fontSize.spToDp(),
        lineHeight = TypoSize.headLine3.lineHeight.spToDp()
    ),
    headlineNormal3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine3.fontSize.spToDp(),
        lineHeight = TypoSize.headLine3.lineHeight.spToDp()
    ),
    headlineBold4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine4.fontSize.spToDp(),
        lineHeight = TypoSize.headLine4.lineHeight.spToDp()
    ),
    headlineNormal4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine4.fontSize.spToDp(),
        lineHeight = TypoSize.headLine4.lineHeight.spToDp()
    ),
    bodyBold1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.body1.fontSize.spToDp(),
        lineHeight = TypoSize.body1.lineHeight.spToDp()
    ),
    bodyMedium1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Medium,
        fontSize = TypoSize.body1.fontSize.spToDp(),
        lineHeight = TypoSize.body1.lineHeight.spToDp()
    ),
    bodyNormal1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.body1.fontSize.spToDp(),
        lineHeight = TypoSize.body1.lineHeight.spToDp()
    ),
    bodyBold2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.body2.fontSize.spToDp(),
        lineHeight = TypoSize.body2.lineHeight.spToDp()
    ),
    bodyNormal2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.body2.fontSize.spToDp(),
        lineHeight = TypoSize.body2.lineHeight.spToDp()
    ),
    detailBold1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.detail1.fontSize.spToDp(),
        lineHeight = TypoSize.detail1.lineHeight.spToDp()
    ),
    detailNormal1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.detail1.fontSize.spToDp(),
        lineHeight = TypoSize.detail1.lineHeight.spToDp()
    ),
    detailBold2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.detail2.fontSize.spToDp(),
        lineHeight = TypoSize.detail2.lineHeight.spToDp()
    ),
    detailNormal2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.detail2.fontSize.spToDp(),
        lineHeight = TypoSize.detail2.lineHeight.spToDp()
    ),
)

internal val LocalMintsLabTypography = staticCompositionLocalOf {
    MintsLabTypography()
}

@Immutable
data class MintsLabTypography(
    val headlineBold1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine1.fontSize.sp,
        lineHeight = TypoSize.headLine1.lineHeight.sp
    ),
    val headlineNormal1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine1.fontSize.sp,
        lineHeight = TypoSize.headLine1.lineHeight.sp
    ),
    val headlineBold2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine2.fontSize.sp,
        lineHeight = TypoSize.headLine2.lineHeight.sp
    ),
    val headlineNormal2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine2.fontSize.sp,
        lineHeight = TypoSize.headLine2.lineHeight.sp
    ),
    val headlineBold3 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine3.fontSize.sp,
        lineHeight = TypoSize.headLine3.lineHeight.sp
    ),
    val headlineNormal3 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine3.fontSize.sp,
        lineHeight = TypoSize.headLine3.lineHeight.sp
    ),
    val headlineBold4 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.headLine4.fontSize.sp,
        lineHeight = TypoSize.headLine4.lineHeight.sp
    ),
    val headlineNormal4 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.headLine4.fontSize.sp,
        lineHeight = TypoSize.headLine4.lineHeight.sp
    ),
    val bodyBold1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.body1.fontSize.sp,
        lineHeight = TypoSize.body1.lineHeight.sp
    ),
    val bodyMedium1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Medium,
        fontSize = TypoSize.body1.fontSize.sp,
        lineHeight = TypoSize.body1.lineHeight.sp
    ),
    val bodyNormal1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.body1.fontSize.sp,
        lineHeight = TypoSize.body1.lineHeight.sp
    ),
    val bodyBold2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.body2.fontSize.sp,
        lineHeight = TypoSize.body2.lineHeight.sp
    ),
    val bodyNormal2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.body2.fontSize.sp,
        lineHeight = TypoSize.body2.lineHeight.sp
    ),
    val detailBold1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.detail1.fontSize.sp,
        lineHeight = TypoSize.detail1.lineHeight.sp
    ),
    val detailNormal1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.detail1.fontSize.sp,
        lineHeight = TypoSize.detail1.lineHeight.sp
    ),
    val detailBold2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = TypoSize.detail2.fontSize.sp,
        lineHeight = TypoSize.detail2.lineHeight.sp
    ),
    val detailNormal2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = TypoSize.detail2.fontSize.sp,
        lineHeight = TypoSize.detail2.lineHeight.sp
    ),
)

object TypoSize {
    val headLine1: TypoValue = TypoValue(24, 30)
    val headLine2: TypoValue = TypoValue(22, 28)
    val headLine3: TypoValue = TypoValue(20, 26)
    val headLine4: TypoValue = TypoValue(18, 24)
    val body1: TypoValue = TypoValue(16, 24)
    val body2: TypoValue = TypoValue(14, 20)
    val detail1: TypoValue = TypoValue(12, 18)
    val detail2: TypoValue = TypoValue(10, 14)
}

data class TypoValue(
    val fontSize: Int,
    val lineHeight: Int
)

val spoqaHanSansNeoFont = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal),
    Font(R.font.spoqa_han_sans_neo_medium, FontWeight.Medium),
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)

@Composable
fun Int.spToDp() = with(LocalDensity.current) { Dp(this@spToDp.toFloat()).toSp() }