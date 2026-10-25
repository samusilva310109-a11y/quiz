package com.example.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quiz.ui.model.ResultadoFinal
import com.example.quiz.ui.theme.QuizTheme
import com.example.quiz.ui.view.screens.FinalScreen
import com.example.quiz.ui.view.screens.InitialScreen
import com.example.quiz.ui.view.screens.Quest1Screen
import com.example.quiz.ui.view.screens.Quest2Screen
import com.example.quiz.ui.view.screens.Quest3Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    val resultadoFinal = ResultadoFinal()

                    NavHost(
                        navController = navController,
                        startDestination = "InitialScreen",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left
                            )
                        },
                        enterTransition = {
                            fadeIn()
                        }
                    ){
                        composable(
                            route = "InitialScreen"
                        ){
                            InitialScreen(Modifier.padding(innerPadding), navController = navController)
                        }
                        composable(
                            route = "Quest1"
                        ) {
                            Quest1Screen(
                                Modifier.padding(innerPadding),
                                navController = navController,
                                resultadoFinal = resultadoFinal
                            )
                        }
                        composable(
                            route = "Quest2"
                        ) {
                            Quest2Screen(
                                Modifier.padding(innerPadding),
                                navController = navController,
                                resultadoFinal = resultadoFinal
                            )
                        }
                        composable(
                            route = "Quest3"
                        ) {
                            Quest3Screen(
                                Modifier.padding(innerPadding),
                                navController = navController,
                                resultadoFinal = resultadoFinal
                            )
                        }
                        composable(
                            route = "Final"
                        ) {
                            FinalScreen(
                                Modifier
                                    .padding(innerPadding),
                                resultadoFinalObject = resultadoFinal,
                                navController = navController
                            )
                        }
                    }

                }
            }
        }
    }
}