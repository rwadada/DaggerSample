package com.wadada.daggersample.di

import android.app.Application
import com.wadada.daggersample.Hoge
import com.wadada.daggersample.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Provider

@Component
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }

    fun hogeProvider(): Provider<Hoge>

    fun inject(activity: MainActivity)
}