package com.zsp.mydagger2demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

/**
 * author：Andy on 2019/6/17 0017-15:05
 * email:zsp872126510@gmail.com
 */

public class SecondActivity extends DaggerActivity {
    @Inject
    Chef chef;
    @Inject
    Menu menu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("zsp", "chef: "+chef.cook());
        Log.d("zsp", "menu: "+menu.getMenus());
    }
}
