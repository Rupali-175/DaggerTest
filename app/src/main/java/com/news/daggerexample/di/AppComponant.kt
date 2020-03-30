package com.news.daggerpractice.di

import android.app.Application
import com.news.daggerexample.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        TestApp::class]
)
interface AppComponant : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder


        fun build(): AppComponant
    }
}
// TODO By extending this app by androidinjector we are telling the dagger that we are going to
// TODO inject this baseapplication class into this componant
// Baseappliction class will be the client of the AppComponant (will be service)

/* TODO java equivalent of Appcomponant
@Component(modules = AndroidSupportInjectionModule.class)
        public interface TestApp extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application app);

        TestApp build();
    }
}*/
