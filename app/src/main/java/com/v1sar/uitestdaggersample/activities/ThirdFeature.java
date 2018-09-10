package com.v1sar.uitestdaggersample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.v1sar.uitestdaggersample.R;

public class ThirdFeature extends AppCompatActivity {

    private static final String TAG = ThirdFeature.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "ThirdFeature onCreate()");
        setContentView(R.layout.third_feature);
    }

}
