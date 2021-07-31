package ru.imatveev.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        PassportTable passportTable = new PassportTable();
        PassportToPersonalInfoAdapter adapter = new PassportToPersonalInfoAdapter();
        BankServiceClient bankServiceClient = new BankServiceClientImpl(adapter, bankService);

        bankServiceClient.sendPassport(passportTable.getPassport());
    }
}
