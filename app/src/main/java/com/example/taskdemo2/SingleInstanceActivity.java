package com.example.taskdemo2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SingleInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
    }
}
