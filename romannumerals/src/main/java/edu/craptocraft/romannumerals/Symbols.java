package edu.craptocraft.romannumerals;

public enum Symbols {

    I(1), V(5), X(10), L(50),
    C(100), D(500), M(1000), IV(4),
    IX(9), XL(40), XC(90), CD(400), CM(900),;

    private final int value;

    Symbols(int value) {
        this.value = value;
    }

    int getValue() {

        return this.value;
    }

}
