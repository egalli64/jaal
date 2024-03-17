/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {
    @ParameterizedTest
    @CsvSource({ "0, 1", "1,1", "10, 3628800", "20, 2432902008176640000" })
    void recursivePlain(int input, long expected) {
        assertThat(Factorial.recursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void recursiveNegative() {
        assertThat(Factorial.recursive(-1024)).isEqualTo(1L);
    }

    /**
     * TODO: discuss with the user the expected behavior for "large" input
     */
    @Test
    void recursiveOverflow() {
        assertThat(Factorial.recursive(21)).isNegative();
    }

    @ParameterizedTest
    @CsvSource({ "0, 1", "1,1", "10, 3628800", "20, 2432902008176640000" })
    void tailRecursivePlain(int input, long expected) {
        assertThat(Factorial.tailRecursive(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "0, 1", "1,1", "10, 3628800", "20, 2432902008176640000" })
    void iterativePlain(int input, long expected) {
        assertThat(Factorial.iterative(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void iterativeNegative() {
        assertThat(Factorial.iterative(-1024)).isEqualTo(1L);
    }

    /**
     * TODO: discuss with the user the expected behavior for "large" input
     */
    @Test
    void iterativeOverflow() {
        assertThat(Factorial.iterative(21)).isNegative();
    }
}
