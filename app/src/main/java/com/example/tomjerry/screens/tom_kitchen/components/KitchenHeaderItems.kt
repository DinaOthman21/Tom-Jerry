package com.example.tomjerry.screens.tom_kitchen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun TomKitchenHeaderItem(
    icon: Int,
    title: String
){
    Row {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = title,
            color = Color.White,
            fontSize = 16.sp,
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight.Medium,
            )
    }
}

@Composable
fun TomKitchenHeaderItems() {
    TomKitchenHeaderItem(
        icon = R.drawable.ruler,
        title = "Tom's Kitchen"
    )
    Spacer(Modifier.height(16.dp))
    TomKitchenHeaderItem(
        icon = R.drawable.chef,
        title = "Shocking foods"
    )
}

@Composable
fun TomKitchenHeaderSection(){
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
    ) {
        TomKitchenHeaderItems()
    }
}
