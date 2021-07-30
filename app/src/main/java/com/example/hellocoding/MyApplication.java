package com.example.hellocoding;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static MyApplication getInstance() {
        return MyApplication.sInstance;
    }
}