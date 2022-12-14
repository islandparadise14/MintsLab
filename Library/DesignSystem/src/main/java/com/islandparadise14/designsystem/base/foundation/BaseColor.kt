package com.islandparadise14.designsystem.base.foundation

import androidx.compose.ui.graphics.Color

data class BaseColorPalette(
    val _50: Color,
    val _100: Color,
    val _200: Color,
    val _300: Color,
    val _400: Color,
    val _500: Color,
    val _600: Color,
    val _700: Color,
    val _800: Color,
    val _900: Color,
)

object BaseColor {
     object GrayScale {
         val white = Color(0xFF_FFFFFF)
         val gray50 = Color(0xFF_FAFAFA)
         val gray100 = Color(0xFF_F5F5F5)
         val gray200 = Color(0xFF_EEEEEE)
         val gray300 = Color(0xFF_E0E0E0)
         val gray400 = Color(0xFF_BDBDBD)
         val gray500 = Color(0xFF_9E9E9E)
         val gray600 = Color(0xFF_757575)
         val gray700 = Color(0xFF_616161)
         val gray800 = Color(0xFF_424242)
         val gray900 = Color(0xFF_212121)
         val gray950 = Color(0xFF_181818)
         val black = Color(0xFF_000000)
    }

    object Alpha {
        val transparent = Color(0x00_000000)
        val black10 = Color(0x1A_000000)
        val black20 = Color(0x33_000000)
        val black30 = Color(0x4D_000000)
        val black40 = Color(0x66_000000)
        val black50 = Color(0x80_000000)
        val black60 = Color(0x99_000000)
        val black70 = Color(0xB3_000000)
        val black80 = Color(0xCC_000000)
        val black90 = Color(0xE6_000000)
        val white10 = Color(0x1A_FFFFFF)
        val white20 = Color(0x33_FFFFFF)
        val white30 = Color(0x4D_FFFFFF)
        val white40 = Color(0x66_FFFFFF)
        val white50 = Color(0x80_FFFFFF)
        val white60 = Color(0x99_FFFFFF)
        val white70 = Color(0xB3_FFFFFF)
        val white80 = Color(0xCC_FFFFFF)
        val white90 = Color(0xE6_FFFFFF)
    }

