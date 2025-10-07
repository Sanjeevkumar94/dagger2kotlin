package com.example.flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.ManualDependency.DaggerUserRegistrationComponent
import com.example.flow.ManualDependency.EmailService
import com.example.flow.ManualDependency.MessageService
import com.example.flow.ManualDependency.NotificationServiceModule
import com.example.flow.ManualDependency.UserApplication
import com.example.flow.ManualDependency.UserRegistrationComponent
import com.example.flow.ManualDependency.UserRegistrationService
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService2: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val component =(application as UserApplication).userRegistrationComponent

        component.inject(this)

        userRegistrationService.registerUser("sanj@yopmail.com","123")


    }
}