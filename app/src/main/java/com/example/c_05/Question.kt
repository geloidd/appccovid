package com.example.c_05

data class Question(
    val id: Int,
    val question: String,
    val optionOne: Map<String, Int>,
//    val optionOne: String,
    val optionTwo: String,


)
