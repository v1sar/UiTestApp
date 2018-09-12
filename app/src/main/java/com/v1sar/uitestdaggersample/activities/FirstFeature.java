package com.v1sar.uitestdaggersample.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.v1sar.uitestdaggersample.R;
import com.v1sar.uitestdaggersample.inject.DummyNumber;

import javax.inject.Inject;

import static com.v1sar.uitestdaggersample.UiTestApplication.getApp;

public class FirstFeature extends AppCompatActivity {

    private static final String TAG = FirstFeature.class.getSimpleName();

    @Inject
    DummyNumber mDummyNumber;

    TextView mDummyNumberTextView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getApp().getMainComponent().inject(this);
        super.onCreate(savedInstanceState);
        Log.w(TAG, "FirstFeature onCreate()");
        setContentView(R.layout.first_feature);

        mDummyNumberTextView = findViewById(R.id.dummyNumber);
        mDummyNumberTextView.setText(mDummyNumber.getSomeNumber().toString());

        findViewById(R.id.dummyNumberIncreaser).setOnClickListener(view -> {
            mDummyNumber.setSomeNumber(mDummyNumber.getSomeNumber() + 1);
            mDummyNumberTextView.setText(mDummyNumber.getSomeNumber().toString());
        });
    }

}
