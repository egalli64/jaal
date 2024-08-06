/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class ReferencesMutableTest {
    @Test
    void swapWhenCalledThenSwap() {
        StringBuilder s = new StringBuilder("Sam");
        StringBuilder t = new StringBuilder("Tom");

        String expectedS = t.toString();
        String expectedT = s.toString();

        ReferencesMutable.swap(s, t);

        assertThat(s.toString()).isEqualTo(expectedS);
        assertThat(t.toString()).isEqualTo(expectedT);
    }

    @Test
    void swapWhenCalledWithNullThenNPE() {
        StringBuilder s = null;
        StringBuilder t = new StringBuilder("Tom");

        assertThatNullPointerException().isThrownBy(() -> ReferencesMutable.swap(s, t));
    }
}
