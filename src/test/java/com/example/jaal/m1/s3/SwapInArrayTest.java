/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class SwapInArrayTest {
    private int[] data = { 2, -9, 1, 3, 88, 5 };

    @Test
    void swapPlain() {
        int i = 1;
        int j = 4;
        int expectedValueI = data[j];
        int expectedValueJ = data[i];

        SwapInArray.swap(data, i, j);
        assertThat(data[i]).isEqualTo(expectedValueI);
        assertThat(data[j]).isEqualTo(expectedValueJ);
    }

    @Test
    void swapSame() {
        int i = 1;
        int expected = data[i];

        SwapInArray.swap(data, i, i);
        assertThat(data[i]).isEqualTo(expected);
    }

    @Test
    void swapNull() {
        assertThatNullPointerException().isThrownBy(() -> SwapInArray.swap(null, 0, 0));
    }

    @Test
    void swapOutOfBounds() {
        assertThatIndexOutOfBoundsException().isThrownBy(() -> SwapInArray.swap(data, 0, 42));
    }
}
