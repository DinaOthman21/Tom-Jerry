package com.example.tomjerry.screens.tom_kitchen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.screens.tom_kitchen.components.meal_details.MealDescription
import com.example.tomjerry.screens.tom_kitchen.components.meal_details.MealDetailsItems
import com.example.tomjerry.screens.tom_kitchen.components.meal_details.MealInfo
import com.example.tomjerry.screens.tom_kitchen.components.meal_details.PreparationStepsItems
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun MealDetailsSection(){
    Card(
        shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp),
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(Color(0xFFEEF4F6))
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(top = 32.dp, bottom = 15.dp)
        ) {
            MealInfo()
            Spacer(Modifier.height(16.dp))
            MealDescription()
            Spacer(Modifier.height(24.dp))
            Text(
                "Details",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color(0xFF1F1F1E).copy(alpha = .87f),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
            )
            Spacer(Modifier.height(8.dp))
            MealDetailsItems()
            Spacer(Modifier.height(24.dp))
            Text(
                "Preparation method",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color(0xFF1F1F1E).copy(.87f),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
            )
            Spacer(Modifier.height(8.dp))
            PreparationStepsItems()
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MealDetailsSectionPreview(){
    MealDetailsSection()
}

