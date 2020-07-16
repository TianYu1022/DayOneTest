package com.tianyu.dayonetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tianyu.dayonetest.utils.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "田宇";
        String age = "18岁";
        Logger.d("MainActivity onCreate %s 说 我今年 %s 岁了" , str, age);
    }
}