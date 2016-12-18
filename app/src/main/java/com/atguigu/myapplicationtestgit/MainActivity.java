package com.atguigu.myapplicationtestgit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 练习使用Git
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "啦啦啦");
    }
}
