package com.application.application.ui.activities;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import com.application.application.MyApplication;
import com.application.application.api.DataApi;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Abstract base class holding common login for activity.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    DataApi dataApi;

    /**
     * Inflate resource and bind views
     * @param layoutResID of layout to be inflated
     */
    protected void bindViewsToLayoutWithResourceId(@LayoutRes int layoutResID) {
        setContentView(layoutResID);
        ButterKnife.bind(this);
        bindBaseDependencies();
    }

    private void bindBaseDependencies() {
        MyApplication.instance()
                .component()
                .bind(this);
    }

}
