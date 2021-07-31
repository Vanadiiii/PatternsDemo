package ru.imatveev.behavioral.cor;

import java.util.logging.Logger;

public class GasCheck extends AbstractCheck{
    private static final Logger log = Logger.getLogger(GasCheck.class.getSimpleName());

    @Override
    protected void concreteCheck(HouseInfo info) throws HouseInDangerException {
        if (!info.gasOff()) {
            throw HouseInDangerException.of("gas");
        } else {
            log.info("Gas is off");
        }
    }
}
