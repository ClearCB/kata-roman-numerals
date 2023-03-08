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

        assertEquals(1, roman.regexExpresion().size());
        roman.addRegex("hgagha");

        assertEquals(2, roman.regexExpresion().size());
    }
}
