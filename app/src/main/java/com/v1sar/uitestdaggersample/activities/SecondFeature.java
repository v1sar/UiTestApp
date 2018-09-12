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

public class SecondFeature extends AppCompatActivity {

    private static final String TAG = SecondFeature.class.getSimpleName();

    @Inject
    DummyNumber mDummyNumber;

    TextView mDummyNumberTextView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getApp().getMainComponent().inject(this);
        super.onCreate(savedInstanceState);
        Log.w(TAG, "SecondFeature onCreate()");
        setContentView(R.layout.second_feature);

        mDummyNumberTextView = findViewById(R.id.dummyNumber2nd);
        mDummyNumberTextView.setText(mDummyNumber.getSomeNumber().toString());
    }

}
