package com.example.tomjerry.screens.tom_kitchen.components.meal_details

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.IbmPlexSans

data class PreparationStep(
    val number: String,
    val description: String
)

val preparationStepsList: List<PreparationStep> = listOf(
    PreparationStep("1", "Put the pasta in a toaster."),
    PreparationStep("2", "Pour battery juice over it."),
    PreparationStep("3", "Wait for the spark to ignite."),
    PreparationStep("4", "Serve with an insulating glove."),
)

@Composable
fun PreparationStepsItem(
    modifier: Modifier = Modifier,
    preparationStep: PreparationStep
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(
                topStart = 90.dp,
                topEnd = 12.dp,
                bottomStart = 90.dp,
                bottomEnd = 12.dp
            ))
            .background(Color.White)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
        ) {
            Text(
                text = preparationStep.number,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFD0E5F0),
                        shape = CircleShape
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp),
                color = Color(0xFF035587),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.width(8.dp))
        Text(
            preparationStep.description,
            fontSize = 14.sp,
            color = Color(0x99121212),
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}


@Composable
fun PreparationStepsItems(
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(bottom = 76.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(preparationStepsList.size) { index ->
            PreparationStepsItem(preparationStep = preparationStepsList[index])
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreparationStepsItemPreview(){
    PreparationStepsItems()
    /*PreparationStepsItem(
        preparationStep = PreparationStep(number = "1", description = "Put the pasta in a toaster.")
    )*/
}