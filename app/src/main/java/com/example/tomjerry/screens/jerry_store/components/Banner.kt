package com.example.tomjerry.screens.jerry_store.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun Banner() {
    Box {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .align(Alignment.BottomCenter),
            shape = MaterialTheme.shapes.medium,
        ) {
            Box {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.banner_background),
                    contentDescription = "Banner Background", modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(12.dp)
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IbmPlexSans
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = "Adopt Tom! (Free Fail-Free \nGuarantee)",
                        color = Color.White.copy(alpha = 0.8f) ,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = IbmPlexSans,
                    )
                }
            }
        }

        Image(
            painter = painterResource(R.drawable.rich_tom),
            contentDescription = "rich tom",
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .height(108.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun BannerPreview(){
    Banner()
}