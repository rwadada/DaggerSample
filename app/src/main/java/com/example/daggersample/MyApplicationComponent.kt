package com.example.daggersample

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    MyApplicationModule::class,
    ActivityModule::class
])
interface MyApplicationComponent {
    @Component.Builder
    interface Builder {
        // MyApplicationModuleでMyApplicationのインスタンスが利用できるようbindする
        @BindsInstance
        fun application(application: MyApplication): Builder

        // 設定済みのMyApplicationComponentインスタンスを生成する
        fun build(): MyApplicationComponent
    }

    // メンバー注入メソッド、MyApplicationへ注入する際に使用する
    fun inject(app: MyApplication)
}