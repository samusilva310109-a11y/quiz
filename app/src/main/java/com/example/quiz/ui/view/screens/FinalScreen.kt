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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.ui.model.ResultadoFinal
import com.example.quiz.ui.view.components.LogoApp


@Composable
fun FinalScreen(modifier: Modifier = Modifier, resultadoFinalObject: ResultadoFinal, navController: NavController) {
    Column(
        modifier = modifier.fillMaxSize().background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(25.dp))

        LogoApp(tamanho = 90.dp)
        Spacer(Modifier.height(25.dp))


        Column(
            modifier = Modifier
                .background(Color(0xFF83D8F6))
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
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
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                        )
                }
            }

            Text(
                text = "Você acertou ${resultadoFinalObject.alternativasCorretas} de 3 Perguntas",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium
            )

            Spacer(Modifier.height(2.dp))

            Text(
                text = "SUA PONTUAÇÃO: ${resultadoFinalObject.pontos}",
                fontSize = 19.sp,
                color = Color.Black,
            )
        }

        Spacer(Modifier.height(25.dp))

        Button(
            onClick = {
                navController.navigate("InitialScreen")
                resultadoFinalObject.alternativasCorretas = 0
                resultadoFinalObject.pontos = 0
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