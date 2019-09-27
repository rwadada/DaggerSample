package com.wadada.daggersample

import android.util.Log

class Fruit(val name: String? = null) {
    companion object {
        private val TAG: String = Fruit::class.java.simpleName
    }
    fun echo() {
        Log.d(TAG, "class name is ${name ?: TAG}")
    }
}