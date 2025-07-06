package com.example.quiz.data

data class Question(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    val difficulty: QuizDifficulty = QuizDifficulty.MEDIUM
)

data class Topic(
    val id: String,
    val name: String,
    val description: String,
    val questions: List<Question>
)

enum class QuizDifficulty {
    EASY, MEDIUM, HARD
}
