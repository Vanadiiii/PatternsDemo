package ru.imatveev.structural.composite;

import java.util.List;
import java.util.logging.Logger;

public record EvilCommander(String name, List<EvilWarrior> evilWarriors) implements EvilWarrior {
    private static Logger log = Logger.getLogger(EvilCommander.class.getSimpleName());

    @Override
    public void executeOrder() {
        log.info(() -> name + ": Yes, sir! Solders! Execute command!!");
        evilWarriors.forEach(EvilWarrior::executeOrder);
    }
}
