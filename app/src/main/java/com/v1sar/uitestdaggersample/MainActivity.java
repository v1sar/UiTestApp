package com.v1sar.uitestdaggersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    private void initButtons() {
        findViewById(R.id.button).setOnClickListener(view -> {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        });

    }

}
