package com.example.jaal.m0.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class TrickyTest {
    @Test
    void swapPlain() {
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
     * Success means that buggySwap() is buggy
     * <p>
     * This is not a kind of test you will often see
     */
    @Test
    void swapSame() {
        int[] data = { 2, -9, 1, 3, 88, 5 };
        int i = 1;
        int expectedValueI = data[i];

        Tricky.buggySwap(data, i, i);
        assertThat(data[i]).isNotEqualTo(expectedValueI);
    }

    @Test
    void swapNull() {
        assertThatNullPointerException().isThrownBy(() -> Tricky.buggySwap(null, 0, 0));
    }

    @Test
    void swapOutOfBounds() {
        int[] data = { 2, -9, 1, 3, 88, 5 };
        assertThatIndexOutOfBoundsException().isThrownBy(() -> Tricky.buggySwap(data, 0, 42));
    }
}
