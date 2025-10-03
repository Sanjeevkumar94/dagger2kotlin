package com.example.flow.ManualDependency

import android.util.Log
import javax.inject.Inject

class UserRepository  @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.d("didata","User saved in DB")
    }
}