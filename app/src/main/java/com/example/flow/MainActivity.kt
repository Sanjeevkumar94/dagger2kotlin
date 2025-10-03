package com.example.flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.ManualDependency.EmailServiceManualDependency
import com.example.flow.ManualDependency.UserRegistrationServiceManualDependency
import com.example.flow.ManualDependency.UserRepositoryManualDependency


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository = UserRepositoryManualDependency()
        val emailService = EmailServiceManualDependency()

        val userRegistrationService = UserRegistrationServiceManualDependency(userRepository,emailService)
        userRegistrationService.registerUser("sanj@gmail.com","12345")
    }
}