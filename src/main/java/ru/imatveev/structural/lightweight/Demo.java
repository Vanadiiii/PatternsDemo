package ru.imatveev.structural.lightweight;

import java.util.logging.Logger;

public class Demo {
    private static final Logger log = Logger.getLogger(Demo.class.getSimpleName());

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Menu menu1 = restaurant.getMenu(new Meal("meat"), new Tea("black"));
        menu1.send();

        Menu menu2 = restaurant.getMenu(new Meal("meat"), new Tea("black"));
        menu2.send();

        log.info(() -> "menu1 and menu2 are equals? Answer is " + (menu1 == menu2));
    }
}
