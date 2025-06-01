package com.example.tomjerry.screens.jerry_store.components.tom_item

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IbmPlexSans



@Composable
fun TomItemCard(
    tom: TomItem
){
    Box(
        contentAlignment = Alignment.TopCenter,
    ){
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = MaterialTheme.shapes.medium
        ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 92.dp, start = 8.dp , end = 8.dp , bottom = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                 ) {
                    Text(
                        tom.title,
                        color = Color(0xFF1F1F1E),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IbmPlexSans
                    )
                    Text(
                        text = tom.description,
                        color = Color(0xFF969799),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = IbmPlexSans,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(
                                start = 8.dp, end = 8.dp
                            )
                            .align(Alignment.CenterHorizontally),
                        minLines = 3,
                        lineHeight = 18.sp
                    )
                    Spacer(Modifier.height(8.dp))
                   // Spacer(Modifier.weight(1f))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        CheesesItem(
                            oldValue =  tom.oldValue ,
                            newValue = tom.newValue
                        )
                        OutlinedIconButton(
                            onClick = {}, modifier = Modifier.size(30.dp),
                            shape = MaterialTheme.shapes.extraSmall ,
                            border = BorderStroke(1.dp, Color(0xFF03578A)),
                            colors = IconButtonDefaults.outlinedIconButtonColors(contentColor = MaterialTheme.colorScheme.primary)
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(R.drawable.ic_cart_icon),
                                contentDescription = "Add to Cart", modifier = Modifier.size(16.dp),
                                tint = Color(0xFF03578A)
                            )
                        }
                    }
                }

        }
        Image(
            painter = painterResource(tom.image) ,
            contentDescription = "tom image",
            modifier = Modifier.align(Alignment.TopCenter).size(100.dp),
            contentScale = ContentScale.Fit,
        )

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TomItemCardPreview(){
    TomItemCard(toms[0])
}

