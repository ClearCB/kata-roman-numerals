package edu.craptocraft.romannumerals;

import java.util.ArrayList;
import java.util.List;

public class RegexRomanRulesNumber {
    private List<String> regexExpresion;


    RegexRomanRulesNumber(){
        this.regexExpresion = new ArrayList<String>();
        this.addRegex("I[VX]|X[LC]|C[DM]|[IVXLCDM]");
        // It is important that this regex expresion does not get all the posibles combinations. Here there is something more complex
        // but was not though by myself.
    }

    protected List<String> regexExpresion(){
        return this.regexExpresion;
    }
    
    protected void addRegex(String regex){
        this.regexExpresion().add(regex);
    } 
    
}
