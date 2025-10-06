package com.example.flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.ManualDependency.DaggerUserRegistrationComponent
import com.example.flow.ManualDependency.NotificationServiceModule
import com.example.flow.ManualDependency.UserRegistrationComponent
import com.example.flow.ManualDependency.UserRegistrationService
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()

        component.inject(this)

        userRegistrationService.registerUser("sanj@yopmail.com","123")


    }
}