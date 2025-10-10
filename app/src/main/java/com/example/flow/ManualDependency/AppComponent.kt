package com.example.flow.ManualDependency

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getUserRegistrationComponentBuilder():UserRegistrationComponent.Builder
}