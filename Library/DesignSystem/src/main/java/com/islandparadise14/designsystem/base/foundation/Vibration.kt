package com.islandparadise14.designsystem.base.foundation

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

enum class Vibration(val timings: LongArray, val amplitudes: IntArray) {
    SUCCESS(longArrayOf(0, 20, 80, 30), intArrayOf(0, 60, 0, 100)),
    WARNING(longArrayOf(0, 20, 40, 20), intArrayOf(0, 120, 0, 80)),
    FAILURE(longArrayOf(0, 20, 40, 20, 40, 30, 30, 60), intArrayOf(0, 80, 0, 80, 0, 150, 0, 80)),
    INTERACT(longArrayOf(0, 10), intArrayOf(0, 90))
}

fun Context.vibe(vibration: Vibration) {
    val vibrator: Vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val vibrationManager: VibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
        vibrationManager.defaultVibrator
    } else {
        @Suppress("DEPRECATION")
        getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    val repeat = -1 // 반복안함

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        vibrator.vibrate(VibrationEffect.createWaveform(vibration.timings, vibration.amplitudes, repeat))
    } else {
        vibrator.vibrate(vibration.timings, repeat)
    }
}