package com.application.application;

import android.app.Application;

import com.application.application.injection.ApiModule;
import com.application.application.injection.ApplicationComponent;
import com.application.application.injection.ApplicationModule;
import com.application.application.injection.DaggerApplicationComponent;

/**
 * Global application class
 */
public class MyApplication extends Application {

    private static MyApplication sInstance;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        buildDependencyGraph();
    }

    public static MyApplication instance() {
        return sInstance;
    }

    public ApplicationComponent component() {
        return applicationComponent;
    }

    private void buildDependencyGraph() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModule(new ApiModule())
                .build();
    }

}
