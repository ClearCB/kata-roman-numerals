package edu.craptocraft.romannumerals;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List.of(
                "I", // 1
                "II", // 2
                "III", // 3
                "IV", // 4
                "V", // 5
                "VI", // 6
                "VII", // 7
                "VIII", // 8
                "IX", // 9
                "XXXII", // 32
                "XLV", // 45
                "MMMDCCCLXXXVIII", // 3888
                "MMDCCLXXVII", // 2777
                "CDXLIV", // 444
                "CDXXXIX" // 439
        ).stream()
                .map(RomanNumber::new)
                .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));

    }
}
