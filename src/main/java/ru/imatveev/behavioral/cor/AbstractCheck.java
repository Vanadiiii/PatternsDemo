package ru.imatveev.behavioral.cor;

import java.util.logging.Logger;

public abstract class AbstractCheck implements ICheck {
    private static final Logger log = Logger.getLogger(AbstractCheck.class.getSimpleName());
    private ICheck next;

    @Override
    public void setNext(ICheck next) {
        this.next = next;
    }

    @Override
    public void check(HouseInfo info) throws HouseInDangerException {
        concreteCheck(info);
        if (next != null) {
            next.check(info);
        } else {
            log.info("All system are clear. Best of luck, master!");
        }
    }

    protected abstract void concreteCheck(HouseInfo info) throws HouseInDangerException;
}
