package ru.imatveev.structural.facade;

import java.util.logging.Logger;

public class FuelTankSystem {
    private static final Logger log = Logger.getLogger(FuelTankSystem.class.getSimpleName());
    private static final int MAX_SIZE = 100;
    private int fuelCount;

    public void fill() {
        this.fuelCount = MAX_SIZE;
        log.info("Your fuel tank was filled to " + MAX_SIZE);
    }

    public void check() throws EmptyFuelException {
        if (fuelCount == 0) {
            throw EmptyFuelException.noFuel();
        }
        log.info(() -> "You has " + fuelCount + " for moving");
    }
}
