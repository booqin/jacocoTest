package com.example.jacoco;

import org.jacoco.agent.rt.CodeCoverageManager;

import android.app.Application;

/**
 * TODO
 * Created by BoQin on 2021/12/31.
 * Modified by BoQin
 *
 * @author BoQin
 * @Version
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CodeCoverageManager.init(this, getApplicationInfo().name, 1);
    }
}
