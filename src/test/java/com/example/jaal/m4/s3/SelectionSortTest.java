/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class SelectionSortTest {
    @Test
    void plainWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        SelectionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        SelectionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenEmpty() {
        int[] data = {};
        int[] expected = {};

        SelectionSort.plain(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void plainWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> SelectionSort.plain(null));
    }

    @Test
    void lessWriteWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        SelectionSort.lessWrite(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void lessWriteWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        SelectionSort.lessWrite(data);
        assertThat(data).isEqualTo(expected);
    }
}
