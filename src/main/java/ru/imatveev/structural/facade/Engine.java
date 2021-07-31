package ru.imatveev.structural.facade;

import java.util.logging.Logger;

public class Engine {
    private static final Logger log = Logger.getLogger(Engine.class.getSimpleName());

    private boolean on;

    public void on() {
        if (!on) {
            log.info(() -> "Engine is on");
            on = true;
        } else {
            log.warning(() -> "Engine is already on!!");
        }
    }

    public void off() {
        if (on) {
            log.info(() -> "Engine is off");
            on = false;
        } else {
            log.warning(() -> "Engine is already off!!");
        }
    }
}
