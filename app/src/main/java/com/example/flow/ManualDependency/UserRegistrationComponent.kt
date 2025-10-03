package com.example.flow.ManualDependency

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService

}