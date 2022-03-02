package com.grycuk.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}