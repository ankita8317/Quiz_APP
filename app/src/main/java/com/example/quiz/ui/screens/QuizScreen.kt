@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.quiz.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.data.Topic
import androidx.activity.compose.BackHandler
import androidx.compose.material.icons.Icons
import androidx.compose.foundation.Canvas
import androidx.compose.material.icons.automirrored.filled.ArrowBack

@Composable
fun QuizScreen(
    topic: Topic,
    onQuizComplete: (Int) -> Unit,
    onBackToTopicSelection: () -> Unit
) {
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var score by remember { mutableIntStateOf(0) }
    var selectedAnswerIndex by remember { mutableStateOf<Int?>(null) }
    var isAnswerSubmitted by remember { mutableStateOf(false) }

    // Timer state
    var timer by remember(currentQuestionIndex, isAnswerSubmitted) { mutableIntStateOf(15) }
    val timerRunning = !isAnswerSubmitted

    // Timer effect
    LaunchedEffect(currentQuestionIndex, isAnswerSubmitted) {
        timer = 15
        if (!isAnswerSubmitted) {
            while (timer > 0 && !isAnswerSubmitted) {
                kotlinx.coroutines.delay(1000)
                timer--
            }
            if (timer == 0 && !isAnswerSubmitted) {
                // Auto-submit or move to next question
                isAnswerSubmitted = true
                if (selectedAnswerIndex == null) {
                    // No answer selected, count as incorrect (do nothing to score)
                } else if (selectedAnswerIndex == topic.questions[currentQuestionIndex].correctAnswerIndex) {
                    score++
                }
            }
        }
    }

    val currentQuestion = topic.questions[currentQuestionIndex]

    // Handle device back button
    BackHandler(enabled = true) {
        onBackToTopicSelection()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A237E)) // Dark blue background
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TopAppBar with back button
        TopAppBar(
            title = {},
            navigationIcon = {
                IconButton(onClick = { onBackToTopicSelection() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            )
        )
        Text(
            text = "Question ${currentQuestionIndex + 1} of ${topic.questions.size}",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = currentQuestion.question,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        currentQuestion.options.forEachIndexed { index, option ->
            OptionButton(
                text = option,
                isSelected = selectedAnswerIndex == index,
                isCorrect = isAnswerSubmitted && index == currentQuestion.correctAnswerIndex,
                isWrong = isAnswerSubmitted && selectedAnswerIndex == index && index != currentQuestion.correctAnswerIndex,
                onClick = {
                    if (!isAnswerSubmitted) {
                        selectedAnswerIndex = index
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (!isAnswerSubmitted) {
            Button(
                onClick = {
                    if (selectedAnswerIndex != null) {
                        isAnswerSubmitted = true
                        if (selectedAnswerIndex == currentQuestion.correctAnswerIndex) {
                            score++
                        }
                    }
                },
                enabled = selectedAnswerIndex != null,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9800) // Orange color for the submit button
                )
            ) {
                Text("Submit Answer")
            }
        } else {
            Button(
                onClick = {
                    if (currentQuestionIndex < topic.questions.size - 1) {
                        currentQuestionIndex++
                        selectedAnswerIndex = null
                        isAnswerSubmitted = false
                    } else {
                        onQuizComplete(score)
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9800) // Orange color for the next/finish button
                )
            ) {
                Text(
                    if (currentQuestionIndex < topic.questions.size - 1) "Next Question"
                    else "Finish Quiz"
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Timer at the bottom center
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 32.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            if (timerRunning) {
                CircularTimer(
                    timeLeft = timer,
                    totalTime = 15
                )
            }
        }
    }
}

@Composable
fun OptionButton(
    text: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    isWrong: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = when {
        isCorrect -> Color(0xFF4CAF50) // Green for correct answer
        isWrong -> Color(0xFFE57373) // Red for wrong answer
        isSelected -> Color(0xFF2196F3) // Blue for selected answer
        else -> Color(0xFFE0E0E0) // Light gray for unselected answer
    }

    val contentColor = when {
        isCorrect || isWrong || isSelected -> Color.White
        else -> Color.Black
    }

    val borderColor = when {
        isSelected -> Color.White
        else -> Color.Transparent
    }

    Button(
        onClick = onClick,
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 2.dp,
                color = borderColor,
                shape = RoundedCornerShape(8.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp,
            pressedElevation = 8.dp
        )
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CircularTimer(
    timeLeft: Int,
    totalTime: Int,
    modifier: Modifier = Modifier
) {
    val progress = timeLeft / totalTime.toFloat()
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        label = "timer_progress"
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.size(100.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Background circle
            drawArc(
                color = Color.White.copy(alpha = 0.2f),
                startAngle = -90f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = 8.dp.toPx(), cap = StrokeCap.Round)
            )
            // Foreground arc
            drawArc(
                color = Color.White,
                startAngle = -90f,
                sweepAngle = 360f * animatedProgress,
                useCenter = false,
                style = Stroke(width = 8.dp.toPx(), cap = StrokeCap.Round)
            )
        }
        Text(
            text = "$timeLeft",
            color = Color.White,
            fontSize = 32.sp
        )
    }
}