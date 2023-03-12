package edu.craptocraft.romannumerals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String number;
    private RegexRomanRulesNumber regexRules;
    private int decimalNumber = 0;

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

    protected RegexRomanRulesNumber getRegexRules() {
        return this.regexRules;
    }

    public int computeValue(String str) {

        return Symbols.valueOf(str).getValue();

    }

    public boolean isValid() {

        for (String pattern : this.getRegexRules().invalidRegexExpresion()) {

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(this.getNumber());

            if (m.find()) {
                return false;
            }
        }

        return true;
    }

    public void findMatchs() {

        int total = 0;

        if (this.isValid()) {

            for (String pattern : this.getRegexRules().validRegexExpresion()) {
                // Compile the pattern
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(this.getNumber());

                while (m.find()) {

                    total += this.computeValue(m.group());

                }

                this.setDecimalNumber(total);

            }
        }

    }

    @Override
    public String toString() {
        return this.number;
    }

}
