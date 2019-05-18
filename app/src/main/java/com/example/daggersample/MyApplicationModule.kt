package com.example.daggersample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyApplicationModule {
    // アプリ全体で注入したいインスタンスを設定する
    @Singleton
    @Provides
    fun provideHoge(application: MyApplication) = "Hoge"
}