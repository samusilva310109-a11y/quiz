package com.example.quiz.ui.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.example.quiz.R

@Composable
fun LogoApp(modifier: Modifier = Modifier, tamanho: Dp) {
    Image(
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Quiz Icon",
        modifier = modifier.size(tamanho)
    )
}