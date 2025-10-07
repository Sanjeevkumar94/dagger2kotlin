package com.example.flow.ManualDependency

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract  fun getSQLRepository(sqlRepository: SQLRepository):UserRepository

}