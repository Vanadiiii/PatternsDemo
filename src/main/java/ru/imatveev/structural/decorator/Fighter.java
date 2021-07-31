package ru.imatveev.structural.decorator;

public class Fighter {
    public void use(Combo combo) {
        combo.doSuperCombo();
    }
}
