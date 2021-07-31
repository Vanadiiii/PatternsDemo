package ru.imatveev.structural.proxy;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MeatStorage implements IMeatStorage {
    private static final Logger log = Logger.getLogger(MeatStorage.class.getSimpleName());

    /**
     * <h2>Super rude parody to DB...</h2>
     */
    public MeatStorage(){
        log.info(() -> "Wait, please. Our employee went to refrigerator to get some fresh meat");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.warning(() -> "Fridge is unavailable now... cause: " + e.getMessage());
        }
    }

    @Override
    public void get() {
        log.info(() -> "Take your meat, please");
    }
}
