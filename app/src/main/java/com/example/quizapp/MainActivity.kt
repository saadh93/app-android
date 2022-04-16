package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                Toast.makeText( this,"merci dentrer votre nom", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestions::class.java)
                intent.putExtra(constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }

}