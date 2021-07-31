package ru.imatveev.structural.proxy;

import java.util.logging.Logger;

/**
 * <h2>it's not really good example, but...</h2>
 * <h2>this 'meatProxy' allow to enable real 'meatStorage' not in application start</h2>
 */
public class MeatStorageProxy implements IMeatStorage {
    private static final Logger log = Logger.getLogger(MeatStorageProxy.class.getSimpleName());
    private IMeatStorage storage = null;

    public MeatStorageProxy() {
        log.info(() -> "Now we dont use real storage, cause it's really slow...");
        log.info(() -> "storage now is - " + storage);
    }

    @Override
    public void get() {
        log.info(() -> "Time to get real storage!)");
        storage = new MeatStorage();
        storage.get();
    }
}
