package com.example.flow.ManualDependency

class UserRegistrationServiceManualDependency(
    private val userRepository: UserRepositoryManualDependency,
    private val emailService: EmailServiceManualDependency
) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email,password)
        emailService.send(email,"myemail@gmail.com","User Registered")
    }
}