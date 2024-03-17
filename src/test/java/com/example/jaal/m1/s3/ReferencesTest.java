package com.example.jaal.m1.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class ReferencesTest {
    /**
     * Successfully demonstrate that buggySwap() is buggy
     * <p>
     * This is not a kind of test you will see often
     */
    @Test
    void buggySwapPlain() {
        String s = "Sam";
        String t = "Tom";

        References.buggySwap(s, t);
        assertThat(s).isEqualTo("Sam");
        assertThat(t).isEqualTo("Tom");
    }

    @Test
    void swapPlain() {
        StringBuilder s = new StringBuilder("Sam");
        StringBuilder t = new StringBuilder("Tom");

        String expectedS = t.toString();
        String expectedT = s.toString();

        References.swap(s, t);

        assertThat(s.toString()).isEqualTo(expectedS);
        assertThat(t.toString()).isEqualTo(expectedT);
    }

    @Test
    void swapNull() {
        StringBuilder s = null;
        StringBuilder t = new StringBuilder("Tom");

        assertThatNullPointerException().isThrownBy(() -> References.swap(s, t));
    }
}
