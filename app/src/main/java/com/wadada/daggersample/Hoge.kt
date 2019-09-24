package com.wadada.daggersample

import android.util.Log
import javax.inject.Inject

class Hoge @Inject constructor() {
    override fun toString(): String =
        "HOGE"
}