package com.v1sar.uitestdaggersample;

import android.app.Application;
import android.util.Log;

import com.v1sar.uitestdaggersample.di.DaggerMainComponent;
import com.v1sar.uitestdaggersample.di.MainComponent;

public class UiTestApplication extends Application {

    private static final String TAG = UiTestApplication.class.getSimpleName();
    private static UiTestApplication app;
    private MainComponent mMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        Log.w(TAG, "UiTestApplication onCreate()");
        mMainComponent = DaggerMainComponent.create();
    }

    public static UiTestApplication getApp() {
        return app;
    }

    public MainComponent getMainComponent() {
        return mMainComponent;
    }
}
