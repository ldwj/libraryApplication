package com.tiamaes.libraryapplication;

import android.support.multidex.MultiDexApplication;

/**
 * 程序application
 */
public class BaseApplication extends MultiDexApplication {
    private static BaseApplication mInstance = null;



    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
    public static BaseApplication getInstance() {
        return mInstance;
    }
}