    val red = BaseColorPalette(
        _50 = Color(0xFF_FFEBEE),
        _100 = Color(0xFF_FFCDD2),
        _200 = Color(0xFF_EF9A9A),
        _300 = Color(0xFF_E57373),
        _400 = Color(0xFF_EF5350),
        _500 = Color(0xFF_F44336),
        _600 = Color(0xFF_E53935),
        _700 = Color(0xFF_D32F2F),
        _800 = Color(0xFF_C62828),
        _900 = Color(0xFF_B71C1C),
    )
    val pink = BaseColorPalette(
        _50 = Color(0xFF_FCE4EC),
        _100 = Color(0xFF_F8BBD0),
        _200 = Color(0xFF_F48FB1),
        _300 = Color(0xFF_F06292),
        _400 = Color(0xFF_EC407A),
        _500 = Color(0xFF_E91E63),
        _600 = Color(0xFF_D81B60),
        _700 = Color(0xFF_C2185B),
        _800 = Color(0xFF_AD1457),
        _900 = Color(0xFF_880E4F),
    )
    val purple = BaseColorPalette(
        _50 = Color(0xFF_F3E5F5),
        _100 = Color(0xFF_E1BEE7),
        _200 = Color(0xFF_CE93D8),
        _300 = Color(0xFF_BA68C8),
        _400 = Color(0xFF_AB47BC),
        _500 = Color(0xFF_9C27B0),
        _600 = Color(0xFF_8E24AA),
        _700 = Color(0xFF_7B1FA2),
        _800 = Color(0xFF_6A1B9A),
        _900 = Color(0xFF_4A148C),
    )
    val deepPurple = BaseColorPalette(
        _50 = Color(0xFF_EDE7F6),
        _100 = Color(0xFF_D1C4E9),
        _200 = Color(0xFF_B39DDB),
        _300 = Color(0xFF_9575CD),
        _400 = Color(0xFF_7E57C2),
        _500 = Color(0xFF_673AB7),
        _600 = Color(0xFF_5E35B1),
        _700 = Color(0xFF_512DA8),
        _800 = Color(0xFF_4527A0),
        _900 = Color(0xFF_311B92),
    )
    val indigo = BaseColorPalette(
        _50 = Color(0xFF_E8EAF6),
        _100 = Color(0xFF_C5CAE9),
        _200 = Color(0xFF_9FA8DA),
        _300 = Color(0xFF_7986CB),
        _400 = Color(0xFF_5C6BC0),
        _500 = Color(0xFF_3F51B5),
        _600 = Color(0xFF_3949AB),
        _700 = Color(0xFF_303F9F),
        _800 = Color(0xFF_283593),
        _900 = Color(0xFF_1A237E),
    )
    val blue = BaseColorPalette(
        _50 = Color(0xFF_E3F2FD),
        _100 = Color(0xFF_BBDEFB),
        _200 = Color(0xFF_90CAF9),
        _300 = Color(0xFF_64B5F6),
        _400 = Color(0xFF_42A5F5),
        _500 = Color(0xFF_2196F3),
        _600 = Color(0xFF_1E88E5),
        _700 = Color(0xFF_1976D2),
        _800 = Color(0xFF_1565C0),
        _900 = Color(0xFF_0D47A1),
    )
    val lightBlue = BaseColorPalette(
        _50 = Color(0xFF_E1F5FE),
        _100 = Color(0xFF_B3E5FC),
        _200 = Color(0xFF_81D4FA),
        _300 = Color(0xFF_4FC3F7),
        _400 = Color(0xFF_29B6F6),
        _500 = Color(0xFF_03A9F4),
        _600 = Color(0xFF_039BE5),
        _700 = Color(0xFF_0288D1),
        _800 = Color(0xFF_0277BD),
        _900 = Color(0xFF_01579B),
    )
    val cyan = BaseColorPalette(
        _50 = Color(0xFF_E0F7FA),
        _100 = Color(0xFF_B2EBF2),
        _200 = Color(0xFF_80DEEA),
        _300 = Color(0xFF_4DD0E1),
        _400 = Color(0xFF_26C6DA),
        _500 = Color(0xFF_00BCD4),
        _600 = Color(0xFF_00ACC1),
        _700 = Color(0xFF_0097A7),
        _800 = Color(0xFF_00838F),
        _900 = Color(0xFF_006064),
    )
    val teal = BaseColorPalette(
        _50 = Color(0xFF_E0F2F1),
        _100 = Color(0xFF_B2DFDB),
        _200 = Color(0xFF_80CBC4),
        _300 = Color(0xFF_4DB6AC),
        _400 = Color(0xFF_26A69A),
        _500 = Color(0xFF_009688),
        _600 = Color(0xFF_00897B),
        _700 = Color(0xFF_00796B),
        _800 = Color(0xFF_00695C),
        _900 = Color(0xFF_004D40),
    )
    val green = BaseColorPalette(
        _50 = Color(0xFF_E8F5E9),
        _100 = Color(0xFF_C8E6C9),
        _200 = Color(0xFF_A5D6A7),
        _300 = Color(0xFF_81C784),
        _400 = Color(0xFF_66BB6A),
        _500 = Color(0xFF_4CAF50),
        _600 = Color(0xFF_43A047),
        _700 = Color(0xFF_388E3C),
        _800 = Color(0xFF_2E7D32),
        _900 = Color(0xFF_1B5E20),
    )
    val lightGreen = BaseColorPalette(
        _50 = Color(0xFF_F1F8E9),
        _100 = Color(0xFF_DCEDC8),
        _200 = Color(0xFF_C5E1A5),
        _300 = Color(0xFF_AED581),
        _400 = Color(0xFF_9CCC65),
        _500 = Color(0xFF_8BC34A),
        _600 = Color(0xFF_7CB342),
        _700 = Color(0xFF_689F38),
        _800 = Color(0xFF_558B2F),
        _900 = Color(0xFF_33691E),
    )
    val lime = BaseColorPalette(
        _50 = Color(0xFF_F9FBE7),
        _100 = Color(0xFF_F0F4C3),
        _200 = Color(0xFF_E6EE9C),
        _300 = Color(0xFF_DCE775),
        _400 = Color(0xFF_D4E157),
        _500 = Color(0xFF_CDDC39),
        _600 = Color(0xFF_C0CA33),
        _700 = Color(0xFF_AFB42B),
        _800 = Color(0xFF_9E9D24),
        _900 = Color(0xFF_827717),
    )
    val yellow = BaseColorPalette(
        _50 = Color(0xFF_FFFDE7),
        _100 = Color(0xFF_FFF9C4),
        _200 = Color(0xFF_FFF59D),
        _300 = Color(0xFF_FFF176),
        _400 = Color(0xFF_FFEE58),
        _500 = Color(0xFF_FFEB3B),
        _600 = Color(0xFF_FDD835),
        _700 = Color(0xFF_FBC02D),
        _800 = Color(0xFF_F9A825),
        _900 = Color(0xFF_F57F17),
    )
    val amber = BaseColorPalette(
        _50 = Color(0xFF_FFF8E1),
        _100 = Color(0xFF_FFECB3),
        _200 = Color(0xFF_FFE082),
        _300 = Color(0xFF_FFD54F),
        _400 = Color(0xFF_FFCA28),
        _500 = Color(0xFF_FFC107),
        _600 = Color(0xFF_FFB300),
        _700 = Color(0xFF_FFA000),
        _800 = Color(0xFF_FF8F00),
        _900 = Color(0xFF_FF6F00),
    )
    val orange = BaseColorPalette(
        _50 = Color(0xFF_FFF3E0),
        _100 = Color(0xFF_FFE0B2),
        _200 = Color(0xFF_FFCC80),
        _300 = Color(0xFF_FFB74D),
        _400 = Color(0xFF_FFA726),
        _500 = Color(0xFF_FF9800),
        _600 = Color(0xFF_FB8C00),
        _700 = Color(0xFF_F57C00),
        _800 = Color(0xFF_EF6C00),
        _900 = Color(0xFF_E65100),
    )
    val deepOrange = BaseColorPalette(
        _50 = Color(0xFF_FBE9E7),
        _100 = Color(0xFF_FFCCBC),
        _200 = Color(0xFF_FFAB91),
        _300 = Color(0xFF_FF8A65),
        _400 = Color(0xFF_FF7043),
        _500 = Color(0xFF_FF5722),
        _600 = Color(0xFF_F4511E),
        _700 = Color(0xFF_E64A19),
        _800 = Color(0xFF_D84315),
        _900 = Color(0xFF_BF360C),
    )
    val brown = BaseColorPalette(
        _50 = Color(0xFF_EFEBE9),
        _100 = Color(0xFF_D7CCC8),
        _200 = Color(0xFF_BCAAA4),
        _300 = Color(0xFF_A1887F),
        _400 = Color(0xFF_8D6E63),
        _500 = Color(0xFF_795548),
        _600 = Color(0xFF_6D4C41),
        _700 = Color(0xFF_5D4037),
        _800 = Color(0xFF_4E342E),
        _900 = Color(0xFF_3E2723),
    )
}