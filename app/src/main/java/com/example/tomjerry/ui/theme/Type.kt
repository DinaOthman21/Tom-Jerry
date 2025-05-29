package com.example.tomjerry.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val IbmPlexSans = FontFamily(
    Font(R.font.ibm_plex_sans_arabic_regular , weight = FontWeight.Normal) ,
    Font(R.font.ibm_plex_sans_arabic_medium , weight = FontWeight.Medium) ,
    Font(R.font.ibm_plex_sans_arabic_bold , weight = FontWeight.Bold) ,
    Font(R.font.ibm_plex_sans_arabic_semibold , weight = FontWeight.SemiBold) ,
    Font(R.font.ibm_plex_sans_arabic_thin , weight = FontWeight.Light)
)