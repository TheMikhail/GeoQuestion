package com.example.calculatorkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mTrueButton: Button
    private lateinit var mFalseButton: Button
    private lateinit var mNextButton: Button
    private lateinit var mQuestionTextView: TextView



    private val mQuestionBank = arrayOf(
        Question(R.string.question_Australia, true),
        Question(R.string.question_Asia, true),
        Question(R.string.question_Moscow, true),
        Question(R.string.question_Americas, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_Africa, false),

    )
    private var mCurrentIndex:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mQuestionTextView = findViewById(R.id.question_text_view)
        var question = mQuestionBank[mCurrentIndex].getmTextResId()
        mQuestionTextView.setText(question)

        mTrueButton = findViewById(R.id.true_button)
        mFalseButton = findViewById(R.id.false_button)
        mNextButton = findViewById(R.id.next_button)

        mTrueButton.setOnClickListener {
            checkAnswer(true)
        }
        mFalseButton.setOnClickListener {
            checkAnswer(false)
        }
        mNextButton.setOnClickListener{
            mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.size
            question = mQuestionBank[mCurrentIndex].getmTextResId()
            mQuestionTextView.setText(question)
        }
    }
    private fun checkAnswer(userPressedTrue: Boolean){
        var answerIsTrue: Boolean = mQuestionBank[mCurrentIndex].ismAnswerTrue()
        var messageResId = 0

        if (userPressedTrue == answerIsTrue){
            messageResId = R.string.correct_toast
        }else
            messageResId = R.string.incorrect_toast
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()
    }

}