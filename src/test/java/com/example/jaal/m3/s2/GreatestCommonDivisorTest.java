/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GreatestCommonDivisorTest {
    @ParameterizedTest
    @CsvSource({ "1, 1, 1", "42, 56, 14", "461952, 116298, 18", "7966496, 314080416, 32" })
    void recursiveWhenPlain(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.recursive(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "42, 0, 42", "0, 21, 21", "0, 0, 0" })
    void recursiveWhenZeroThenZero(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.recursive(a, b)).isEqualTo(expected);
    }

    /**
     * The current implementation is clearly unacceptable
     * <p>
     * TODO: Need to clarify with user the expected behavior
     * 
     * @param a        could be negative?
     * @param b        could be negative?
     * @param expected positive or negative accordingly to the number of
     *                 iterations??
     */
    @ParameterizedTest
    @CsvSource({ "1, -1, -1", "-42, 56, 14", "461952, -116298, -18", "-7966496, 314080416, 32" })
    void recursiveWhenNegativeThenUnreliable(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.recursive(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 1, 1", "42, 56, 14", "461952, 116298, 18", "7966496, 314080416, 32" })
    void iterativeWhenPlain(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.iterative(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "42, 0, 42", "0, 21, 21", "0, 0, 0" })
    void iterativeWhenZeroThenZero(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.iterative(a, b)).isEqualTo(expected);
    }

    /**
     * The current implementation is clearly unacceptable
     * <p>
     * TODO: Need to clarify with user the expected behavior
     * 
     * @param a        could be negative?
     * @param b        could be negative?
     * @param expected positive or negative accordingly to the number of
     *                 iterations??
     */
    @ParameterizedTest
    @CsvSource({ "1, -1, -1", "-42, 56, 14", "461952, -116298, -18", "-7966496, 314080416, 32" })
    void iterativeWhenNegativeThenUnreliable(int a, int b, int expected) {
        assertThat(GreatestCommonDivisor.iterative(a, b)).isEqualTo(expected);
    }
}
