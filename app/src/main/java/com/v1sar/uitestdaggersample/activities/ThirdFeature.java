package com.v1sar.uitestdaggersample.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.v1sar.uitestdaggersample.R;
import com.v1sar.uitestdaggersample.inject.DummyFrw;
import com.v1sar.uitestdaggersample.inject.DummyLongOperation;

import javax.inject.Inject;

import static com.v1sar.uitestdaggersample.UiTestApplication.getApp;

public class ThirdFeature extends AppCompatActivity {

    private static final String TAG = ThirdFeature.class.getSimpleName();

    @Inject
    DummyFrw mDummyFrw;

    @Inject
    DummyLongOperation mDummyLongOperation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getApp().getMainComponent().inject(this);

        if (!mDummyFrw.isFrwFinished()) {
            startActivity(new Intent(this, ThirdFeatureFrw.class));
            finish();
        }

        super.onCreate(savedInstanceState);
        Log.d(TAG, "ThirdFeature onCreate()");
        setContentView(R.layout.third_feature);

        findViewById(R.id.resetFrwState).setOnClickListener(view -> {
            mDummyFrw.setFrwFinished(false);
        });
        findViewById(R.id.resetInitializationState).setOnClickListener(view -> {
            mDummyLongOperation.setInitialized(false);
        });
    }

    @SuppressLint("CheckResult")
    @Override
    protected void onResume() {
        super.onResume();
        if (!mDummyLongOperation.isInitialized()) {
            findViewById(R.id.resetFrwState).setVisibility(View.INVISIBLE);
            findViewById(R.id.resetInitializationState).setVisibility(View.INVISIBLE);
            findViewById(R.id.progressBar2).setVisibility(View.VISIBLE);
            mDummyLongOperation.doLongOperation().subscribe(this::afterInitialization);

        }
    }

    private void afterInitialization() {
        findViewById(R.id.resetFrwState).setVisibility(View.VISIBLE);
        findViewById(R.id.resetInitializationState).setVisibility(View.VISIBLE);
        findViewById(R.id.progressBar2).setVisibility(View.INVISIBLE);
    }
}
