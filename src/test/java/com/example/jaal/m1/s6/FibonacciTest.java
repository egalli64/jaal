/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void recursivePlain(int input, long expected) {
        assertThat(Fibonacci.recursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void recursiveNegative() {
        assertThat(Fibonacci.recursive(-1024)).isNegative();
    }

    /**
     * Probably unacceptable performance for "large" input
     */
    @Test
    void recursiveLarge() {
        assertThat(Fibonacci.recursive(42)).isEqualTo(267914296L);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void tailRecursivePlain(int input, long expected) {
        assertThat(Fibonacci.tailRecursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void tailRecursiveNegative() {
        assertThat(Fibonacci.tailRecursive(-1024)).isNegative();
    }

    @Test
    void tailRecursiveLarge() {
        assertThat(Fibonacci.tailRecursive(42)).isEqualTo(267914296L);
    }

    @Test
    void tailRecursiveLarger() {
        assertThat(Fibonacci.tailRecursive(92)).isEqualTo(7540113804746346429L);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void iterativePlain(int input, long expected) {
        assertThat(Fibonacci.iterative(input)).isEqualTo(expected);
    }

    @Test
    void iterativeLarge() {
        assertThat(Fibonacci.iterative(92)).isEqualTo(7540113804746346429L);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void iterativeNegative() {
        assertThat(Fibonacci.iterative(-1024)).isNegative();
    }

    /**
     * TODO: discuss with the user the expected behavior for "large" input
     */
    @Test
    void iterativeOverflow() {
        assertThat(Fibonacci.iterative(93)).isNegative();
    }
}
