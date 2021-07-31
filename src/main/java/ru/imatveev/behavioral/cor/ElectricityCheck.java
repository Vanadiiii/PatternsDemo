package ru.imatveev.behavioral.cor;

import java.util.logging.Logger;

public class ElectricityCheck extends AbstractCheck{
    private static final Logger log = Logger.getLogger(ElectricityCheck.class.getSimpleName());

    @Override
    protected void concreteCheck(HouseInfo info) throws HouseInDangerException {
        if (!info.electricityOff()) {
            throw HouseInDangerException.of("electricity");
        } else {
            log.info("Electricity is off");
        }
    }
}
