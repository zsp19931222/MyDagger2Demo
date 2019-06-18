package com.zsp.mydagger2demo;

import java.util.Map;

import javax.inject.Inject;

/**
 * author：Andy on 2019/6/17 0017-14:12
 * email:zsp872126510@gmail.com
 */

public class Menu {


    public Map<String, Boolean> menus;

    @Inject
    public Menu(Map<String, Boolean> menus) {
        this.menus = menus;
    }

    public Map<String, Boolean> getMenus() {
        return menus;
    }
}
