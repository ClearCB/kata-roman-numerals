package edu.craptocraft.romannumerals;

import java.util.ArrayList;
import java.util.List;

public class RegexRomanRulesNumber {
    private List<String> regexValidExpresion;
    private List<String> regexInvalidExpresion;

    RegexRomanRulesNumber() {
        this.regexValidExpresion = new ArrayList<String>();
        this.regexValidExpresion.add("I[VX]|X[LC]|C[DM]|[IVXLCDM]");

        this.regexInvalidExpresion = new ArrayList<String>();
        this.regexInvalidExpresion.add("I{4,}|X{4,}|C{4,}|M{4,}");
        this.regexInvalidExpresion.add("[a-zA-BE-HJ-KN-UWYZ]");

    }

    protected List<String> invalidRegexExpresion() {
        return this.regexInvalidExpresion;
    }

    protected List<String> validRegexExpresion() {
        return this.regexValidExpresion;
    }

    protected void addValidRegex(String regex) {
        this.validRegexExpresion().add(regex);
    }

    protected void addInvalidRegex(String regex) {
        this.invalidRegexExpresion().add(regex);
    }

}
