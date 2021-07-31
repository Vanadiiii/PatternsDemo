package ru.imatveev.structural.facade;

import java.util.logging.Logger;

/**
 * <h3>complex object car</h3>
 * <h3>it's use another complex system with complex params and methods</h3>
 */
public class Car implements ICar {
    private static final Logger log = Logger.getLogger(Car.class.getSimpleName());
    private final Engine engine;
    private final FuelTankSystem fuelTankSystem;
    private final BeltSystem beltSystem;

    public Car(Engine engine, FuelTankSystem fuelTankSystem, BeltSystem beltSystem) {
        this.engine = engine;
        this.fuelTankSystem = fuelTankSystem;
        this.beltSystem = beltSystem;
    }

    /**
     * <h1>"one simple method to user..."</h1>
     * <h1>"and one giant method to programmer"</h1>
     * <h1>@me</h1>
     */
    @Override
    public void move() {
        try {
            beltSystem.check();
        } catch (BeltNotInsertedException e) {
            log.warning(e::getMessage);
            beltSystem.insert();
        }

        try {
            fuelTankSystem.check();
        } catch (EmptyFuelException e) {
            log.warning(e::getMessage);
            fuelTankSystem.fill();
        }

        engine.on();
    }
}
