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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quiz.ui.view.components.CardQuest
import com.example.quiz.ui.view.components.LogoApp
import com.example.quiz.ui.view.components.TagQuest
import com.example.quiz.ui.model.Alternativa
import com.example.quiz.ui.model.ResultadoFinal

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Quest2Screen(modifier: Modifier = Modifier) {
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
            Alternativa("Vênus", false),
            Alternativa("Marte", true),
            Alternativa("Júpter", false),
            Alternativa("Saturno", false)
        )

        LogoApp(tamanho = 50.dp)
        Spacer(Modifier.height(20.dp))
        TagQuest(numberQuest = 2, numberOfQuestions = 3)
        CardQuest(titulo = "Qual planeta é conhecido como planeta vermelho?", alternativas = alternativas, pontos = 20, resultadoFinalObject = ResultadoFinal())
    }
}