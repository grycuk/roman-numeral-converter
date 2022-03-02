package com.grycuk.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RomanNumeralConverterTest {

    private RomanNumeralConverter romanNumeralConverter;

    @BeforeEach
    void setUp() {
        romanNumeralConverter = new RomanNumeralConverter();
    }

    @Test
    void shouldConvert1ToI() {
        assertThat(romanNumeralConverter.convert(1)).isEqualTo("I");
    }

    @Test
    void shouldConvert2ToII() {
        assertThat(romanNumeralConverter.convert(2)).isEqualTo("II");
    }

    @Test
    void shouldConvert3ToIII() {
        assertThat(romanNumeralConverter.convert(3)).isEqualTo("III");
    }

    @Test
    void shouldConvert4ToIV() {
        assertThat(romanNumeralConverter.convert(4)).isEqualTo("IV");
    }

    @Test
    void shouldConvert5ToV() {
        assertThat(romanNumeralConverter.convert(5)).isEqualTo("V");
    }

    @Test
    void shouldConvert6ToVI() {
        assertThat(romanNumeralConverter.convert(6)).isEqualTo("VI");
    }

    @Test
    void shouldConvert9ToIX() {
        assertThat(romanNumeralConverter.convert(9)).isEqualTo("IX");
    }

    @Test
    void shouldConvert40ToXL() {
        assertThat(romanNumeralConverter.convert(40)).isEqualTo("XL");
    }

    @Test
    void shouldConvert10ToX() {
        assertThat(romanNumeralConverter.convert(10)).isEqualTo("X");
    }

    @Test
    void shouldConvert90ToXC() {
        assertThat(romanNumeralConverter.convert(90)).isEqualTo("XC");
    }

    @Test
    void shouldConvert50ToL() {
        assertThat(romanNumeralConverter.convert(50)).isEqualTo("L");
    }

    @Test
    void shouldConvert100ToC() {
        assertThat(romanNumeralConverter.convert(100)).isEqualTo("C");
    }

    @Test
    void shouldConvert400ToCD() {
        assertThat(romanNumeralConverter.convert(400)).isEqualTo("CD");
    }

    @Test
    void shouldConvert500ToD() {
        assertThat(romanNumeralConverter.convert(500)).isEqualTo("D");
    }

    @Test
    void shouldConvert1000ToM() {
        assertThat(romanNumeralConverter.convert(1000)).isEqualTo("M");
    }

    @Test
    void shouldConvert3000ToMMM() {
        assertThat(romanNumeralConverter.convert(3000)).isEqualTo("MMM");
    }

    @Test
    void shouldThrowErrorIfInputIsGreaterThan3000() {
        assertThatThrownBy(() -> romanNumeralConverter.convert(3001))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowErrorIfInputIsLessThan1() {
        assertThatThrownBy(() -> romanNumeralConverter.convert(0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}