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
    void plainPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainEmpty() {
        int[] data = {};
        int[] expected = {};

        InsertionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainNull() {
        assertThatNullPointerException().isThrownBy(() -> InsertionSort.plain(null));
    }

    @Test
    void lessCopiesPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.lessCopies(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void lessCopiesOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        InsertionSort.lessCopies(data);
        assertThat(data).isEqualTo(expected);
    }
}
