/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class CounterTest {
    private static final int[] data = { 42, 12, 0, -21, 99, 5, 1, 0 };
    private static final int NR_EVEN = 4;
    private static final int NR_POSITIVE = 5;
    private static final int NR_ZERO = 2;

    @Test
    void countEvenWhenNonEmpty() {
        assertThat(Counter.countEven(data)).isEqualTo(NR_EVEN);
    }

    @Test
    void countEvenWhenEmpty() {
        assertThat(Counter.countEven(new int[] {})).isEqualTo(0);
    }

    @Test
    void countEvenWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countEven(null));
    }

    @Test
    void countPositiveWhenNonEmpty() {
        assertThat(Counter.countPositive(data)).isEqualTo(NR_POSITIVE);
    }

    @Test
    void countPositiveWhenEmptyThenZero() {
        assertThat(Counter.countPositive(new int[] {})).isEqualTo(0);
    }

    @Test
    void countPositiveWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countPositive(null));
    }

    @Test
    void countEqualToGivenZeroWhenNonEmpty() {
        assertThat(Counter.countEqualTo(data, 0)).isEqualTo(NR_ZERO);
    }

    @Test
    void countEqualToGivenZeroWhenEmptyThenZero() {
        assertThat(Counter.countEqualTo(new int[] {}, 0)).isEqualTo(0);
    }

    @Test
    void countEqualToWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countEqualTo(null, 42));
    }
}
