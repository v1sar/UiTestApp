package com.v1sar.uitestdaggersample.integration.di;

import com.v1sar.uitestdaggersample.inject.DummyLongOperation;
import com.v1sar.uitestdaggersample.integration.stub_classes.FakeDummyLongOperation;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeLongOperationsModule {

    @Singleton
    @Provides
    DummyLongOperation provideDummyLongOperation() {
        return new FakeDummyLongOperation();
    }

}
