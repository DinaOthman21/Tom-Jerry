package com.example.tomjerry.screens.jerry_store.components.tom_item

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun TomItemHeader(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Cheap tom section",
            color = Color(0xFF1F1F1E) ,
            fontSize = 20.sp ,
            fontFamily = IbmPlexSans ,
            fontWeight = FontWeight.SemiBold
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                "View all",
                color = Color(0xFF03578A),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans
            )
            Spacer(Modifier.width(4.dp))
            Icon(
                painter = painterResource(R.drawable.ic_arrow_right),
                contentDescription = "view all",
                tint = Color(0xFF03578A)
            )

        }

    }
}