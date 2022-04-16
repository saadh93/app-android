package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_activty.*

class ResultActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_activty)
        val username = intent.getStringExtra(constants.USER_NAME)
        tv_name.text = username
        val totalquestions = intent.getIntExtra(constants.TOTAL_QUESTIONS,0)
        val correctanswer = intent.getIntExtra(constants.CORRECT_ANSWEARS,0)

        tv_score.text = "votre niveau est $correctanswer sur $totalquestions"
        btn_fin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}