package com.example.c_05

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Первый вопрос?",
            mapOf("Да" to 1, "Нет" to 0),
            "Нет",
            "Не знаю"
        )

        questionList.add(que1)

        val que2 = Question(
            2,
            "Второй вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
            "Не знаю"
        )

        questionList.add(que2)

        val que3 = Question(
            3,
            "Третий вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
            "Не знаю"
        )

        questionList.add(que3)

        val que4 = Question(
            4,
            "Четвертый вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
            "Не знаю"
        )

        questionList.add(que4)

        return questionList
    }
}