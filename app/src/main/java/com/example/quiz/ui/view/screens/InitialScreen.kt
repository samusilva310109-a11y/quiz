package com.example.quiz.ui.view.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.ui.view.components.LogoApp

@Composable
fun InitialScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Color(0xFF83D8F7)
            )
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoApp(tamanho = 150.dp)

        Spacer(Modifier.height(100.dp))

        Text(
            text = "QUIZATRON 3000",
            fontSize = 24.sp,
            color = Color.Black
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate("Quest1")
            },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFFF9E058)
            ),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "COMERÇAR!", color = Color.Black)
        }
    }
}