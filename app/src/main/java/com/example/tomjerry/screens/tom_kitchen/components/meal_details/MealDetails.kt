package com.example.tomjerry.screens.tom_kitchen.components.meal_details

import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans
import com.example.tomjerry.ui.theme.shapes

@Composable
fun MealDetailsItem(
    icon: Int,
    title: String,
    description: String,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = shapes.medium,
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFD0E5F0)
        )
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = Color(0xFF035587)
            )
            Spacer(modifier.height(12.dp))
            Text(
                title,
                fontSize = 14.sp,
                maxLines = 1,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color(0x99121212)
            )
            Spacer(modifier.height(4.dp))
            Text(
                description,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color(0x5E121212)
            )

        }
    }
}

@Composable
fun MealDetailsItems(){
    Row(
        modifier = Modifier.height(104.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        MealDetailsItem(
            modifier = Modifier.weight(1f),
            icon = R.drawable.temperature,
            title = "1000 V",
            description = "Temperature "
        )
        MealDetailsItem(
            modifier = Modifier.weight(1f),
            icon = R.drawable.timer_02,
            title = "3 sparks",
            description = "Time"
        )
        MealDetailsItem(
            modifier = Modifier.weight(1f),
            icon = R.drawable.evil,
            title = "1M 12K",
            description = "No. of deaths"
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MealDetailsItemPreview(){
    MealDetailsItems()
}
