package com.example.flow.ManualDependency

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @FirebaseQualifier private val userRepository: UserRepository,
    @Named("email")private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"myemail@gmail.com","User Registered")
    }
}