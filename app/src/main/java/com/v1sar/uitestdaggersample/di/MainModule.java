package com.v1sar.uitestdaggersample.di;

import com.v1sar.uitestdaggersample.inject.DummyNumber;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Singleton
    @Provides
    DummyNumber provideDummyNumber() {
        return new DummyNumber(5);
    }

}
