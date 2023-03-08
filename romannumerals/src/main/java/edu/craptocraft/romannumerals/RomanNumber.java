package edu.craptocraft.romannumerals;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String number;
    private RegexRomanRulesNumber regexRules;
    private int decimalNumber;

    public RomanNumber(String numberSymbols) {
        this.number = numberSymbols;
        this.regexRules = new RegexRomanRulesNumber();
        this.findMatchs();
    }

    public String getNumber() {
        return this.number;
    }

    public int toDecimal() {
        return this.decimalNumber;
    }

    public void setDecimalNumber(int number) {
        this.decimalNumber = number;
    }

    protected List<String> getRegexRules() {
        return this.regexRules.regexExpresion();
    }

    public int computeValue(String str) {

        return Symbols.valueOf(str).getValue();

    }

    public void findMatchs() {

        int total = 0;

        for (String pattern : this.getRegexRules()) {
            // Compile the pattern
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(this.getNumber());

            while (m.find()) {

                total += this.computeValue(m.group());

            }

            this.setDecimalNumber(total);

        }

    }

    @Override
    public String toString() {
        return this.number;
    }

}
