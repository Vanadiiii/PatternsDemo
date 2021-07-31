package ru.imatveev.structural.facade;

import java.util.logging.Logger;

public class BeltSystem {
    private static final Logger log = Logger.getLogger(BeltSystem.class.getSimpleName());
    private boolean inserted;

    public void check() throws BeltNotInsertedException {
        if (!inserted) {
            throw BeltNotInsertedException.notInsert();
        } else {
            log.info(() -> "Belt is inserted, you can move");
        }
    }

    public void insert() {
        if (inserted) {
            log.warning(() -> "Your belt was already inserted!");
        } else {
            inserted = true;
            log.info(() -> "Your belt was inserted");
        }
    }
}
