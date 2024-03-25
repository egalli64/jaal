/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class BinarySearchTest {
    private final int[] values = { -55, -44, -21, -8, 0, 12, 27, 51, 93, 115, 220 };

    @ParameterizedTest
    @CsvSource({ "12, 5", "93, 8", "115, 9" })
    void iterativePlain(int target, int expected) {
        assertThat(BinarySearch.iterative(values, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = { -56, -54, -1, 1, 219, 222 })
    void iterativeNotFound(int target) {
        assertThat(BinarySearch.iterative(values, target)).isEqualTo(-1);
    }

    @Test
    void iterativeSingleFound() {
        assertThat(BinarySearch.iterative(new int[] { 42 }, 42)).isEqualTo(0);
    }

    @Test
    void iterativeSingleMissing() {
        assertThat(BinarySearch.iterative(new int[] { 42 }, 12)).isEqualTo(-1);
    }

    @Test
    void iterativeEmpty() {
        assertThat(BinarySearch.iterative(new int[] {}, 42)).isEqualTo(-1);
    }

    @Test
    void iterativeNull() {
        assertThatNullPointerException().isThrownBy(() -> BinarySearch.iterative(null, 0));
    }

    @ParameterizedTest
    @CsvSource({ "12, 5", "93, 8", "115, 9" })
    void recursivePlain(int target, int expected) {
        assertThat(BinarySearch.recursive(values, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = { -56, -54, -1, 1, 219, 222 })
    void recursiveNotFound(int target) {
        assertThat(BinarySearch.recursive(values, target)).isEqualTo(-1);
    }

    @Test
    void recursiveSingleFound() {
        assertThat(BinarySearch.recursive(new int[] { 42 }, 42)).isEqualTo(0);
    }

    @Test
    void recursiveSingleMissing() {
        assertThat(BinarySearch.recursive(new int[] { 42 }, 12)).isEqualTo(-1);
    }

    @Test
    void recursiveEmpty() {
        assertThat(BinarySearch.recursive(new int[] {}, 42)).isEqualTo(-1);
    }

    @Test
    void recursiveNull() {
        assertThatNullPointerException().isThrownBy(() -> BinarySearch.recursive(null, 0));
    }
}
