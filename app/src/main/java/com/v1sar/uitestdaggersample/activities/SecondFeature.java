package com.v1sar.uitestdaggersample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.v1sar.uitestdaggersample.R;

public class SecondFeature extends AppCompatActivity {

    private static final String TAG = SecondFeature.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(TAG, "SecondFeature onCreate()");
        setContentView(R.layout.second_feature);
    }

}
