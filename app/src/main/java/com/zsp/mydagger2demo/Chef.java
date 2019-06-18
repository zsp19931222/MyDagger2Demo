package com.zsp.mydagger2demo;

import java.util.Map;

import javax.inject.Inject;

/**
 * author：Andy on 2019/6/17 0017-14:12
 * email:zsp872126510@gmail.com
 */

public class Chef implements Cooking {
    private Menu menu;

    @Override
    public String cook() {
        //key菜名， value是否烹饪
        Map<String, Boolean> menuList = menu.getMenus();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Boolean> entry : menuList.entrySet()) {
            if (entry.getValue()) {
                sb.append(entry.getKey()).append(",");
            }
        }
        return sb.toString();
    }

    @Inject
    public Chef(Menu menu) {
        this.menu = menu;
    }
}
