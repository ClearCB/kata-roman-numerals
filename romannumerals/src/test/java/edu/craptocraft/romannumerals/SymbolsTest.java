package edu.craptocraft.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SymbolsTest {

    // Enum correct behaviour
    @Test
    public void Symbols() {

        assertEquals(1, Symbols.I.getValue());
        assertEquals(5, Symbols.V.getValue());
        assertEquals(10, Symbols.X.getValue());
        assertEquals(50, Symbols.L.getValue());
        assertEquals(100, Symbols.C.getValue());
        assertEquals(500, Symbols.D.getValue());
        assertEquals(1000, Symbols.M.getValue());
        assertEquals(4, Symbols.IV.getValue());
        assertEquals(9, Symbols.IX.getValue());
        assertEquals(40, Symbols.XL.getValue());
        assertEquals(90, Symbols.XC.getValue());
        assertEquals(400, Symbols.CD.getValue());
        assertEquals(900, Symbols.CM.getValue());

        assertEquals("I", Symbols.I.name());
    }

}
