package ru.imatveev.structural.decorator;

import java.util.logging.Logger;

public class Apricot extends BaseCombo {
    private static final Logger log = Logger.getLogger(Apricot.class.getSimpleName());

    public Apricot(Combo combo) {
        super(combo);
    }

    @Override
    public void doSuperCombo() {
        super.combo.doSuperCombo();
        log.info(() -> "SUPER STAR'S APRICOT!!");
    }
}
