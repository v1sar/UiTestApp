package com.v1sar.uitestdaggersample.di;

import com.v1sar.uitestdaggersample.inject.DummyFrw;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FrwModule {

    @Singleton
    @Provides
    DummyFrw provideDummyFrw() {
        return new DummyFrw();
    }

}
