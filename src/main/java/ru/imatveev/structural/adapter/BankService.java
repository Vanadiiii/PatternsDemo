package ru.imatveev.structural.adapter;

import java.util.logging.Logger;

/**
 * service, that receive some data
 */
public class BankService {
    public void sendData(PersonalInfoDto personalInfoDto) {
        Logger log = Logger.getLogger(this.getClass().getSimpleName());
        log.info(() -> "receive personal info - " +  personalInfoDto);
    }
}
