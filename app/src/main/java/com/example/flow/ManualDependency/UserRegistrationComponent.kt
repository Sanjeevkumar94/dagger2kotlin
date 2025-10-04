package com.example.flow.ManualDependency

import com.example.flow.MainActivity
import dagger.Component


@Component
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

}