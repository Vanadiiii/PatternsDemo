package ru.imatveev.structural.proxy;

import java.util.logging.Logger;

public class Restaurant {
    private static final Logger log = Logger.getLogger(Restaurant.class.getSimpleName());
    private final IMeatStorage storage;

    public Restaurant(IMeatStorage storage) {
        this.storage = storage;
    }

    public void cookMeat() {
        storage.get();
        log.info(() -> "And now - fresh tasty meal from this fresh meat! Enjoy, please)");
    }
}
