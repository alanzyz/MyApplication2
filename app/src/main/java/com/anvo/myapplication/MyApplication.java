package com.anvo.myapplication;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by Administrator on 2018/4/2.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "61bd9e0cf0", true);

    }
}
