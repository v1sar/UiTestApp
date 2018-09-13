package com.v1sar.uitestdaggersample.integration.stub_classes;

import com.v1sar.uitestdaggersample.inject.DummyFrw;

public class FakeDummyFrw extends DummyFrw {

    private boolean isFrwFinished;

    @Override
    public boolean isFrwFinished() {
        return isFrwFinished;
    }

    @Override
    public void setFrwFinished(boolean frwFinished) {
        isFrwFinished = frwFinished;
    }
}
