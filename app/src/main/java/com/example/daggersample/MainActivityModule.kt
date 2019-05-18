package com.example.daggersample

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides fun provideData() = Data(System.currentTimeMillis())
}

data class Data(var id: Long)