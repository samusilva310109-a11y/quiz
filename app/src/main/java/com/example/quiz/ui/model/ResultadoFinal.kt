package com.example.quiz.ui.model

class ResultadoFinal () {
    var alternativasCorretas: Int = 0
    var pontos: Int = 0

    private fun acrescentarPontos(pontos: Int){
        if (pontos > 0)
            this.pontos += pontos
    }

    private fun contarAlternativaCorreta(){
        this.alternativasCorretas++
    }

    fun verificarResposta(alternativa: Alternativa, pontos: Int){
        if (alternativa.isCorreta){
            contarAlternativaCorreta()
            acrescentarPontos(pontos)
        }
    }
}