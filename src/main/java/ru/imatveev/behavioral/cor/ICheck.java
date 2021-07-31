package ru.imatveev.behavioral.cor;

public interface ICheck {
    void setNext(ICheck check) throws HouseInDangerException;

    void check(HouseInfo info);
}
