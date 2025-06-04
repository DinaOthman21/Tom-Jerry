package com.example.tomjerry.screens.tom_account.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans
import com.example.tomjerry.ui.theme.shapes


@Composable
fun AccountHeader(modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                    .padding(top = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tom),
                contentDescription = "account image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(shapes.small)
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
                    color = Color.White.copy(alpha = .8f) ,
                    modifier = Modifier.fillMaxWidth() ,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color(0xFFFFFFFF).copy(alpha = .12f))
            ) {
                Text(
                    modifier = Modifier.padding(
                        vertical = 5.dp,
                        horizontal = 12.dp
                    ),
                    text = "Edit foolishness",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 13.sp,
                    fontFamily = IbmPlexSans,
                    color = Color.White
                )
            }
        }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview(){
    AccountHeader()
}