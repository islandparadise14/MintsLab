package com.islandparadise14.designsystem.util

import android.graphics.Color

class RgbHsvUtil(color: Int) {
    private var hue = 0f // 색조 (0f ~ 300f)
    private var saturation = 0f // 채도 (0f ~ 1.0f)
    private var value = 0f // 명도 (0f ~ 1.0f)

    init {
        val hsv = FloatArray(3)

        Color.colorToHSV(
            color,
            hsv
        )

        hue = hsv[0]
        saturation = hsv[1]
        value = hsv[2]
    }

    // 채도 낮추기
    fun changeSaturate(percent: Float): Int {
        var convertSaturate = saturation + percent

        convertSaturate = if (convertSaturate < 0) {
            0f
        } else if (convertSaturate > 1) {
            1f
        } else convertSaturate

        val newHsv = floatArrayOf(hue, convertSaturate, value)

        return Color.HSVToColor(newHsv)
    }

    // 명도 낮추기
    fun changeValue(percent: Float): Int {
        var convertValue = value + percent

        convertValue = if (convertValue < 0) {
            0f
        } else if (convertValue > 1) {
            1f
        } else convertValue

        val newHsv = floatArrayOf(hue, saturation, convertValue)

        return Color.HSVToColor(newHsv)
    }
}