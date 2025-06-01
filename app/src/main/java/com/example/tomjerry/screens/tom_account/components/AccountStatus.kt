package com.example.tomjerry.screens.tom_account.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans

data class StatusContent(
    val image: Int,
    val color: Color,
    val title: String,
    val description: String
)

val status: List<StatusContent> = listOf(
    StatusContent(
        image = R.drawable.first_container,
        color = Color(0xFFD0E5F0),
        title = "2M 12K",
        description = "No. of quarrels"
    ),
    StatusContent(
        image = R.drawable.second_container,
        color = Color(0xFFDEEECD),
        title = "+500 h",
        description = "Chase time"
    ),
    StatusContent(
        image = R.drawable.third_container,
        color = Color(0xFFF2D9E7),
        title = "2M 12K",
        description = "Hunting times"
    ),
    StatusContent(
        image = R.drawable.last_container,
        color = Color(0xFFFAEDCF),
        title = "3M 7K",
        description = "Heartbroken"
    )
)

@Composable
fun StatusItem(modifier: Modifier = Modifier, status: StatusContent) {
    Row(
        modifier = modifier
            .background(
                color = status.color, shape = MaterialTheme.shapes.small,
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(start = 12.dp)
                .padding(vertical = 8.dp),
            painter = painterResource(id = status.image),
            contentDescription = null,
        )
        Spacer(Modifier.width(10.dp))
        Column(
            modifier = Modifier
                .padding(end = 10.dp)
                .padding(vertical = 11.dp)
        ) {
            Text(
                status.title,
                fontSize = 16.sp,
                maxLines = 1,
                fontWeight = FontWeight.SemiBold,
                fontFamily = IbmPlexSans,
                color = Color(0xFF121212).copy(alpha = .6f),
            )
            Text(
                status.description,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontFamily = IbmPlexSans,
                color = Color(0xFF121212).copy(alpha = .37f)
            )
        }
    }
}

@Composable
fun StatusSection(){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        status.chunked(2).forEach { chunk ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                chunk.forEach { item ->
                    StatusItem(
                        status = item,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun StatusItemPreview(){
   // StatusItem(status = status[0])
    StatusSection()
}
