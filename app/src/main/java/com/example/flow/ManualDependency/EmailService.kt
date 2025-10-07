package com.example.flow.ManualDependency

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface NotificationService{
    fun send(to:String,from:String,body:String)
    }


@ApplicationScope
class EmailService @Inject constructor():NotificationService {

    override fun send(to: String, from: String, body: String) {
        Log.d("didata", "Email Sent")
    }
}

class MessageService(private val retryCount:Int):NotificationService {
    override fun send(to:String, from:String, body:String){
        Log.d("didata","Message Sent - Retry count $retryCount")
    }

}