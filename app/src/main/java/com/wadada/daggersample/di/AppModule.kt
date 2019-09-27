package com.wadada.daggersample.di

import com.wadada.daggersample.Fruit
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object AppModule {

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