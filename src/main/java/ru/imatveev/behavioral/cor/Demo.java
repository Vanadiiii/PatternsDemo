package ru.imatveev.behavioral.cor;

public class Demo {
    public static void main(String[] args) {
        ICheck check = new WaterCheck();
        ICheck check2 = new GasCheck();
        ICheck check3 = new ElectricityCheck();

        check.setNext(check2);
        check2.setNext(check3);

        HouseInfo info = new HouseInfo(true, true, true);
        check.check(info);

        HouseInfo badHouseInfo = new HouseInfo(true, false, true);
        check.check(badHouseInfo);
    }
}
