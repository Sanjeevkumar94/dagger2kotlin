package com.example.flow.ManualDependency

import com.example.flow.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton


@ActivityScope
@Subcomponent( modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{


        fun build():UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount:Int):Builder
    }
}