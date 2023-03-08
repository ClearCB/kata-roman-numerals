package edu.craptocraft.romannumerals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumberTest {
    public static RomanNumber roman;
    public static RomanNumber romanOne;
    public static RomanNumber romanTwelve;

    @BeforeClass
    public static void createRoman() {

        roman = new RomanNumber("MMMDCCCLXXXVIII");
        romanOne = new RomanNumber("I");
        romanTwelve = new RomanNumber("XII");
    }

    @Test
    public void constructoTest() {

        assertNotNull(roman);
        assertNotNull(romanOne);
        assertNotNull(romanTwelve);
    }

    @Test
    public void toStringTest() {

        assertEquals("MMMDCCCLXXXVIII", roman.toString());
        assertEquals("I", romanOne.toString());
        assertEquals("XII", romanTwelve.toString());
    }

    @Test
    public void computeValueEnumTest() {

        // These checks the values of EnumTypes
        assertEquals(1, roman.computeValue("I"));
        assertEquals(5, roman.computeValue("V"));
        assertEquals(10, roman.computeValue("X"));
        assertEquals(50, roman.computeValue("L"));
        assertEquals(100, roman.computeValue("C"));
        assertEquals(500, roman.computeValue("D"));
        assertEquals(1000, roman.computeValue("M"));
        assertEquals(4, roman.computeValue("IV"));
        assertEquals(9, roman.computeValue("IX"));
        assertEquals(40, roman.computeValue("XL"));
        assertEquals(90, roman.computeValue("XC"));
        assertEquals(400, roman.computeValue("CD"));
        assertEquals(900, roman.computeValue("CM"));

        // Other expresions with mixed valid values

    }

    public RomanNumber romanTwo;

    @Test
    public void regexExpresionFindTest() {

        romanTwo = new RomanNumber("II");
        RomanNumber romanEleven = new RomanNumber("XI");
        RomanNumber romanTwoT = new RomanNumber("MM");
        RomanNumber newR = new RomanNumber("CD");

        assertEquals(2, this.romanTwo.toDecimal());
        assertEquals(11, romanEleven.toDecimal());
        assertEquals(2000, romanTwoT.toDecimal());
        assertEquals(400, newR.toDecimal());
    }

}