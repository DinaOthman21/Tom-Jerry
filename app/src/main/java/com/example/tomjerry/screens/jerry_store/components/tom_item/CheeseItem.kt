package com.example.tomjerry.screens.jerry_store.components.tom_item

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun CheesesItem(
    modifier: Modifier = Modifier,
    newValue: String,
    oldValue: String = ""
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE9F6FB),
            ),
        shape = MaterialTheme.shapes.extraSmall
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(30.dp).padding(
                    top = 7.dp,
                    bottom = 7.dp,
                    start = 10.dp,
                    end = 4.dp
                ),
                painter = painterResource(id = R.drawable.ic_money_bag),
                contentDescription = null,
                tint = Color(0xFF03578A)
            )
            Row {
                Text(
                    text = oldValue,
                    color = Color(0xFF03578A),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSans,
                    textDecoration = TextDecoration.LineThrough,

                    )
                Text(
                    text = " $newValue cheeses",
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

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun CheesesItemPreview(){
    CheesesItem(newValue = "10", oldValue = "20")
}
