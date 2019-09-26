package com.wadada.daggersample.di

import com.wadada.daggersample.Fuga
import com.wadada.daggersample.Hoge
import dagger.Module
import dagger.Provides

@Module
object AppModule {

    @Provides
    @JvmStatic
    fun provideHoge(): Hoge {
        return Hoge()
    }

    @Provides
    @JvmStatic
    fun provideFuga(hoge: Hoge): Fuga {
        return Fuga(hoge)
    }
}