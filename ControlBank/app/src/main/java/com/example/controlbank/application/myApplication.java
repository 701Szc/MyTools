package com.example.controlbank.application;

import android.app.Application;

/*
 * @function
 * 1.他是整个程序的入口
 * 2.初始化工作
 * 3.为整个应用的其他模块提供上下文环境
 * */
public class myApplication extends Application {

    private static myApplication mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static myApplication getInstance(){
        return mApplication;

    }
}
