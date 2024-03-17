/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Recursively select a pivot and partition the interval
 */
public class Quicksort {
    private static final Logger log = LoggerFactory.getLogger(Quicksort.class);

    /**
     * Naive implementation - as pivot is always chosen the leftmost element!
     * 
     * @param values an array (not null!)
     */
    public static void plain(int[] values) {
        log.trace("{}", values);

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
        if (right <= left) {
            return;
        }

        int i = partition(values, left, right);
        log.trace("Pivot {} : {}", i, values[i]);

        sort(values, left, i - 1);
        sort(values, i + 1, right);
    }

    /**
     * Naive implementation - as pivot is always chosen the leftmost element!
     * 
     * @param values the array to partition
     * @param left   index of the leftmost element to partition
     * @param right  index of the rightmost element to partition
     * @return the pivot index
     */
    private static int partition(int[] values, int left, int right) {
        log.trace("{} {}", left, right);

        int i = left;
        int j = right + 1;
        int pivot = values[left];
        while (true) {
            while (values[++i] < pivot) {
                if (i == right) {
                    break;
                }
            }
            while (pivot < values[--j]) {
                if (j == left) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(values, i, j);
        }
        swap(values, left, j);
        return j;
    }

    /**
     * Swap elements in array
     * <p>
     * Preconditions: array is not empty, indexes are "good"
     * 
     * @param data the array
     * @param i    first element position
     * @param j    second element position
     */
    private static void swap(int[] data, int i, int j) {
        log.trace("{} {}", i, j);

        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }
}
