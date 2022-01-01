package com.example.c_05

object Constants {

    fun getQuestions(): ArrayList<Question>  {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Испытываете ли Вы проблемы с памятью и/или мыслительными функциями головного мозга после перенесенной болезни?",
            mapOf("Да" to 1, "Нет" to 0),
            "Нет",
        )

        questionList.add(que1)

        val que2 = Question(
            2,
            "Испытываете ли Вы проблемы с памятью и/или мыслительными функциями головного мозга после перенесенной болезни?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
        )

        questionList.add(que2)

        val que3 = Question(
            3,
            "Третий вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",

            )

        questionList.add(que3)

        val que4 = Question(
            4,
            "Четвертый вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
        )
        questionList.add(que4)
        val que5 = Question(
            5,
            "Пятый вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
        )
        questionList.add(que5)
        val que6 = Question(
            6,
            "Шестой вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
        )
        questionList.add(que6)
        val que7 = Question(
            7,
            "Седьмой вопрос?",
//            "Да",
            mapOf("Да" to 1),
            "Нет",
        )

        questionList.add(que7)


        return questionList
    }
//    fun getAnswers(): ArrayList<Answers>{
//        val
//    }

}