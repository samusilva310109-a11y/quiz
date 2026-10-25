package com.example.quiz.ui.view.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.autoSaver
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.ui.model.Alternativa
import com.example.quiz.ui.model.ResultadoFinal

@Composable
fun CardQuest(
    modifier: Modifier = Modifier,
    alternativas: List<Alternativa>,
    titulo: String,
    pontos: Int,
    resultadoFinalObject: ResultadoFinal,
    navigate: () -> Unit
) {

    Card(
        modifier
            .padding(horizontal = 20.dp, vertical = 15.dp)
            .size(width = 400.dp, height = 300.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 5.dp
        ),
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 15.dp)
                .fillMaxSize()
        ) {


            Text(
                modifier = Modifier.fillMaxWidth(),
                text = titulo,
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Justify
            )

            Text(
                "Esta questão vale: ${pontos}",
                fontSize = 15.sp,
                color = Color.Black
            )


            Spacer(Modifier.height(20.dp))

            for (alternativa in alternativas) {
                ButtonOption(
                    alternativa = alternativa,
                    pontos = pontos,
                    resultadoFinalObject = resultadoFinalObject,
                    navigate = navigate
                )
            }
        }
    }

}

@Composable
fun ButtonOption(
    modifier: Modifier = Modifier,
    alternativa: Alternativa,
    pontos: Int,
    resultadoFinalObject: ResultadoFinal,
    navigate: () -> Unit
) {
    var corFundo by remember {
        mutableStateOf(Color.White)
    }

    var borderColor by remember {
        mutableStateOf(Color.Black)
    }

    OutlinedButton(
        onClick = {
            resultadoFinalObject.verificarResposta(alternativa, pontos)
            corFundo = alterarCores(alternativa)
            borderColor = alterarCores(alternativa)
            navigate()
        },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, borderColor),
        colors = ButtonDefaults.buttonColors(
            containerColor = corFundo
        )
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = alternativa.texto,
            textAlign = TextAlign.Left,
            color = Color.Black
        )
    }
}

fun alterarCores(alternativa: Alternativa): Color {
    if (alternativa.isCorreta)
        return Color(0xFF79C27B)

    return Color(0xFFDCA6A6)
}
