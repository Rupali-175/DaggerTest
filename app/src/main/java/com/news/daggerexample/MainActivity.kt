package com.news.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    // TODO here it need to be lateinit as dagger doent support injection in private field
    @Inject
    lateinit var test: String

    @Inject
    lateinit var isAppActive: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("demo", "mainactivity" + test)
        Log.v("demo", "is app active" + isAppActive)
    }
}
