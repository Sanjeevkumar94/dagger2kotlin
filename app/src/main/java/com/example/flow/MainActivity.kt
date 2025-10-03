package com.example.flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.ManualDependency.DaggerUserRegistrationComponent
import com.example.flow.ManualDependency.UserRegistrationComponent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("sanj","123")


    }
}