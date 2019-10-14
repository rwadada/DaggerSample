package com.wadada.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class SubActivity : AppCompatActivity() {
    companion object {
        private val TAG: String = SubActivity::class.java.simpleName
    }

    @Inject
    lateinit var objectValue: Object

    @Inject
    lateinit var singletonValue: Singleton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val myApplication: MyApplication = application as MyApplication

        myApplication.appComponent.inject(this)

        Log.d(TAG, objectValue.objectValue)
        Log.d(TAG, singletonValue.singletonValue)

    }
}
