package edu.craptocraft.romannumerals;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String number;
    private RegexRomanRulesNumber regexRules;
    private int decimalNumber;

    public String getNumber() {
        return this.number;
    }

    public int getDecimalNumber() {
        return this.decimalNumber;
    }

    public RomanNumber(String numberSymbols) {
        this.number = numberSymbols;
        this.regexRules = new RegexRomanRulesNumber();
    }

    protected List<String> getRegexRules() {
        return this.regexRules.regexExpresion();
    }

    public int computeValue(String str){

        return Symbols.valueOf(str).getValue();

    }

    private void findMatchs() {

        // for (String pattern : this.getRegexRules()) {
        //     // Compile the pattern
        //     Pattern p = Pattern.compile(pattern);
        //     Matcher m = p.matcher(this.getNumber());

        //     while (m.find()){

        //         this.computeValue(m.group());

        //     }
        // }

    }

    @Override
    public String toString() {
        return this.number;
    }

}
