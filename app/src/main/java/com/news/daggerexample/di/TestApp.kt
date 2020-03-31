package com.news.daggerpractice.di

import com.news.daggerexample.AuthActivity
import com.news.daggerexample.MainActivity

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class TestApp {
    //TODO if we dont decalre it as below Caused by: java.lang.IllegalArgumentException:
    // No injector factory bound for Class<com.news.daggerexample.MainActivity>

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity?

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity?

    // TODO I commented it becoz i used other class AppModule as dependancy which is not abstract
    // TODO and contains the string injection.. just for separation
   /* @Module
    companion object {
        @JvmStatic
        @Provides
        fun someString(): String {
            return "hey from module"
        }

        fun getNumber(): Int = 600
    }*/

}

/*
@Module
public abstract class TestApp {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString() {
        return "hey from module";
    }
}
 */