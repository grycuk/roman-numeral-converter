package com.grycuk.roman;

import java.util.stream.IntStream;

public class RomanNumeralConverter {

    public String convert(int i) {
        StringBuilder sb = new StringBuilder();
        if (i == 4) {
            sb.append("IV");
            i = -4;
        }

        IntStream.range(0, i).forEach(num -> sb.append("I"));
        return sb.toString();
    }
}
