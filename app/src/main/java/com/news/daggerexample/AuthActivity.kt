package com.news.daggerexample

import android.os.Bundle
import android.util.Log
import com.news.daggerexample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    // TODO here it need to be lateinit as dagger doent support injection in private field
    @Inject
    lateinit var gfgg: String

    // TODO error: Dagger does not support injection into private fields we cant print number
    /*@Inject
    var number: Int = 0*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("demo", gfgg)
       // Log.v("demo", ""+number)
    }
}