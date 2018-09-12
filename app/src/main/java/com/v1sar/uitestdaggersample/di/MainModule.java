package com.v1sar.uitestdaggersample.di;

import android.content.Context;

import com.v1sar.uitestdaggersample.UiTestApplication;
import com.v1sar.uitestdaggersample.inject.DummyNumber;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private UiTestApplication mUiTestApplication;

    public MainModule(UiTestApplication uiTestApplication) {
        mUiTestApplication = uiTestApplication;
    }

    @Singleton
    @Provides
    public Context providesContext() {
        return mUiTestApplication;
    }

    @Singleton
    @Provides
    DummyNumber provideDummyNumber(Context context) {
        return new DummyNumber(context);
    }

}
