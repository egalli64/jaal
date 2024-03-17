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
    private final int[] data = { 42, 12, 0, -21, 99, 5, 1, 0 };

    @Test
    void countEvenPlain() {
        assertThat(Counter.countEven(data)).isEqualTo(4);
    }

    @Test
    void countEvenEmpty() {
        assertThat(Counter.countEven(new int[] {})).isEqualTo(0);
    }

    @Test
    void countEvenNull() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countEven(null));
    }

    @Test
    void countPositivePlain() {
        assertThat(Counter.countPositive(data)).isEqualTo(5);
    }

    @Test
    void countPositiveEmpty() {
        assertThat(Counter.countPositive(new int[] {})).isEqualTo(0);
    }

    @Test
    void countPositiveNull() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countPositive(null));
    }

    @Test
    void countEqualToZero() {
        assertThat(Counter.countEqualTo(data, 0)).isEqualTo(2);
    }

    @Test
    void countEqualToEmpty() {
        assertThat(Counter.countEqualTo(new int[] {}, 42)).isEqualTo(0);
    }

    @Test
    void countEqualToNull() {
        assertThatNullPointerException().isThrownBy(() -> Counter.countEqualTo(null, 42));
    }
}
