package com.example.daggersample

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    // MainActivityに注入する際に使用するModuleを指定する。
    // 自動的にSubcomponentが生成され、そのSubcomponentにModuleが設定される。
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun contributeMainActivityInjector(): MainActivity
}