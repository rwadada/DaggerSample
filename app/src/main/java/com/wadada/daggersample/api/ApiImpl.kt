package com.wadada.daggersample.api

import android.util.Log
import javax.inject.Inject

class ApiImpl @Inject constructor() : Api {
    companion object {
        private val TAG: String = ApiImpl::class.java.simpleName
    }
    override fun echo() {
        Log.d(TAG, TAG)
    }
}