package ru.imatveev.structural.composite;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        EvilWarrior solder1 = new EvilSolder("solder1");
        EvilWarrior solder2 = new EvilSolder("solder2");
        EvilWarrior solder3 = new EvilSolder("solder3");
        EvilWarrior solder4 = new EvilSolder("solder4");
        EvilWarrior solder5 = new EvilSolder("solder5");
        EvilWarrior solder6 = new EvilSolder("solder6");

        EvilWarrior commander1 = new EvilCommander("commander1", List.of(solder1, solder2));
        EvilWarrior commander2 = new EvilCommander("commander2", List.of(solder3, solder4, solder5));
        EvilWarrior commander3 = new EvilCommander("commander3", List.of(solder6));

        EvilWarrior mainAntagonist = new EvilCommander("Demon", List.of(commander1, commander2, commander3));

        mainAntagonist.executeOrder();

    }
}
