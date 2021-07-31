package ru.imatveev.structural.decorator;

public abstract class BaseCombo implements Combo {
    protected final Combo combo;

    protected BaseCombo(Combo combo) {
        this.combo = combo;
    }
}
