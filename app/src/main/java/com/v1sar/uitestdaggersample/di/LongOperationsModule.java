package com.v1sar.uitestdaggersample.di;

import com.v1sar.uitestdaggersample.inject.DummyLongOperation;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LongOperationsModule {

    @Singleton
    @Provides
    DummyLongOperation provideDummyLongOperation() {
        return new DummyLongOperation();
    }

}
