package com.example.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tomjerry.screens.jerry_store.JerryStoreScreen
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.example.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryTheme {
                val systemUiController: SystemUiController = rememberSystemUiController()
                systemUiController.isSystemBarsVisible = false
                JerryStoreScreen()
            }
        }
    }
}
