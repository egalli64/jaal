/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Recursively split, sort and merge
 * <p>
 * Use a buffer to simplify the merging procedure
 */
public class Mergesort {
    private static final Logger log = LoggerFactory.getLogger(Mergesort.class);

    private static int[] buffer;

    /**
     * Plain top-down algorithm
     * 
     * @param values an array (not null!)
     */
    public static void plain(int[] values) {
        log.trace("{}", values);
        buffer = new int[values.length];
        sort(values, 0, values.length - 1);
    }

    /**
     * Internal detail
     * 
     * @param values the array to sort
     * @param left   index of the leftmost element to sort
     * @param right  index of the rightmost element to sort
     */
    private static void sort(int[] values, int left, int right) {
        if (left >= right) {
            log.trace("{} ({}, {})", values, left, right);
            return;
        }

        log.trace("[{} .. {}]", left, right);
        int center = left + (right - left) / 2;
        sort(values, left, center);
        sort(values, center + 1, right);
        merge(values, left, center, right);
        log.trace("{}", values);
    }

    /**
     * Merge two subsequent intervals in one, keeping their internal order
     * 
     * @param values the array to sort
     * @param left   index of the first element of the first subsequence
     * @param center index of the last element of the first subsequence
     * @param right  index of the last element of the second subsequence
     */
    private static void merge(int[] values, int left, int center, int right) {
        log.trace("[{} .. {}] [{} .. {}]", left, center, center + 1, right);

        for (int i = left; i <= right; i++) {
            buffer[i] = values[i];
        }

        int i = left;
        int j = center + 1;
        int k = left;
        while (i <= center && j <= right) {
            if (buffer[i] < buffer[j]) {
                values[k] = buffer[i];
                i += 1;
            } else {
                values[k] = buffer[j];
                j += 1;
            }
            k += 1;
        }
        while (i <= center) {
            values[k] = buffer[i];
            i += 1;
            k += 1;
        }
        while (j <= right) {
            values[k] = buffer[j];
            j += 1;
            k += 1;
        }
    }

    /**
     * Merge two subsequent intervals in one, keeping their internal order - compact loop
     * 
     * @param values the array to sort
     * @param left   index of the first element of the first subsequence
     * @param center index of the last element of the first subsequence
     * @param right  index of the last element of the second subsequence
     */
    static void merge2(int[] values, int left, int center, int right) {
        log.trace("[{} .. {}] [{} .. {}]", left, center, center + 1, right);

        for (int k = left; k <= right; k++) {
            buffer[k] = values[k];
        }

        for (int i = left, j = center + 1, k = left; k <= right; k++) {
            if (i > center)
                values[k] = buffer[j++];
            else if (j > right)
                values[k] = buffer[i++];
            else if (buffer[j] < buffer[i])
                values[k] = buffer[j++];
            else
                values[k] = buffer[i++];
        }
    }
}
