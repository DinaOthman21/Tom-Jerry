package com.example.tomjerry.screens.tom_account

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomjerry.screens.tom_account.components.AccountHeader
import com.example.tomjerry.screens.tom_account.components.TomAccount
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun TomAccountScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
    ) {
            Image(
                modifier = Modifier
                    .height(185.dp)
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.account_background),
                contentDescription = "Account Photo",
                contentScale = ContentScale.Crop
            )

        Column {
            AccountHeader()
            Spacer(Modifier.height(8.dp))
            TomAccount()
        }
        Text(
            text = "v.TomBeta",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = IbmPlexSans,
            color = Color(0xFF121212).copy(alpha = .6f),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
        )
    }
}




@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TomAccountScreenPreview(){
  TomAccountScreen()
}