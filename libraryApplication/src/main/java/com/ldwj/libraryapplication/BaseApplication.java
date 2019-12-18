package com.ldwj.libraryapplication;

import android.app.Application;
import android.support.multidex.MultiDex;
/**
 * 程序application
 */
public class BaseApplication extends Application {
    private static BaseApplication mInstance = null;


    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        mInstance = this;
    }

    public static BaseApplication getInstance() {
        return mInstance;
    }


}
