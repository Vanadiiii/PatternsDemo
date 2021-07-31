package ru.imatveev.structural.composite;

import java.util.logging.Logger;

public record EvilSolder(String name) implements EvilWarrior {
    private static final Logger log = Logger.getLogger(EvilSolder.class.getSimpleName());
    @Override
    public void executeOrder() {
        log.info(() -> name + ": Sir, yes, sir!!");
    }
}
