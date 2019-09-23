package com.wadada.daggersample.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}