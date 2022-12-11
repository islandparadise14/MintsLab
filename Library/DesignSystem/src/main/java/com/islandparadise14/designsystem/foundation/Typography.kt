package com.islandparadise14.designsystem.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.islandparadise14.designsystem.R

@Composable
fun getMintsLabTypography() = MintsLabTypography(
    headline1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.dp(),
        lineHeight = 30.dp()
    ),
    headline2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 22.dp(),
        lineHeight = 28.dp()
    ),
    headline3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.dp(),
        lineHeight = 26.dp()
    ),
    headline4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.dp(),
        lineHeight = 24.dp()
    ),
    body1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 16.dp(),
        lineHeight = 24.dp()
    ),
    body2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.dp(),
        lineHeight = 24.dp()
    ),
    body3 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 14.dp(),
        lineHeight = 20.dp()
    ),
    body4 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.dp(),
        lineHeight = 20.dp()
    ),
    detail1 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Bold,
        fontSize = 12.dp(),
        lineHeight = 18.dp()
    ),
    detail2 = TextStyle(
        fontFamily = spoqaHanSansNeoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.dp(),
        lineHeight = 18.dp()
    ),
)

internal val LocalMintsLabTypography = staticCompositionLocalOf {
    MintsLabTypography(
        headline1 = TextStyle.Default,
        headline2 = TextStyle.Default,
        headline3 = TextStyle.Default,
        headline4 = TextStyle.Default,
        body1 = TextStyle.Default,
        body2 = TextStyle.Default,
        body3 = TextStyle.Default,
        body4 = TextStyle.Default,
        detail1 = TextStyle.Default,
        detail2 = TextStyle.Default,
    )
}

@Immutable
data class MintsLabTypography(
    val headline1: TextStyle,
    val headline2: TextStyle,
    val headline3: TextStyle,
    val headline4: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val body4: TextStyle,
    val detail1: TextStyle,
    val detail2: TextStyle,
)

val spoqaHanSansNeoFont = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal),
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)

@Composable
fun Int.dp() = with(LocalDensity.current) { Dp(this@dp.toFloat()).toSp() }