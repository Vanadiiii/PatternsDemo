package ru.imatveev.structural.proxy;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Demo {
    private static final Logger log = Logger.getLogger(Demo.class.getSimpleName());
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = new Restaurant(new MeatStorageProxy());

        log.info(() -> "wait the order...");
        TimeUnit.SECONDS.sleep(5);

        restaurant.cookMeat();
    }
}
