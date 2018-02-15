package com.application.application.injection;

import com.application.application.ui.activities.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Main graph component
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        ApiModule.class
})
public interface ApplicationComponent {
    void bind(BaseActivity baseActivity);
}
