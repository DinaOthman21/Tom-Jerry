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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.IbmPlexSans



@Composable
fun Search(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        OutlinedTextField(
            value = "" ,
            onValueChange = {} ,
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            placeholder = {
                Text(
                    text = "Search about tom ...",
                    style = TextStyle(
                        color = Color(0xFF969799) ,
                        fontFamily = IbmPlexSans ,
                        fontWeight = FontWeight.Normal ,
                        fontSize = 14.sp
                    )
                )
            } ,
            leadingIcon = {
                Icon(
                    painterResource(R.drawable.ic_search) ,
                    contentDescription = "search icon" ,
                    tint = Color(0xFF969799),
                    modifier = Modifier.size(24.dp)
                )
            } ,
            shape = MaterialTheme.shapes.small ,
            colors =  OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White, focusedContainerColor = Color.White,
                unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.08f),
                focusedBorderColor = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.08f),
            )
        )

        IconButton(
            onClick = { },
            modifier = Modifier.size(48.dp)
                .background(Color(0xFF03578A), MaterialTheme.shapes.small)
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