package com.example.flow.ManualDependency

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class FirebaseQualifier()

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class SqlQualifier()
