package com.github.fbzhong.sample.syscrash;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import golib.Golib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Golib.init("test", "1.0");
    }
}
