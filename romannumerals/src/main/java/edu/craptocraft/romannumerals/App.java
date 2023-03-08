package edu.craptocraft.romannumerals;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List.of(
                "MMMDCCCLXXXVIII", // 3888
                "MMDCCLXXVII", // 2777
                "CDXLIV", // 444
                "CDXXXIX" // 439
        ).stream()
                .map(RomanNumber::new)
                .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));

    }
}
