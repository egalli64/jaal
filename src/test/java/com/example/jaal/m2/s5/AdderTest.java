/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AdderTest {
    @Test
    void sumWhenSimpleInput() {
        int[] data = { 1, 2, 3, -12, 3, 2, 1 };
        assertThat(Adder.sum(data)).isZero();
    }

    @Test
    void sumWhenEmptyThenZero() {
        assertThat(Adder.sum(new int[] {})).isEqualTo(0);
    }

    @Test
    void sumWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Adder.sum(null));
    }

    /**
     * It is not meant to work!
     * 
     * TODO: write more robust versions of sum()
     */
    @Test
    @Disabled
    void sumWhenBigResultThenOverflow() {
        int[] data = { 2_000_000_000, 2_000_000_000 };
        assertThat(Adder.sum(data)).isEqualTo(4_000_000_000L);
    }
}
