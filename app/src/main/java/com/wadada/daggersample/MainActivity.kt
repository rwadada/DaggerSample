package com.wadada.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.wadada.daggersample.api.Api
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }
    @Inject
    lateinit var hoge: Hoge

    @Inject
    lateinit var fuga: Fuga

    @Inject
    lateinit var api: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myApplication: MyApplication = application as MyApplication

        myApplication.appComponent.inject(this)

        Log.d(TAG, hoge.toString())
        fuga.echo()
        api.echo()

        myApplication.appComponent.fruit().echo()
        myApplication.appComponent.apple().echo()
        myApplication.appComponent.banana().echo()
    }
}
