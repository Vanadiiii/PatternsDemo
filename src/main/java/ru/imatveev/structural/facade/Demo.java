package ru.imatveev.structural.facade;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new FuelTankSystem(), new BeltSystem());

        car.move();
    }
}
