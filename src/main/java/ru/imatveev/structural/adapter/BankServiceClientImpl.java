package ru.imatveev.structural.adapter;

/**
 * <h3>service client, that use adapter to prepare some data</h3>
 */
public record BankServiceClientImpl(PassportToPersonalInfoAdapter adapter,
                                    BankService bankService) implements BankServiceClient {

    @Override
    public void sendPassport(PassportDto passportDto) {
        bankService.sendData(adapter.map(passportDto));
    }
}
