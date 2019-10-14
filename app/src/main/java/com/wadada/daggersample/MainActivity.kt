package com.wadada.daggersample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
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

    @Inject
    lateinit var objectValue: Object

    @Inject
    lateinit var singletonValue: Singleton

    private val button: Button by lazy {
        findViewById<Button>(R.id.button)
    }

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

        Log.d(TAG, objectValue.objectValue.isEmpty().toString())
        Log.d(TAG, singletonValue.singletonValue.isEmpty().toString())

        button.setOnClickListener {
            objectValue.objectValue = "Object"
            singletonValue.singletonValue = "Singleton"

            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}
