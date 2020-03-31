package com.news.daggerexample.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.news.daggerexample.R
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun someString(): String {
            return "hey from module"
        }

        //Todo create drawable dependacy and inject it into authacivity imageview
        @JvmStatic
        @Provides
        fun provideAppDrawable(context: Application): Drawable {
            return ContextCompat.getDrawable(context, R.drawable.ic_launcher_background)!!
        }


        // TODO below both cant inject this as its primitive..chk later leave for now
        /*************************************/
        fun getNumber(): Int = 600

        @Provides
        fun getApp(application: Application): Boolean {
            return application == null
        }

        /*************************************/

    }
}