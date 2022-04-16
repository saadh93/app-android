package com.example.quizapp

object constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWEARS: String="correct_answers"

    fun getquestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"de quelle langage de programmation s'agit t il?",
        R.drawable.img_python, optioneone = "python",
            optionTwo = "c#",
            optionThree = "R",
            optionfour = "java script" ,
            correctAnswer = 1        )
        questionList.add(que1)
        // 2
        val que2 = Question(2,"de quelle langage de programmation s'agit t il?",
            R.drawable.java_lg, optioneone = "python",
            optionTwo = "c#",
            optionThree = "java",
            optionfour = "java script" ,
            correctAnswer = 3        )
        questionList.add(que2)
     // 3
        val que3 = Question(3,"de quelle langage de programmation s'agit t il?",
            R.drawable.js, optioneone = "python",
            optionTwo = "c#",
            optionThree = "R",
            optionfour = "java script" ,
            correctAnswer = 4        )
        questionList.add(que3)

        // 4
        val que4 = Question(4,"de quelle langage de programmation s'agit t il?",
            R.drawable.ruby, optioneone = "python",
            optionTwo = "c#",
            optionThree = "Ruby",
            optionfour = "java script" ,
            correctAnswer = 3       )
        questionList.add(que4)

        val que5 = Question(5,"de quelle langage de programmation s'agit t il?",
            R.drawable.php, optioneone = "python",
            optionTwo = "php",
            optionThree = "R",
            optionfour = "java script" ,
            correctAnswer = 2        )
        questionList.add(que5)

        val que6 = Question(6,"de quelle langage de programmation s'agit t il?",
            R.drawable.node_js, optioneone = "python",
            optionTwo = "c#",
            optionThree = "node js",
            optionfour = "java script" ,
            correctAnswer = 3        )
        questionList.add(que6)

        val que7 = Question(7,"de quelle langage de programmation s'agit t il?",
            R.drawable.wordpress, optioneone = "python",
            optionTwo = "c#",
            optionThree = "wordpres",
            optionfour = "java script" ,
            correctAnswer = 3        )
        questionList.add(que7)

        val que8 = Question(8,"de quelle langage de programmation s'agit t il?",
            R.drawable.syfoni, optioneone = "python",
            optionTwo = "c#",
            optionThree = "symphony",
            optionfour = "java script" ,
            correctAnswer = 3       )
        questionList.add(que8)

        val que9 = Question(9,"de quelle langage de programmation s'agit t il?",
            R.drawable.bootstrap_lg, optioneone = "python",
            optionTwo = "c#",
            optionThree = "R",
            optionfour = "bootstrap" ,
            correctAnswer = 4        )
        questionList.add(que9)

        val que10 = Question(10,"de quelle langage de programmation s'agit t il?",
            R.drawable.swift, optioneone = "swift",
            optionTwo = "c#",
            optionThree = "R",
            optionfour = "java script" ,
            correctAnswer = 1        )
        questionList.add(que10)






        return  questionList

    }
}