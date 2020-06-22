package com.example.brainlibsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.brain.core.Md5UtilWrapper;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("brain_wrapper");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test calls
        Md5UtilWrapper.computeMD5("test");
    }
}