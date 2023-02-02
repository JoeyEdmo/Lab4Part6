package com.example.lab4part6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLaunchRotate(View view) {
        Intent starter = new Intent(this, RotateActivity.class);
        startActivity(starter);
    }

    public void onLaunchClock(View view) {
        Intent starter = new Intent(this, ClockActivity.class);
        startActivity(starter);
    }
}