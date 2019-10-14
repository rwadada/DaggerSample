package com.wadada.daggersample.di

import com.wadada.daggersample.Fruit
import com.wadada.daggersample.Object
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
object AppModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideObject(): Object {
        return Object()
    }

    @JvmStatic
    @Provides
    fun provideFruit(): Fruit {
        return Fruit()
    }

    @JvmStatic
    @Named("apple")
    @Provides
    fun provideApple(): Fruit {
        return Fruit("Apple")
    }

    @JvmStatic
    @Named("banana")
    @Provides
    fun provideBanana(): Fruit {
        return Fruit("Banana")
    }
}