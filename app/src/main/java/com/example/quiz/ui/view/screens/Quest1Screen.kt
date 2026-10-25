package com.example.quiz.ui.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quiz.ui.model.Alternativa
import com.example.quiz.ui.model.ResultadoFinal
import com.example.quiz.ui.view.components.CardQuest
import com.example.quiz.ui.view.components.LogoApp
import com.example.quiz.ui.view.components.TagQuest

@Composable
fun Quest1Screen(modifier: Modifier = Modifier, navController: NavController, resultadoFinal: ResultadoFinal) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Color(0xFFF098D0)
            )
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val alternativas = listOf(
            Alternativa("Londres", false),
            Alternativa("Berlim", false),
            Alternativa("Paris", true),
            Alternativa("Madri", false)
        )

        LogoApp(tamanho = 50.dp)
        Spacer(Modifier.height(20.dp))
        TagQuest(numberQuest = 1, numberOfQuestions = 3)
        CardQuest(
            titulo = "Qual a capital da França?",
            alternativas = alternativas,
            pontos = 10,
            resultadoFinalObject = resultadoFinal,
            navigate = { navController.navigate("Quest2") })
    }
}