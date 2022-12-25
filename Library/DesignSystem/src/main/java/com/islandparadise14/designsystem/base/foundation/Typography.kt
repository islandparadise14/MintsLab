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
    headline1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.spToDp(),
        lineHeight = 30.spToDp()
    ),
    headline2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 22.spToDp(),
        lineHeight = 28.spToDp()
    ),
    headline3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.spToDp(),
        lineHeight = 26.spToDp()
    ),
    headline4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.spToDp(),
        lineHeight = 24.spToDp()
    ),
    body1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 16.spToDp(),
        lineHeight = 24.spToDp()
    ),
    body2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.spToDp(),
        lineHeight = 24.spToDp()
    ),
    body3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 14.spToDp(),
        lineHeight = 20.spToDp()
    ),
    body4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.spToDp(),
        lineHeight = 20.spToDp()
    ),
    detail1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 12.spToDp(),
        lineHeight = 18.spToDp()
    ),
    detail2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.spToDp(),
        lineHeight = 18.spToDp()
    ),
    detail3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 10.spToDp(),
        lineHeight = 14.spToDp()
    ),
    detail4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 10.spToDp(),
        lineHeight = 14.spToDp()
    )
)

internal val LocalMintsLabTypography = staticCompositionLocalOf {
    MintsLabTypography()
}

@Immutable
data class MintsLabTypography(
    val headline1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 30.sp
    ),
    val headline2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    val headline3 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 26.sp
    ),
    val headline4 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 24.sp
    ),
    val body1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    val body2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    val body3 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    val body4 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    val detail1 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    ),
    val detail2 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp
    ),
    val detail3 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        lineHeight = 14.sp
    ),
    val detail4 : TextStyle = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        lineHeight = 14.sp
    ),
)

val spoqaHanSansNeoFont = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal),
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)

@Composable
fun Int.spToDp() = with(LocalDensity.current) { Dp(this@spToDp.toFloat()).toSp() }