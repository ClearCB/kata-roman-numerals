package edu.craptocraft.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class RegexRomanRulesTest {
    public static RegexRomanRulesNumber roman;

    @BeforeClass
    public static void createRoman() {

        roman = new RegexRomanRulesNumber();
    }
    
    @Test
    public void addRegexTest() {

        assertEquals(2, roman.invalidRegexExpresion().size());
        assertEquals(1, roman.validRegexExpresion().size());
        roman.addInvalidRegex("hgagha");
        roman.addValidRegex("hgagha");

        assertEquals(3, roman.invalidRegexExpresion().size());
        assertEquals(2, roman.validRegexExpresion().size());    }
}
