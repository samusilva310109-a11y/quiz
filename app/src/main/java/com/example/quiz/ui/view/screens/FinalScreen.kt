package com.example.quiz.ui.view.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.ui.view.components.LogoApp

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun FinalScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoApp(tamanho = 90.dp)

        Spacer(Modifier.height(25.dp))

        Column(
            modifier = Modifier
                .background(Color(0xFF83D8F6))
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
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
                        text = "Bom Trabalho!",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                        )
                }
            }

            Spacer(Modifier.height(25.dp))

            Text(
                text = "Você acertou 1 de 3 Perguntas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(Modifier.height(25.dp))

        Button(
            onClick = {

            },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFFF9E058)
            ),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "JOGAR NOVAMENTE", color = Color.Black)
        }
    }
}