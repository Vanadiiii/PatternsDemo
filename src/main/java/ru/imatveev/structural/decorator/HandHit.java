package ru.imatveev.structural.decorator;

import java.util.logging.Logger;

public class HandHit implements Combo {
    private static final Logger log = Logger.getLogger(HandHit.class.getSimpleName());

    @Override
    public void doSuperCombo() {
        log.info(() -> "SUPER HAND HIT!!");
    }
}
