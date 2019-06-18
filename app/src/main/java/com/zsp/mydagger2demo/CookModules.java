package com.zsp.mydagger2demo;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 目的就是通过@Provides注解提供Menu对象需要的数据。因为Menu是需要依赖一个Map对象的，
 * 所以我们通过CookModules构造一个Map对象，并自动把它注入到Menu实例里面
 * author：Andy on 2019/6/17 0017-14:18
 * email:zsp872126510@gmail.com
 */

@Module
public class CookModules {
    @Singleton
    @Provides
    public Map<String, Boolean> providerMenus() {
        Map<String, Boolean> menus = new LinkedHashMap<>();
        menus.put("酸菜鱼", true);
        menus.put("土豆丝", true);
        menus.put("铁板牛肉", true);
        return menus;
    }

}
