package com.example.tomjerry.screens.tom_kitchen.components.meal_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
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
import com.example.tomjerry.ui.theme.shapes


@Composable
fun KitchenButton(
    modifier: Modifier = Modifier ,
    oldValue : Int? = null ,
    newValue : Int
    ) {
    Button(
        colors = ButtonColors(
            contentColor = Color(0xFF226993),
            containerColor = Color(0xFF226993),
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        ),
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 16.dp),
        onClick = {} ,
        shape = shapes.medium
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Add to cart",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSans,
                color = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.ellipse),
                contentDescription = null,
                modifier = Modifier.padding(8.dp),
                tint = Color.Gray
            )
            Column {
                Text(
                    "$newValue cheeses",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSans,
                    color = Color.White
                )
                Text(
                    "$oldValue cheeses",
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSans,
                    color = Color.White,
                )
            }
        }

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ButtonPreview(){
    KitchenButton(oldValue = 5 , newValue = 3)
}