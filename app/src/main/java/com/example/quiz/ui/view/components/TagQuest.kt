package com.example.quiz.ui.view.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TagQuest(modifier: Modifier = Modifier, numberQuest:Int, numberOfQuestions: Int) {
    Card(
        modifier = modifier.size(height = 50.dp, width = 250.dp),
        colors = CardDefaults.cardColors(
            Color(0xFF89D5A6)
        ),
        border = BorderStroke(width = 1.dp, Color.Black)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Pergunta $numberQuest de $numberOfQuestions",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}