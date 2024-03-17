/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Divide the sequence in two parts, already processed and to be processed
 * <p>
 * Any new element is put in the (currently) right position among the processed ones
 */
public class InsertionSort {
    private static final Logger log = LoggerFactory.getLogger(InsertionSort.class);

    /**
     * Plain algorithm
     * 
     * @param data an array (not null!)
     */
    public static void plain(int[] data) {
        log.trace("Input: {}", data);

        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0 && data[j] < data[j - 1]; j--) {
                log.trace("Swap position {} and position {}", j, j - 1);

                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
            }
        }
    }

    /**
     * Kind of custom swap to remove unnecessary copies
     * 
     * @param data an array (not null!)
     */
    public static void lessCopies(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i;
            for (; j > 0 && data[j - 1] > temp; j--) {
                log.trace("Move from position {} to position {}", j - 1, j);
                data[j] = data[j - 1];
            }
            if (j != i) {
                log.trace("Copy what was in position {} to position {}", i, j);
                data[j] = temp;
            }
        }
    }
}
