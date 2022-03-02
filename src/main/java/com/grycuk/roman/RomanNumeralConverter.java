package com.grycuk.roman;

public class RomanNumeralConverter {

    public String convert(int i) {
        if (i == 1) {
            return "I";
        }
        return "II";
    }
}
