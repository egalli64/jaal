/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void basePlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseEmpty() {
        int[] data = {};
        int[] expected = {};

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseNull() {
        assertThatNullPointerException().isThrownBy(() -> BubbleSort.base(null));
    }

    @Test
    void improvedPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.improved(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void improvedOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.improved(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapHalf() {
        int[] data = { 3, 1, 0, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void swapCutPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void swapCutOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }
    
    @Test
    void swapCutHalf() {
        int[] data = { 3, 1, 0, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }
}
