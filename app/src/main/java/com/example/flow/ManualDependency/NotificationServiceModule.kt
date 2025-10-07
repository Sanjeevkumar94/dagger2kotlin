package com.example.flow.ManualDependency

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
 class NotificationServiceModule() {

     @ActivityScope
    @Named("message")
    @Provides
    fun getMessageService(retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }



}