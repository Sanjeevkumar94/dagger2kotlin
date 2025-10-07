package com.example.flow.ManualDependency

import android.util.Log
import javax.inject.Inject


interface UserRepository{
    fun saveUser(email:String,password:String)
    }

@ActivityScope
class SQLRepository @Inject constructor( val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("didata","User saved in DB")
        analyticsService.trackEvent("SQLRepository","SQLRepository type")

    }
}

class FirebaseRepository(val analyticsService:AnalyticsService) :UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("didata","User saved in Firebase")
        analyticsService.trackEvent("Firebase","firebase type")
    }
}