package com.wadada.daggersample.di

import com.wadada.daggersample.Fuga
import com.wadada.daggersample.Hoge
import dagger.Module
import dagger.Provides

@Module(includes = [ChildModule::class])
object ParentModule {
    @Provides
    @JvmStatic
    fun provideFuga(hoge: Hoge): Fuga {
        return Fuga(hoge)
    }
}