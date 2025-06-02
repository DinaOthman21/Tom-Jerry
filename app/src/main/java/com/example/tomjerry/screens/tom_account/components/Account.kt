package com.example.tomjerry.screens.tom_account.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.IbmPlexSans

@Composable
fun TomAccount(){
    Card(
        colors = CardColors(
            containerColor = Color(0xFFEEF4F6),
            contentColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = Color.Transparent
        ),
        shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp),
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.padding(top = 23.dp))
            StatusSection()
            Spacer(Modifier.height(24.dp))
            Text(
                "Tom settings",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = IbmPlexSans,
                color = Color(0xFF1F1F1E).copy(alpha = .87f),
            )
            Spacer(Modifier.height(8.dp))
            SettingsSection()
        }
            Spacer(Modifier.height(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFF001A1F).copy(alpha = .08f))
            )
            Spacer(Modifier.height(12.dp))
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        ) {
            Text(
                "His favorite foods",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = IbmPlexSans,
                color = Color(0xFF1F1F1E).copy(alpha = .87f),
            )
            Spacer(Modifier.height(8.dp))
            FavoriteSection()
            Spacer(Modifier.height(24.dp))
            Text(
                text = "v.TomBeta",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = IbmPlexSans,
                color = Color(0xFF121212).copy(alpha = .6f),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        Spacer(Modifier.height(24.dp))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TomAccountPreview(){
    TomAccount()
}