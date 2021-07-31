package ru.imatveev.structural.facade;

public class BeltNotInsertedException extends RuntimeException{
    public BeltNotInsertedException(String message) {
        super(message);
    }

    public static BeltNotInsertedException notInsert() {
        return new BeltNotInsertedException("Your belt not inserted!");
    }
}
