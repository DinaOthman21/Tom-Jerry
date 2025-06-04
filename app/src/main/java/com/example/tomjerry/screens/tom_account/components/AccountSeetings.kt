package com.example.tomjerry.screens.tom_account.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans
import com.example.tomjerry.ui.theme.shapes

data class SettingContent(
    val image: Int,
    val title: String
)

val settings: List<SettingContent> = listOf(
    SettingContent(image = R.drawable.bed_single , title= "Change sleeping place"),
    SettingContent(image = R.drawable.cat, title = "Meow settings"),
    SettingContent(image = R.drawable.fridge, title = "Password to open the fridge"),
)

@Composable
fun SettingItem(modifier: Modifier = Modifier, setting: SettingContent) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = setting.image),
            contentDescription = null,
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = shapes.extraSmall
                )
                .padding(8.dp)
        )
        Spacer(Modifier.width(8.dp))
        Text(
            setting.title,
            fontSize = 16.sp,
            maxLines = 1,
            fontWeight = FontWeight.Medium,
            fontFamily = IbmPlexSans,
            color = Color(0xFF1F1F1E).copy(alpha = .87f),
        )
    }
}

@Composable
fun SettingsSection(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        settings.forEach { setting ->
            SettingItem(setting = setting)
        }
    }
}

val favorites: List<SettingContent> = listOf(
    SettingContent(image = R.drawable.alert, title = "Mouses"),
    SettingContent(image = R.drawable.hamburger, title = "Last stolen meal"),
    SettingContent(image = R.drawable.sleeping, title = "Change sleep mood"),
)

@Composable
fun FavoriteSection(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        favorites.forEach { favorite ->
            SettingItem(setting = favorite)
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun SettingItemPreview(){
   // SettingItem(setting = settings[0])
    //SettingsSection()
    FavoriteSection()
}