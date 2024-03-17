/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseCopyTest {
    @Test
    void reverseNull() {
        int[] reversed = ReverseCopy.reverse(null);
        assertThat(reversed).isNull();
    }

    @Test
    void reverseEmpty() {
        int[] input = {};
        int[] reversed = ReverseCopy.reverse(input);
        assertThat(reversed).isEmpty();
    }

    @Test
    void reverseSingle() {
        int[] input = { 42 };
        int[] reversed = ReverseCopy.reverse(input);
        assertThat(reversed).contains(input);
    }

    @Test
    void reverseEvenSize() {
        int[] input = { 42, 12, 43, 65 };
        int[] expected = { 65, 43, 12, 42 };

        int[] reversed = ReverseCopy.reverse(input);
        assertThat(reversed).isEqualTo(expected);
    }

    @Test
    void reverseOddSize() {
        int[] input = { 42, 12, 43, 65, 81 };
        int[] expected = { 81, 65, 43, 12, 42 };

        int[] reversed = ReverseCopy.reverse(input);
        assertThat(reversed).isEqualTo(expected);
    }
}
