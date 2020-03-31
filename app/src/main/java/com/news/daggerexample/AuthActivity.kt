package com.news.daggerexample

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.news.daggerexample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    // TODO here it need to be lateinit as dagger doent support injection in private field
    @Inject
    lateinit var test: String

    @Inject
    lateinit var mLogo: Drawable

    // TODO error: Dagger does not support injection into private fields we cant print number
    /*@Inject
    var number: Int = 0*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("demo", "mainactivity" + test)

        var img: ImageView = findViewById(R.id.logo)
        img?.setImageDrawable(mLogo)
    }
}