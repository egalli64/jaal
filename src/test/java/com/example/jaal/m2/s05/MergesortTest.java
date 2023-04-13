/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s05;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class MergesortTest {
    @Test
    void plainPlain() {
        int[] data = { 107, 101, 100, 102, 105, 104, 103, 106 };
        int[] expected = { 100, 101, 102, 103, 104, 105, 106, 107 };

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainOrdered() {
        int[] data = { 100, 101, 102, 103, 104, 105, 106, 107 };
        int[] expected = { 100, 101, 102, 103, 104, 105, 106, 107 };

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainEmpty() {
        int[] data = {};
        int[] expected = {};

        Mergesort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainNull() {
        assertThatNullPointerException().isThrownBy(() -> Mergesort.plain(null));
    }
}
