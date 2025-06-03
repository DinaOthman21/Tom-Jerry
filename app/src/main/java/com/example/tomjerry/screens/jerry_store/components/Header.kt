package com.example.tomjerry.screens.jerry_store.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
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
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Box
import com.example.tomjerry.ui.theme.shapes


@Composable
fun Header(){
    Row(
        modifier = Modifier
            .padding(top = 6.dp)
            .fillMaxWidth() ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.profile_image) ,
            contentDescription = "profile image" ,
            contentScale = ContentScale.Crop ,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .size(48.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB" ,
                color = Color(0xFF1F1F1E),
                fontFamily = IbmPlexSans ,
                fontWeight = FontWeight.Medium ,
                fontSize = 14.sp
            )
            Text(
                text = "Which Tom do you want to buy?" ,
                color = Color(0xFFA5A6A4),
                fontFamily = IbmPlexSans ,
                fontWeight = FontWeight.Normal ,
                fontSize = 12.sp
            )
        }

        BadgedBox(
            modifier = Modifier.padding(end = 4.dp),
            badge = {
                Badge(containerColor = Color(0xFF03578A)) {
                    Text("3", color = Color.White, fontSize = 10.sp)
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF1F1F1E).copy(alpha = .15f),
                        shape = shapes.small
                    )
                    .padding(8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = "notification icon",
                )
            }
        }



    }
}

@Composable
@Preview(showSystemUi = true)
fun HeaderPreview(){
    Header()
}