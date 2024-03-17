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
    @CsvSource({ "21,3", "-12,1", "1024,-1" })
    void indexOf(int value, int expected) {
        assertThat(Finder.indexOf(data, value)).isEqualTo(expected);
    }

    @Test
    void indexOfOnNull() {
        assertThatNullPointerException().isThrownBy(() -> Finder.indexOf(null, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = { 21, -12, 0 })
    void containsFound() {
        int value = 21;
        assertThat(Finder.contains(data, value)).isTrue();
    }

    @Test
    void containsNotFound() {
        int value = 1024;
        assertThat(Finder.contains(data, value)).isFalse();
    }

    @Test
    void containsOnNull() {
        assertThatNullPointerException().isThrownBy(() -> Finder.contains(null, 0));
    }

    @ParameterizedTest
    @CsvSource({ "21,6", "-12,1", "1024,-1" })
    void lastIndexOfFound(int value, int expected) {
        assertThat(Finder.lastIndexOf(data, value)).isEqualTo(expected);
    }

    @Test
    void lastIndexOfOnNull() {
        assertThatNullPointerException().isThrownBy(() -> Finder.lastIndexOf(null, 0));
    }
}
