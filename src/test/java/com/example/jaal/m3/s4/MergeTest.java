/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class MergeTest {
    @Test
    void iterativePlain() {
        int[] left = { 1, 3 };
        int[] right = { 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativePlainSameSize() {
        int[] left = { 1, 3, 5 };
        int[] right = { 2, 3, 4 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativeEmpty() {
        int[] left = { 1, 3, 5 };
        int[] right = {};
        int[] expected = { 1, 3, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativeNull() {
        int[] left = { 1, 3, 5 };
        assertThatNullPointerException().isThrownBy(() -> Merge.iterative(left, null));
    }

    @Test
    void recursivePlain() {
        int[] left = { 1, 3 };
        int[] right = { 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursivePlainSameSize() {
        int[] left = { 1, 3, 5 };
        int[] right = { 2, 3, 4 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursiveEmpty() {
        int[] left = { 1, 3, 5 };
        int[] right = {};
        int[] expected = { 1, 3, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursiveNull() {
        int[] left = { 1, 3, 5 };
        assertThatNullPointerException().isThrownBy(() -> Merge.iterative(left, null));
    }
}
