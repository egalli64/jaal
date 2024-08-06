/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReferencesImmutableTest {
    /**
     * Successfully demonstrate that buggySwap() is buggy
     * <p>
     * This is not a kind of test you will see often
     */
    @Test
    void buggySwapWhenCalledThenWontSwap() {
        String s = "Sam";
        String t = "Tom";

        ReferencesImmutable.buggySwap(s, t);
        assertThat(s).isEqualTo("Sam");
        assertThat(t).isEqualTo("Tom");
    }
}
