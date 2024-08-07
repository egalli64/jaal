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

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void recursiveWhenPlain(int input, long expected) {
        assertThat(Fibonacci.recursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void recursiveWhenNegative() {
        assertThat(Fibonacci.recursive(-1024)).isNegative();
    }

    /**
     * Probably unacceptable performance for "large" input
     */
    @Test
    void recursiveWhenLargeThenSlow() {
        assertThat(Fibonacci.recursive(42)).isEqualTo(267914296L);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void tailRecursiveWhenPlain(int input, long expected) {
        assertThat(Fibonacci.tailRecursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void tailRecursiveWhenNegative() {
        assertThat(Fibonacci.tailRecursive(-1024)).isNegative();
    }

    @Test
    void tailRecursiveWhenLarge() {
        assertThat(Fibonacci.tailRecursive(42)).isEqualTo(267914296L);
    }

    @Test
    void tailRecursiveWhenLarger() {
        assertThat(Fibonacci.tailRecursive(92)).isEqualTo(7540113804746346429L);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void iterativeWhenPlain(int input, long expected) {
        assertThat(Fibonacci.iterative(input)).isEqualTo(expected);
    }

    @Test
    void iterativeWhenLarge() {
        assertThat(Fibonacci.iterative(92)).isEqualTo(7540113804746346429L);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void iterativeWhenNegative() {
        assertThat(Fibonacci.iterative(-1024)).isNegative();
    }

    /**
     * TODO: discuss with the user the expected behavior for "large" input
     */
    @Test
    void iterativeWhenTooLargeThenOverflow() {
        assertThat(Fibonacci.iterative(93)).isNegative();
    }
}
