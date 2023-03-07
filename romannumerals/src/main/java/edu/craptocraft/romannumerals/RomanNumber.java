package edu.craptocraft.romannumerals;

public class RomanNumber {
    private String number;

    public RomanNumber(String numberSymbols) {
        this.number = numberSymbols;
    }

    @Override
    public String toString() {
        return number;
    }

}
