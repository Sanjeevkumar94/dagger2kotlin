package com.example.flow.ManualDependency

import com.example.flow.MainActivity
import dagger.Component


@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}