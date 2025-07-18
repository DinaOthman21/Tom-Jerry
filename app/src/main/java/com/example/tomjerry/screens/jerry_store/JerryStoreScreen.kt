package com.example.tomjerry.screens.jerry_store

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.screens.jerry_store.components.Banner
import com.example.tomjerry.screens.jerry_store.components.Header
import com.example.tomjerry.screens.jerry_store.components.Search
import com.example.tomjerry.screens.jerry_store.components.tom_item.TomItemScreen

@Composable
fun JerryStoreScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .background(Color(0xFFEEF4F6))
            .padding(horizontal = 16.dp)
    ) {
            Header()
            Spacer(modifier = Modifier.height(12.dp))
            Search()
            Spacer(modifier = Modifier.height(8.dp))
            Banner()
            Spacer(modifier = Modifier.height(24.dp))
            TomItemScreen()
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun JerryStoreScreenPreview(){
    JerryStoreScreen()
}