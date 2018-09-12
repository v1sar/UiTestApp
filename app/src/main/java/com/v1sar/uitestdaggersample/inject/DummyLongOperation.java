package com.v1sar.uitestdaggersample.inject;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class DummyLongOperation {

    private boolean isInitialized;

    public Completable doLongOperation() {
        return Completable.timer(1, TimeUnit.SECONDS, AndroidSchedulers.mainThread())
                .andThen(Completable.fromAction(() -> isInitialized = true));
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }
}
