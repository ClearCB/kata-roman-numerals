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
    public void regexExpresionTest() {

        assertEquals("I(?=[VX])|X(?=[LC])|C(?=[DM])|[IVXLCDM]", roman.regexExpresion().get(0));
    }

    @Test
    public void addRegexTest() {

        assertEquals(1, roman.regexExpresion().size());
        roman.addRegex("hgagha");

        assertEquals(2, roman.regexExpresion().size());
    }
}
