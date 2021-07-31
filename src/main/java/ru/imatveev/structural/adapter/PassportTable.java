package ru.imatveev.structural.adapter;


/**
 * client. send data
 */
public class PassportTable {
    public PassportDto getPassport() {
        // stupid simple example
        return new PassportDto("0000", "123456", "John Connor");
    }
}
