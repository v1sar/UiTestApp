package com.v1sar.uitestdaggersample.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.v1sar.uitestdaggersample.R;
import com.v1sar.uitestdaggersample.inject.DummyFrw;
import com.v1sar.uitestdaggersample.inject.DummyLongOperation;

import javax.inject.Inject;

import static com.v1sar.uitestdaggersample.UiTestApplication.getApp;

public class ThirdFeatureFrw extends AppCompatActivity {

    @Inject
    DummyFrw mDummyFrw;

    @Inject
    DummyLongOperation mDummyLongOperation;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getApp().getMainComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_feature_frw);

        findViewById(R.id.goToThirdFeatureButton).setOnClickListener(view -> {
            if (!mDummyLongOperation.isInitialized()) {
                findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
                mDummyLongOperation.doLongOperation()
                        .subscribe(this::onInitializtionComplete);
            } else {
                onInitializtionComplete();
            }
        });
    }

    private void onInitializtionComplete() {
        mDummyFrw.setFrwFinished(true);
        startActivity(new Intent(ThirdFeatureFrw.this, ThirdFeature.class));
        finish();
    }

}
