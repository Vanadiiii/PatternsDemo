package ru.imatveev.behavioral.cor;

import java.util.logging.Logger;

public class WaterCheck extends AbstractCheck {
    private static final Logger log = Logger.getLogger(WaterCheck.class.getSimpleName());

    @Override
    public void  concreteCheck(HouseInfo info) throws HouseInDangerException {
        if (!info.waterOff()) {
            throw HouseInDangerException.of("water");
        } else {
            log.info("Water is off");
        }
    }
}
