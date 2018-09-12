package com.v1sar.uitestdaggersample.inject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class DummyNumber {

    private static final String NUMBER_STORAGE = "number_storage";
    private static final String DUMMY_NUBMER = "number_storage";

    private SharedPreferences mSettings;

    public DummyNumber(Context context) {
        mSettings = context.getSharedPreferences(NUMBER_STORAGE, Context.MODE_PRIVATE);
    }

    public Integer getSomeNumber() {
        return mSettings.getInt(DUMMY_NUBMER, 0);
    }

    @SuppressLint("ApplySharedPref")
    public void setSomeNumber(int number) {
        mSettings.edit()
                .putInt(DUMMY_NUBMER, number)
                .commit();
    }

}
