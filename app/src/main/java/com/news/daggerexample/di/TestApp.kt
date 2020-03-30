package com.news.daggerpractice.di

import com.news.daggerexample.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class TestApp {
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity?

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun someString(): String {
            return "hey from module"
        }

        fun getNumber(): Int = 600
    }
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