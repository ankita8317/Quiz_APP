package com.example.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.quiz.data.Topic
import com.example.quiz.ui.theme.QuizTheme
import com.example.quiz.ui.screens.SplashScreen
import com.example.quiz.ui.screens.TopicSelectionScreen
import com.example.quiz.ui.screens.QuizScreen
import com.example.quiz.ui.screens.ResultsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizTheme {
                QuizApp()
            }
        }
    }
}

@Composable
fun QuizApp() {
    var showSplash by remember { mutableStateOf(true) }
    var currentScreen by remember { mutableStateOf<Screen>(Screen.TopicSelection) }
    var selectedTopic by remember { mutableStateOf<Topic?>(null) }
    var finalScore by remember { mutableIntStateOf(0) }

    if (showSplash) {
        SplashScreen(
            onSplashFinished = {
                showSplash = false
            }
        )
    } else {
        when (currentScreen) {
            Screen.TopicSelection -> {
                TopicSelectionScreen(
                    onTopicSelected = { topic ->
                        selectedTopic = topic
                        currentScreen = Screen.Quiz
                    }
                )
            }
            Screen.Quiz -> {
                selectedTopic?.let { topic ->
                    QuizScreen(
                        topic = topic,
                        onQuizComplete = { score ->
                            finalScore = score
                            currentScreen = Screen.Results
                        },
                        onBackToTopicSelection = {
                            currentScreen = Screen.TopicSelection
                            selectedTopic = null
                            finalScore = 0
                        }
                    )
                }
            }
            Screen.Results -> {
                selectedTopic?.let { topic ->
                    ResultsScreen(
                        score = finalScore,
                        totalQuestions = topic.questions.size,
                        onPlayAgain = {
                            currentScreen = Screen.TopicSelection
                            selectedTopic = null
                            finalScore = 0
                        }
                    )
                }
            }
        }
    }
}

sealed class Screen {
    object TopicSelection : Screen()
    object Quiz : Screen()
    object Results : Screen()
}

@Preview(showBackground = true)
@Composable
fun QuizAppPreview() {
    QuizTheme {
        QuizApp()
    }
}