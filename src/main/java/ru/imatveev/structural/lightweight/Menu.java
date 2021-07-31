package ru.imatveev.structural.lightweight;

import java.util.logging.Logger;

public record Menu(Meal meal, Tea tea) implements IMenu {
    private static final Logger log = Logger.getLogger(Menu.class.getSimpleName());

    public Menu {
        log.info(() -> "Chief creating some of that: " + meal + " and " + tea);
    }

    @Override
    public void send() {
        log.info(() -> "Please, get your " + meal + " with " + tea);
    }
}
