/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class AdderTest {
    @Test
    void sumPlain() {
        int[] data = { 1, 2, 3, -12, 3, 2, 1 };
        assertThat(Adder.sum(data)).isZero();
    }

    @Test
    void sumEmpty() {
        assertThat(Adder.sum(new int[] {})).isEqualTo(0);
    }

    @Test
    void sumNull() {
        assertThatNullPointerException().isThrownBy(() -> Adder.sum(null));
    }

    /**
     * !!! Ensure that in case of overflow sum() returns a wrong value !!!
     * 
     * TODO: write more robust versions of sum()
     */
    @Test
    void sumOverflow() {
        int[] data = { 2_000_000_000, 2_000_000_000 };
        assertThat(Adder.sum(data)).isLessThan(0);
    }
}
