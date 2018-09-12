package com.v1sar.uitestdaggersample.di;

import com.v1sar.uitestdaggersample.activities.FirstFeature;
import com.v1sar.uitestdaggersample.activities.SecondFeature;
import com.v1sar.uitestdaggersample.activities.ThirdFeature;
import com.v1sar.uitestdaggersample.activities.ThirdFeatureFrw;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class, FrwModule.class, LongOperationsModule.class})
public interface MainComponent {

    void inject(FirstFeature firstFeature);

    void inject(SecondFeature secondFeature);

    void inject(ThirdFeature thirdFeature);

    void inject(ThirdFeatureFrw thirdFeatureFrw);

}
