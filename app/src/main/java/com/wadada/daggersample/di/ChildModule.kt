package com.wadada.daggersample.di

import com.wadada.daggersample.Hoge
import dagger.Module
import dagger.Provides

@Module(includes = [GrandChildModule::class])
object ChildModule

@Module
object GrandChildModule {
     @JvmStatic
     @Provides
     fun provideHoge(): Hoge {
         return Hoge()
     }
}