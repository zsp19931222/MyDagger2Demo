package com.zsp.mydagger2demo;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 主要作用是通过@ContributesAndroidInjector来标记哪个类需要使用依赖注入功能，
 * 这里标记的是MainActivity，所以MainActivity能通过@Inject注解来注入Chef对象
 * author：Andy on 2019/6/17 0017-14:19
 * email:zsp872126510@gmail.com
 */

@Module
abstract class ActivityModules {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    abstract SecondActivity secondActivity();
}
