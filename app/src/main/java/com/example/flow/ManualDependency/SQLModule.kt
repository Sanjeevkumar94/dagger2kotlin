package com.example.flow.ManualDependency

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class SQLModule {
 /*   @Binds
    abstract fun getSql(sqlRepository: SQLRepository):UserRepository*/

    @Provides
    fun getSql(sqlRepository: SQLRepository):UserRepository{
        return  sqlRepository
    }

}