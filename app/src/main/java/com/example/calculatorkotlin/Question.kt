package com.example.calculatorkotlin

class Question {
    private var mTextResId: Int
    private var mAnswerTrue: Boolean

   constructor(textResId: Int, answerTrue: Boolean){
        mTextResId = textResId
        mAnswerTrue = answerTrue
   }

    fun getmTextResId(): Int{
        return mTextResId
    }
    fun setmTextResId(){
        this.mTextResId = mTextResId
    }
    fun getmAnswerTrue(): Boolean{
        return mAnswerTrue
    }
    fun ismAnswerTrue(): Boolean{
        return mAnswerTrue
    }
    fun setmAnswerTrue(mAnswerTrue: Boolean){
        this.mAnswerTrue = mAnswerTrue
    }
}