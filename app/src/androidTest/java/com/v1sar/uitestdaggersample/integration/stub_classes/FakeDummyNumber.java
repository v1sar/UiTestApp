package com.v1sar.uitestdaggersample.integration.stub_classes;

import android.content.Context;

import com.v1sar.uitestdaggersample.inject.DummyNumber;

public class FakeDummyNumber extends DummyNumber {

    public FakeDummyNumber(Context context) {
        super(context);
    }

    @Override
    public Integer getSomeNumber() {
        return 1000;
    }

    @Override
    public void setSomeNumber(int number) {

    }
}
