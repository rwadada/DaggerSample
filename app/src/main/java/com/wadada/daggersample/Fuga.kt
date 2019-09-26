package com.wadada.daggersample

import android.util.Log

class Fuga (private val hoge: Hoge) {
    companion object {
        private val TAG: String = Fuga::class.java.simpleName
    }
    fun echo() {
        Log.d(TAG, "Called $TAG")
    }
}