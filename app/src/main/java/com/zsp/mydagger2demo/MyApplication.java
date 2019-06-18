package com.zsp.mydagger2demo;


import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


/**
 * 继承了DaggerApplication类，并且在applicationInjector方法中构建了个DaggerCookAppComponent注射器
 * author：Andy on 2019/6/17 0017-14:20
 * email:zsp872126510@gmail.com
 */

public class MyApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerCookAppComponent.builder().create(this);
    }
}

