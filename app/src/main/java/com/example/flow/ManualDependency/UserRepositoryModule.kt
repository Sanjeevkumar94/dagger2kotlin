package com.example.flow.ManualDependency

import dagger.Module
import dagger.Provides


@Module
class UserRepositoryModule {

    @FirebaseQualifier
   @Provides
    fun getFirebaseRepository():UserRepository{
        return FirebaseRepository()
    }

    @SqlQualifier
    @Provides
    fun getSQLRepository():UserRepository{
        return SQLRepository()
    }

}