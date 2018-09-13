package com.v1sar.uitestdaggersample.integration.stub_classes;

import com.v1sar.uitestdaggersample.inject.DummyLongOperation;

import io.reactivex.Completable;

public class FakeDummyLongOperation extends DummyLongOperation {

    @Override
    public Completable doLongOperation() {
        return Completable.complete();
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}
