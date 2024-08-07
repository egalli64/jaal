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
    void iterativeWhenPlain() {
        int[] left = { 1, 3 };
        int[] right = { 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativeWhenPlainSameSize() {
        int[] left = { 1, 3, 5 };
        int[] right = { 2, 3, 4 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativeWhenOneEmpty() {
        int[] left = { 1, 3, 5 };
        int[] right = {};
        int[] expected = { 1, 3, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void iterativeWhenOneNullThenNPE() {
        int[] left = { 1, 3, 5 };
        assertThatNullPointerException().isThrownBy(() -> Merge.iterative(left, null));
    }

    @Test
    void recursiveWhenPlain() {
        int[] left = { 1, 3 };
        int[] right = { 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursiveWhenPlainSameSize() {
        int[] left = { 1, 3, 5 };
        int[] right = { 2, 3, 4 };
        int[] expected = { 1, 2, 3, 3, 4, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursiveWhenOneEmpty() {
        int[] left = { 1, 3, 5 };
        int[] right = {};
        int[] expected = { 1, 3, 5 };

        assertThat(Merge.iterative(left, right)).isEqualTo(expected);
    }

    @Test
    void recursiveWhenOneNullThenNPE() {
        int[] left = { 1, 3, 5 };
        assertThatNullPointerException().isThrownBy(() -> Merge.iterative(left, null));
    }
}
