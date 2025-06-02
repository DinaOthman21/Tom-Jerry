package com.example.tomjerry.screens.tom_kitchen.components.meal_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.screens.common.CheesesItem
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun MealInfo(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier.fillMaxWidth() ,
        horizontalArrangement = Arrangement.SpaceBetween ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Electric Tom pasta",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color(0xFF1F1F1E).copy(alpha = .87f)
            )
            Spacer(Modifier.height(12.dp))
            CheesesItem(newValue = 5, oldValue = null, color =  Color(0xFFD0E5F0))
        }
        IconButton(
            onClick = { },
        ) {
            Image(
                painter = painterResource(id = R.drawable.favorite_icon),
                contentDescription = null
            )
        }
    }
}

@Composable
fun MealDescription(){
    Text(
        "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = IbmPlexSans,
        color = Color(0xFF121212).copy(alpha = 0.6f)
    )
}