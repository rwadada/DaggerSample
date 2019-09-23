package com.wadada.daggersample

import android.app.Application
import com.wadada.daggersample.di.AppComponent
import com.wadada.daggersample.di.DaggerAppComponent

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val appComponent: AppComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}