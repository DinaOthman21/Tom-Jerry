package com.example.tomjerry.screens.tom_account.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans


@Composable
fun AccountHeader(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color.Blue)
    ) {
        Image(
            painter = painterResource(id = R.drawable.tom),
            contentDescription = "account image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(MaterialTheme.shapes.small)
        )
        Spacer(Modifier.height(4.dp))
        Text(
            "Tom",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = IbmPlexSans,
            color = Color.White,
        )
        Text(
            "specializes in failure!",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = IbmPlexSans,
            color = Color.White,
        )
        Spacer(Modifier.height(4.dp))
        Text(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 6.dp),
            text = "Edit foolishness",
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = IbmPlexSans,
            color = Color.White,
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview(){
    AccountHeader()
}