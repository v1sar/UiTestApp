package com.v1sar.uitestdaggersample.integration.di;

import com.v1sar.uitestdaggersample.di.MainComponent;
import com.v1sar.uitestdaggersample.integration.TestFeaturesWithMocks;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {FakeMainModule.class, FakeFrwModule.class, FakeLongOperationsModule.class})
public interface FakeComponent extends MainComponent {

    void inject(TestFeaturesWithMocks testFeaturesWithMocks);

}
