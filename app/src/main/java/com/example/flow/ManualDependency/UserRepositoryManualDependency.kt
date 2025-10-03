package com.example.flow.ManualDependency

import android.util.Log

class UserRepositoryManualDependency {
    fun saveUser(email:String,password:String){
        Log.d("didata","User saved in DB")
    }
}