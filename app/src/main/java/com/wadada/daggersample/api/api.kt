package com.wadada.daggersample.api

import android.util.Log

interface Api {
    companion object {
        private val TAG: String = Api::class.java.simpleName
    }
    fun echo() {
        Log.d(TAG, TAG)
    }
}