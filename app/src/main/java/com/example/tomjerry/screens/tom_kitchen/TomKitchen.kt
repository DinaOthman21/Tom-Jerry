package com.example.tomjerry.screens.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.R
import com.example.tomjerry.screens.tom_kitchen.components.MealDetailsSection
import com.example.tomjerry.screens.tom_kitchen.components.TomKitchenHeaderSection
import com.example.tomjerry.screens.tom_kitchen.components.meal_details.KitchenButton

@Composable
fun TomKitchenScreen() {
    Box {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxSize()
                .background(Color(0x80035484))
                .safeDrawingPadding()
                .padding(top = 48.dp)
        ) {
                TomKitchenHeaderSection()
                Spacer(Modifier.height(58.dp))
                MealDetailsSection()
        }
        KitchenButton(
            newValue = 5,
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 40.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.pasta),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 24.dp)
                .align(Alignment.TopEnd)
                .offset(y = 35.dp)
                .width(200.dp)
                .height(180.dp)
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TomKitchenScreenPreview(){
    TomKitchenScreen()
}
