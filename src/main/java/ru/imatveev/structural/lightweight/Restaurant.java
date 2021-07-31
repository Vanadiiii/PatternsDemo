package ru.imatveev.structural.lightweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * <h2>simple realization of cache</h2>
 * <h2>restaurant save that menu one time, to create it easily in the future</h2>
 */
public class Restaurant {

    /**
     * <h2>simple stupid menu's cache</h2>
     */
    private final List<Menu> menus = new ArrayList<>();

    public Menu getMenu(Meal meal, Tea tea) {
        Optional<Menu> foundedMenu = menus.parallelStream()
                .filter(menu -> menu.meal().equals(meal) && menu.tea().equals(tea))
                .findAny();

        if (foundedMenu.isEmpty()) {
            Menu menu = new Menu(meal, tea);
            menus.add(menu);
            return menu;
        } else {
            return foundedMenu.get();
        }
    }
}
