package ru.imatveev.structural.decorator;

import java.util.logging.Logger;

public class LegPanch extends BaseCombo {
    private static final Logger log = Logger.getLogger(LegPanch.class.getSimpleName());

    public LegPanch(Combo combo) {
        super(combo);
    }

    @Override
    public void doSuperCombo() {
        super.combo.doSuperCombo();
        log.info(() -> "SUPER RIGHT LEG PUNCH!!");
    }
}
