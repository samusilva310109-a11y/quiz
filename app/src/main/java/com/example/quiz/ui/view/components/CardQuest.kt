package com.example.quiz.ui.view.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.ui.viewModel.Alternativa

@Composable
fun CardQuest(modifier: Modifier = Modifier, alternativas: List<Alternativa>, titulo:String) {

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
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp).fillMaxSize()
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = titulo,
                fontSize = 20.sp,
                textAlign = TextAlign.Justify
            )

            Spacer(Modifier.height(20.dp))

            for (alternativa in alternativas){
                CardOptions(alternativa = alternativa)
            }
        }
    }

}

@Composable
fun CardOptions(modifier: Modifier = Modifier, alternativa: Alternativa) {
    OutlinedButton(
        onClick = {

        },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, Color(0xFFDBDBDB))
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = alternativa.texto,
            textAlign = TextAlign.Left,
            color = Color.Black
        )
    }
}