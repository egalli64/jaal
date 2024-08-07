/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class MergesortTest {
    @Test
    void plainWhenPlain() {
        int[] data = { 107, 101, 100, 102, 105, 104, 103, 106 };
        int[] expected = { 100, 101, 102, 103, 104, 105, 106, 107 };

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenOrdered() {
        int[] data = { 100, 101, 102, 103, 104, 105, 106, 107 };
        int[] expected = { 100, 101, 102, 103, 104, 105, 106, 107 };

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenEmpty() {
        int[] data = {};
        int[] expected = {};

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Mergesort.plain(null));
    }
}
