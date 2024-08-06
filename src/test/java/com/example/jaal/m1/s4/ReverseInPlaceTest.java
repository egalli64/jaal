/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseInPlaceTest {
    @Test
    void reverseWhenNull() {
        int[] input = null;
        ReverseInPlace.reverse(input);
        assertThat(input).isNull();
    }

    @Test
    void reverseWhenEmpty() {
        int[] input = {};
        ReverseInPlace.reverse(input);
        assertThat(input).isEmpty();
    }

    @Test
    void reverseWhenSingle() {
        int[] input = { 42 };
        ReverseInPlace.reverse(input);
        assertThat(input).contains(42);
    }

    @Test
    void reverseWhenEvenSize() {
        int[] input = { 42, 12, 43, 65 };
        int[] expected = { 65, 43, 12, 42 };

        ReverseInPlace.reverse(input);
        assertThat(input).isEqualTo(expected);
    }

    @Test
    void reverseWhenOddSize() {
        int[] input = { 42, 12, 43, 65, 81 };
        int[] expected = { 81, 65, 43, 12, 42 };

        ReverseInPlace.reverse(input);
        assertThat(input).isEqualTo(expected);
    }
}
