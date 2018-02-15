package com.application.application.injection;

import com.application.application.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by corrupt on 7/16/17.
 */
@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    MyApplication provideApplication() {
        return application;
    }

}
