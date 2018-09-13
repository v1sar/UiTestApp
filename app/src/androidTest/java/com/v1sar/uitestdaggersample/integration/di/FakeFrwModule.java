package com.v1sar.uitestdaggersample.integration.di;

import com.v1sar.uitestdaggersample.inject.DummyFrw;
import com.v1sar.uitestdaggersample.integration.stub_classes.FakeDummyFrw;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeFrwModule {

    @Singleton
    @Provides
    DummyFrw provideDummyFrw() {
        return new FakeDummyFrw();
    }

}
