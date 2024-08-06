/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class MinimumTest {
    private final int[] data = { 42, 21, 1, 20, 99, 21, 1, 5 };
    private final int MIN_VALUE = 1;
    private final int MIN_FIRST_POS = 2;

    @Test
    void minWhenNonEmpty() {
        assertThat(Minimum.min(data)).isEqualTo(MIN_VALUE);
    }

    @Test
    void minWhenEmptyThenException() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class) //
                .isThrownBy(() -> Minimum.min(new int[] {}));
    }

    @Test
    void minWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Minimum.min(null));
    }

    @Test
    void getMinPosWhenNonEmpty() {
        assertThat(Minimum.getMinPos(data)).isEqualTo(MIN_FIRST_POS);
    }

    @Test
    void getMinPosWhenEmptyThenException() {
        assertThatIllegalArgumentException().isThrownBy(() -> Minimum.getMinPos(new int[] {}));
    }

    @Test
    void getMinPosWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Minimum.getMinPos(null));
    }
}
