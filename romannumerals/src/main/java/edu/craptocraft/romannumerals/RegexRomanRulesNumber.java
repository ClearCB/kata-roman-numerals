package edu.craptocraft.romannumerals;

import java.util.ArrayList;
import java.util.List;

public class RegexRomanRulesNumber {
    private List<String> regexExpresion;


    RegexRomanRulesNumber(){
        this.regexExpresion = new ArrayList<String>();
        this.addRegex("I{4,}|X{4,}|C{4,}|M{4,}");
        this.addRegex("I[VX]|X[LC]|C[DM]|[IVXLCDM]");

    }

    protected List<String> regexExpresion(){
        return this.regexExpresion;
    }
    
    protected void addRegex(String regex){
        this.regexExpresion().add(regex);
    } 
    
}
