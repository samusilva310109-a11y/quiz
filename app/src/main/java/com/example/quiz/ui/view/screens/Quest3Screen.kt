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
import androidx.navigation.NavHostController
import com.example.quiz.ui.model.Alternativa
import com.example.quiz.ui.model.ResultadoFinal
import com.example.quiz.ui.view.components.CardQuest
import com.example.quiz.ui.view.components.LogoApp
import com.example.quiz.ui.view.components.TagQuest


@Composable
fun Quest3Screen(
    modifier: Modifier = Modifier,
    resultadoFinal: ResultadoFinal,
    navController: NavHostController
) {
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
            Alternativa("Ele é uma renda variável", false),
            Alternativa("Trata-se de um título híbrido", true),
            Alternativa("É um título privado", false),
            Alternativa("É indexado na taxa Selic", false)
        )

        LogoApp(tamanho = 50.dp)
        Spacer(Modifier.height(20.dp))
        TagQuest(numberQuest = 3, numberOfQuestions = 3)
        CardQuest(
            titulo = "Assinale a alternativa correta sobre o tesouro IPCA+",
            alternativas = alternativas,
            pontos = 30,
            resultadoFinalObject = resultadoFinal,
            navigate = {navController.navigate("Final")})
    }
}