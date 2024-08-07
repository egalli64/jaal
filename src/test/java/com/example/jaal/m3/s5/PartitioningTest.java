/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class PartitioningTest {
    @Test
    void pivotLeftWhenPlain() {
        int pivot = 6;
        int[] values = { pivot, 1, 8, 5, 7, 0, 9, 3, -1, -3, 18, 10, 2 };
        int expected = 7;

        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(expected);
        for (int i = 0; i < actual; i++) {
            assertThat(values[i]).isLessThanOrEqualTo(pivot);
        }

        for (int i = actual; i < values.length; i++) {
            assertThat(values[i]).isGreaterThanOrEqualTo(pivot);
        }
    }

    @Test
    void pivotLeftWhenDuplicates() {
        int pivot = 6;
        int[] values = { pivot, 1, 8, 5, 7, 1, 9, 3, 5, 3, 8, 7, 2, 6 };
        int expected = 8;

        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(expected);
        for (int i = 0; i < actual; i++) {
            assertThat(values[i]).isLessThanOrEqualTo(pivot);
        }

        for (int i = actual; i < values.length; i++) {
            assertThat(values[i]).isGreaterThanOrEqualTo(pivot);
        }
    }

    @Test
    void pivotLeftWhenOrdered() {
        int[] values = { 0, 1, 2, 3 };
        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(0);
        for (int i = 0; i < values.length; i++) {
            assertThat(values[i]).isEqualTo(i);
        }
    }

    @Test
    void pivotLeftWhenInverted() {
        int[] values = { 3, 2, 1, 0 };
        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void pivotLeftWhenSingle() {
        int[] values = { 42 };
        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void pivotLeftWhenCouple() {
        int[] values = { 12, 42 };
        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void pivotLeftWhenInvertedCouple() {
        int[] values = { 42, 12 };
        int actual = Partitioning.pivotLeft(values);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void pivotLeftWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Partitioning.pivotLeft(null));
    }

    @Test
    void pivotLeftWhenEmptyThenException() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> Partitioning.pivotLeft(new int[] {}));
    }

    @Test
    void pivotGivenWhenPlain() {
        int pivotPos = 4;
        int pivot = 6;
        int[] values = { 7, 1, 8, 5, pivot, 0, 9, 3, -1, -3, 18, 10, 2 };
        int expected = 7;

        int actual = Partitioning.pivotGiven(values, pivotPos);
        assertThat(actual).isEqualTo(expected);
        for (int i = 0; i < actual; i++) {
            assertThat(values[i]).isLessThanOrEqualTo(pivot);
        }

        for (int i = actual; i < values.length; i++) {
            assertThat(values[i]).isGreaterThanOrEqualTo(pivot);
        }
    }

    @Test
    void pivotGivenWhenDuplicates() {
        int pivotPos = 4;
        int pivot = 6;
        int[] values = { 7, 1, 8, 5, pivot, 1, 9, 3, 5, 3, 8, 7, 2, 6 };
        int expected = 8;

        int actual = Partitioning.pivotGiven(values, pivotPos);
        assertThat(actual).isEqualTo(expected);
        for (int i = 0; i < actual; i++) {
            assertThat(values[i]).isLessThanOrEqualTo(pivot);
        }

        for (int i = actual; i < values.length; i++) {
            assertThat(values[i]).isGreaterThanOrEqualTo(pivot);
        }
    }

    @Test
    void pivotGivenWhenNullThenNPE() {
        assertThatNullPointerException().isThrownBy(() -> Partitioning.pivotGiven(null, 0));
    }

    @Test
    void pivotGivenWhenEmptyThenException() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> Partitioning.pivotGiven(new int[] {}, 0));
    }

    @Test
    void pivotGivenWhenBadPositionThenException() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> Partitioning.pivotGiven(new int[] { 42 }, 42));
    }
}
