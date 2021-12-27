package com.example.jacoco;

import android.util.Log;

/**
 * TODO
 * Created by BoQin on 2021/12/23.
 * Modified by BoQin
 *
 * @author BoQin
 * @Version
 */
public class SingleDemo {

    public static final String TAG = "jojo";

    private static SingleDemo mSingleDemo = new SingleDemo();

    private SingleDemo(){
        Log.d("BQ", "SingleDemo");
    }

    public static SingleDemo getInstance(){
        return mSingleDemo;
    }
}
