package edu.craptocraft.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumberTest {

    // Enum correct behaviour
    @Test
    public void symbolsTest() {

        assertEquals(1,Symbols.I.getValue());
        assertEquals(5,Symbols.V.getValue());
        assertEquals(10,Symbols.X.getValue());
        assertEquals(50,Symbols.L.getValue());
        assertEquals(100,Symbols.C.getValue());
        assertEquals(500,Symbols.D.getValue());
        assertEquals(1000,Symbols.M.getValue());

        assertEquals("I", Symbols.I.name());
    }

    @Test
    public void toStringTest(){


    }


    @Test
    public void symbolsCountTest() {
        // I no more three

        // V just one

        // X

        // L

        // C

        // D

        // M
    }

    @Test
    public void symbolsCombinationTest() {

    }

    @Test
    public void sumValuesTest() {

    }

    @Test
    public void threeSymbolsTest() {

        // M, C, X, I YES

        // D, L, V NO
    }

    @Test
    public void minusSymbolsTest() {

        // IV / IX

        // I left just 1 bigger at right

        // XL / XC

        // CD / CM

        // NO MINUS D,L V

        // REPEAT SYMBOLS THAT ARE NOT COHERENCE
    }

    @Test
    public void test() {

        // 39 = XXXIX
        //  246 = CCXLVI
        //  789 = DCCLXXXIX
        // 2,421 = MMCDXXI

        //  160 = CLX
        //  207 = CCVII
        // 1,009 = MIX
        // 1,066 = MLXVI

        // 1776 = MDCCLXXVI
        // 1918 =MCMXVIII
        // 1944 = MCMXLIV
        // 2023 = MMXXIII
    }

}