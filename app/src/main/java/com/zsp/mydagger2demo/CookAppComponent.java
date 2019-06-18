package com.zsp.mydagger2demo;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * 相当于一个注射器，我们前面定义的Modules就是被注射的类，
 * 使用@Inject注入的对象的地方就是接受者类。
 * author：Andy on 2019/6/17 0017-14:20
 * email:zsp872126510@gmail.com
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModules.class,
        CookModules.class})
public interface CookAppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication>{}

}
