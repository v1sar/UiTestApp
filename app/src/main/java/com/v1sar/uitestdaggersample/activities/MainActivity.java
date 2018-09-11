package com.v1sar.uitestdaggersample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.v1sar.uitestdaggersample.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(TAG, "MainActivity onCreate()");
        setContentView(R.layout.activity_main);
        initButtons();
    }

    private void initButtons() {
        findViewById(R.id.toFirstFeature).setOnClickListener(view -> {
            startActivity(new Intent(this, FirstFeature.class));
        });
        findViewById(R.id.toSecondFeature).setOnClickListener(view -> {
            startActivity(new Intent(this, SecondFeature.class));
        });
        findViewById(R.id.toThirdFeature).setOnClickListener(view -> {
                new Handler().postDelayed(() -> startActivity(new Intent(MainActivity.this, ThirdFeature.class)), 10000);
        });
    }

}
