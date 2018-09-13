package com.v1sar.uitestdaggersample.integration.di;


import android.content.Context;

import com.v1sar.uitestdaggersample.UiTestApplication;
import com.v1sar.uitestdaggersample.inject.DummyNumber;
import com.v1sar.uitestdaggersample.integration.stub_classes.FakeDummyNumber;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeMainModule {

    private UiTestApplication mUiTestApplication;

    public FakeMainModule(UiTestApplication uiTestApplication) {
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
        return new FakeDummyNumber(context);
    }
}
