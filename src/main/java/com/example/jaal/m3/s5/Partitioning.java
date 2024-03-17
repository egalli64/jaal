/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Partitioning {
    private static final Logger log = LoggerFactory.getLogger(Partitioning.class);

    /**
     * Partition the passed array using its first element as pivot
     * 
     * @param data a non-empty array
     * @return the pivot position after partitioning
     * @throws ArrayIndexOutOfBoundsException empty array
     * @throws NullPointerException           null array
     */
    public static int pivotLeft(int[] data) {
        log.trace("Partitioning {}", data);
        if (data.length == 1) {
            return 0;
        }

        int pivot = data[0];
        int i = 0;
        int j = data.length;
        while (true) {
            while (data[++i] < pivot) {
                if (i == data.length - 1) {
                    break;
                }
            }
            while (data[--j] > pivot) {
                if (j == 0) {
                    break;
                }
            }
            log.trace("i, j = ({}, {})", i, j);

            if (i >= j) {
                break;
            }
            swap(data, i, j);
        }

        swap(data, 0, j);
        return j;
    }

    /**
     * Partition the passed array using its first element as pivot
     * 
     * @param data a non-empty array
     * @param i    the pivot position
     * @return the pivot position after partitioning
     * @throws ArrayIndexOutOfBoundsException bad index
     * @throws NullPointerException           null array
     */
    public static int pivotGiven(int[] data, int i) {
        log.trace("Partitioning with pivot {} in position {}", data[i], i);
        swap(data, i, 0);
        return pivotLeft(data);
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
        log.trace("Swapping {} and {}", data[i], data[j]);

        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }
}
