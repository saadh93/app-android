package com.example.quizapp

data class Question (
    val id: Int,
    val question: String,
    val image: Int,
    val optioneone: String,
    val optionTwo:  String,
    val optionThree: String,
    val optionfour: String,
    val correctAnswer: Int
)

