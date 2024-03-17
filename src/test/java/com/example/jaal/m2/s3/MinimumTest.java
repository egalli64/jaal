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

    @Test
    void minPlain() {
        assertThat(Minimum.min(data)).isEqualTo(1);
    }

    @Test
    void minEmpty() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class) //
                .isThrownBy(() -> Minimum.min(new int[] {}));
    }

    @Test
    void minNull() {
        assertThatNullPointerException().isThrownBy(() -> Minimum.min(null));
    }

    @Test
    void getMinPosPlain() {
        assertThat(Minimum.getMinPos(data)).isEqualTo(2);
    }

    @Test
    void getMinPosEmpty() {
        assertThatIllegalArgumentException().isThrownBy(() -> Minimum.getMinPos(new int[] {}));
    }

    @Test
    void getMinPosNull() {
        assertThatNullPointerException().isThrownBy(() -> Minimum.getMinPos(null));
    }
}
