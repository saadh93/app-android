package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlin.math.log

class QuizQuestions : AppCompatActivity(),View.OnClickListener {
    private var mCurrentPosition:Int=1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        mUserName = intent.getStringExtra(constants.USER_NAME)
        mQuestionList = constants.getquestion()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_thow.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_one.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


    }
    private  fun setQuestion(){

        val question = mQuestionList!![mCurrentPosition-1]
        defaultOptionView()
       if (mCurrentPosition == mQuestionList!!.size){
           btn_submit.text= "fin"
       }else{
           btn_submit.text="valider"
       }

        progressbar.progress= mCurrentPosition
        tv_progress.text= "$mCurrentPosition"+"/"+ progressbar.max
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optioneone
        tv_option_thow.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionfour


    }
    private fun defaultOptionView(){
        val options= ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_thow)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
  when(v?.id){
      R.id.tv_option_one ->{
          selectedoptionview(tv_option_one,1)
      }
      R.id.tv_option_thow ->{
          selectedoptionview(tv_option_thow,2)
      }
      R.id.tv_option_three ->{
          selectedoptionview(tv_option_three,3)
      }
      R.id.tv_option_four ->{
          selectedoptionview(tv_option_four,4)
      }
      R.id.btn_submit->{
          if (mSelectedOptionPosition == 0){
              mCurrentPosition ++
              when{
                  mCurrentPosition<= mQuestionList!!.size ->{
                      setQuestion()
                  }else ->{
                  val intent =  Intent(this,ResultActivty::class.java)
                  intent.putExtra(constants.USER_NAME,mUserName)
                  intent.putExtra(constants.CORRECT_ANSWEARS,mCorrectAnswers)
                  intent.putExtra(constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                  startActivity(intent)
                  }
              }
          }else{
              val question = mQuestionList?.get(mCurrentPosition-1)
              if(question!!.correctAnswer !=mSelectedOptionPosition){
                  answearView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
              }else{
                  mCorrectAnswers++
              }
              answearView(question.correctAnswer,R.drawable.correct_option_border_bg)
              if(mCurrentPosition == mQuestionList!!.size){
                  btn_submit.text= "Terminer!"
              }else{
                  btn_submit.text="question suivante"
              }
              mSelectedOptionPosition = 0
          }

      }

  }
    }
    private fun answearView(answear: Int, drawableview: Int){
        when(answear){
            1 ->{
                tv_option_one.background = ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            2 ->{
                tv_option_thow.background = ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            3 ->{
                tv_option_three.background = ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            4 ->{
                tv_option_four.background = ContextCompat.getDrawable(
                    this,drawableview
                )
            }
        }
    }
    private fun selectedoptionview( tv: TextView, selectedOptionNum: Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }
}