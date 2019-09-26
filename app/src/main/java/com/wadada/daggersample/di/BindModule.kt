package com.wadada.daggersample.di

import com.wadada.daggersample.api.Api
import com.wadada.daggersample.api.ApiImpl
import dagger.Binds
import dagger.Module

@Module
interface BindModule {
    @Binds
    fun bindApi(apiImpl: ApiImpl): Api
}