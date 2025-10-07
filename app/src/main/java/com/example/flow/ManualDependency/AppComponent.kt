package com.example.flow.ManualDependency

import dagger.Component
import dagger.Module
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getAnalyticsService():AnalyticsService
}