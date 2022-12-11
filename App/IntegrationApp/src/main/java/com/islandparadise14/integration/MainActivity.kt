package com.islandparadise14.integration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import com.islandparadise14.designsystem.MintsLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MintsLabTheme {
                Column {
                    Text(text = "Hello Android")
                }
            }
        }
    }
}