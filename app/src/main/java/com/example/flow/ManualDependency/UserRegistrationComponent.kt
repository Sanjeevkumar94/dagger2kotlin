package com.example.flow.ManualDependency

import com.example.flow.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@ActivityScope
@Component(  dependencies = [AppComponent::class], modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        fun build():UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount:Int):Builder
        fun appComponent(appComponent: AppComponent):Builder
    }
}
