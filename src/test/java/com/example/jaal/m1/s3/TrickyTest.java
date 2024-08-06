/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TrickyTest {
    @Test
    void buggySwapWhenPlainThenSwap() {
        int[] data = { 2, -9, 1, 3, 88, 5 };
        int i = 1;
        int j = 4;
        int expectedValueI = data[j];
        int expectedValueJ = data[i];

        Tricky.buggySwap(data, i, j);
        assertThat(data[i]).isEqualTo(expectedValueI);
        assertThat(data[j]).isEqualTo(expectedValueJ);
    }

    /**
     * This test fails, as expected
     */
    @Test
    @Disabled
    void buggySwapWhenSamePositionThenFail() {
        int[] data = { 2, -9, 1, 3, 88, 5 };
        int i = 1;
        int expectedValueI = data[i];

        Tricky.buggySwap(data, i, i);
        assertThat(data[i]).isEqualTo(expectedValueI);
    }

    @Test
    void buggySwapWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Tricky.buggySwap(null, 0, 0));
    }

    @Test
    void buggySwapWhenBadIndicesThenException() {
        int[] data = { 2, -9, 1, 3, 88, 5 };
        assertThatIndexOutOfBoundsException().isThrownBy(() -> Tricky.buggySwap(data, 0, 42));
    }
}
