package com.example.tomjerry.screens.tom_kitchen.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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

@Composable
fun MealDetailsItem(
    icon: Int,
    title: String,
    description: String,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = MaterialTheme.shapes.medium,
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
@Preview(showBackground = true, showSystemUi = true)
fun MealDetailsItemPreview(){
    MealDetailsItem(
        icon = R.drawable.temperature ,
        title = "1000 V" ,
        description = "Temperature"
    )
}
