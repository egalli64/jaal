/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class InsertionSortTest {
    @Test
    void plainWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenEmpty() {
        int[] data = {};
        int[] expected = {};

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> InsertionSort.plain(null));
    }

    @Test
    void lessCopiesWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.lessCopies(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void lessCopiesWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.lessCopies(data);
        assertThat(data).isEqualTo(expected);
    }
}
