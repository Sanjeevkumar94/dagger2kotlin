package com.example.flow.ManualDependency

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(to:String,from:String,body:String){
        Log.d("didata","Email Sent")

    }

}