package com.example.tomjerry.screens.jerry_store.components

import androidx.compose.foundation.background
import com.example.tomjerry.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.IbmPlexSans
import com.example.tomjerry.ui.theme.shapes


@Composable
fun Search(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp) ,
            modifier = modifier
                .clip(shape = shapes.small)
                .weight(1f)
                .height(48.dp)
                .background(Color.White) ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = "search icon",
                modifier = Modifier
                    .background(Color.White)
                    .padding(start = 12.dp)
                    .clipToBounds().size(24.dp),
                tint = Color(0xFF969799),
            )
            Text(
                text = "Search about tom ...",
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                fontFamily = IbmPlexSans,
                color = Color(0xFF969799)
            )
        }

        IconButton(
            onClick = { },
            modifier = Modifier.size(48.dp)
                .background(Color(0xFF03578A), shapes.small)
        ) {
            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = "filter icon",
                tint = Color.White,
            )
        }
    }
    }


@Composable
@Preview(showSystemUi = true , showBackground = true)
fun SearchPreview(){
    Search()
}