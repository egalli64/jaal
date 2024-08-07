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
    void baseWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseWhenEmpty() {
        int[] data = {};
        int[] expected = {};

        BubbleSort.base(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void baseWhenNullTHenNPE() {
        assertThatNullPointerException().isThrownBy(() -> BubbleSort.base(null));
    }

    @Test
    void improvedWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.improved(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void improvedWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.improved(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void checkSwapWhenHalf() {
        int[] data = { 3, 1, 0, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.checkSwap(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void swapCutWhenPlain() {
        int[] data = { 7, 1, 0, 5, 4, 3 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }

    @Test
    void swapCutWhenOrdered() {
        int[] data = { 0, 1, 3, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }
    
    @Test
    void swapCutWhenHalf() {
        int[] data = { 3, 1, 0, 4, 5, 7 };
        int[] expected = { 0, 1, 3, 4, 5, 7 };

        BubbleSort.swapCut(data);
        assertThat(data).isEqualTo(expected);
    }
}
