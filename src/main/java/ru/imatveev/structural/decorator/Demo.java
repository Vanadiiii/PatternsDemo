package ru.imatveev.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        Combo combo = new HandHit();
        combo = new LegPanch(combo);
        combo = new Apricot(combo);

        Fighter fighter = new Fighter();
        fighter.use(combo);
    }
}
