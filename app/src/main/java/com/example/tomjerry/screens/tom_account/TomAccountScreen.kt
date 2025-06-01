package com.example.tomjerry.screens.tom_account

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomjerry.screens.tom_account.components.AccountHeader

@Composable
fun TomAccountScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(Color(0xFFEEF4F6))
    ) {
        AccountHeader()
    }
}




@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TomAccountScreenPreview(){
TomAccountScreen()
}