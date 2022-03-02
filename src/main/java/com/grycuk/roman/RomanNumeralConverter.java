package com.grycuk.roman;

public class RomanNumeralConverter {

    enum NumToRoman {
        ONE_THOUSAND(1000, "M"),
        FIVE_HUNDRED(500, "D"),
        FOUR_HUNDRED(400, "CD"),
        ONE_HUNDRED(100, "C"),
        NINETY(90, "XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int num;
        private final String roman;

        NumToRoman(int num, String roman) {
            this.num = num;
            this.roman = roman;
        }
    }

    public String convert(int number) {
        if (number > 3000) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        for (NumToRoman numToRomanNumeral : NumToRoman.values()) {
            while (number >= numToRomanNumeral.num) {
                sb.append(numToRomanNumeral.roman);
                number -= numToRomanNumeral.num;
            }
        }
        return sb.toString();
    }
}
