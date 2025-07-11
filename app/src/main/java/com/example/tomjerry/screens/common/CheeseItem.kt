package com.example.tomjerry.screens.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans
import com.example.tomjerry.ui.theme.shapes

@Composable
fun CheesesItem(
    modifier: Modifier = Modifier,
    newValue: Int,
    oldValue: Int? ,
    color: Color
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = color
        ),
        shape = shapes.extraSmall
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                modifier = Modifier.size(30.dp).padding(
                    top = 7.dp,
                    bottom = 7.dp,
                    end = 4.dp
                ),
                painter = painterResource(id = R.drawable.ic_money_bag),
                contentDescription = null,
                tint = Color(0xFF03578A)
            )
            Row {
                oldValue?.let {
                    Text(
                        text = it.toString(),
                        color = Color(0xFF03578A),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IbmPlexSans,
                        textDecoration = TextDecoration.LineThrough,
                    )
                }
                Text(
                    text = "$newValue cheeses",
                    modifier = Modifier.padding(end = 10.dp),
                    color = Color(0xFF03578A),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSans

                )
            }

        }
    }
}

