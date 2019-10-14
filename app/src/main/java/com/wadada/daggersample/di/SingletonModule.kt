package com.wadada.daggersample.di

import dagger.Module
import dagger.Provides
import javax.inject.Scope
import javax.inject.Singleton

@Module
class SingletonModule {
    @Provides
    @Singleton
    fun provideSingleton(): com.wadada.daggersample.Singleton {
        return com.wadada.daggersample.Singleton()
    }
}