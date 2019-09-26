package com.wadada.daggersample

import android.app.Application
import com.wadada.daggersample.di.AppComponent
import com.wadada.daggersample.di.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}