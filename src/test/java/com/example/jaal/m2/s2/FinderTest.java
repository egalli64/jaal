/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FinderTest {
    private final int[] data = { 42, -12, 1, 21, 0, 99, 21, 5 };

    @ParameterizedTest
    @CsvSource({ "42,0", "21,3", "-12,1" })
    void indexOfWhenPresentThenPosition(int value, int expected) {
        assertThat(Finder.indexOf(data, value)).isEqualTo(expected);
    }

    @Test
    void indexOfWhenMissingThenMinusOne() {
        int value = 1024;
        assertThat(Finder.indexOf(data, value)).isEqualTo(-1);
    }

    @Test
    void indexOfOnWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Finder.indexOf(null, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = { 42, 21, -12, 0, 5 })
    void containsWhenPresentThenTrue(int value) {
        assertThat(Finder.contains(data, value)).isTrue();
    }

    @Test
    void containsWhenMissingThenFalse() {
        int value = 1024;
        assertThat(Finder.contains(data, value)).isFalse();
    }

    @Test
    void containsWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Finder.contains(null, 0));
    }

    @ParameterizedTest
    @CsvSource({ "42,0", "21,6", "-12,1" })
    void lastIndexOfWhenPresentThenPosition(int value, int expected) {
        assertThat(Finder.lastIndexOf(data, value)).isEqualTo(expected);
    }

    @Test
    void lastIndexOfWhenMissingThenMinusOne() {
        int value = 1024;
        assertThat(Finder.lastIndexOf(data, value)).isEqualTo(-1);
    }

    @Test
    void lastIndexOfOnNull() {
        assertThatNullPointerException().isThrownBy(() -> Finder.lastIndexOf(null, 0));
    }
}
