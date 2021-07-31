package ru.imatveev.structural.facade;

public class EmptyFuelException extends RuntimeException{
    public EmptyFuelException(String message) {
        super(message);
    }

    public static EmptyFuelException noFuel() {
        return  new EmptyFuelException("You has no fuel to move!");
    }
}
