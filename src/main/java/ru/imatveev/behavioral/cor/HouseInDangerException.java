package ru.imatveev.behavioral.cor;

public class HouseInDangerException extends RuntimeException{
    public HouseInDangerException(String message) {
        super(message);
    }

    public static HouseInDangerException of(String danger) {
        return new HouseInDangerException("Your can not leave hause, cause " + danger + " is ON!!");
    }
}
