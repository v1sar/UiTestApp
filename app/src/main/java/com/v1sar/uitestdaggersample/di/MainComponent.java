package com.v1sar.uitestdaggersample.di;

import com.v1sar.uitestdaggersample.activities.FirstFeature;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(FirstFeature firstFeature);
}
