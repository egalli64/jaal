/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort {
    private static final Logger log = LoggerFactory.getLogger(BubbleSort.class);

    /**
     * Barebone algorithm: compare the first n-1 elements with its right neighbor. Swap them when
     * required. Repeat n-1 times to ensure full ordering.
     * 
     * @param data an array
     */
    static public void base(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                log.trace("Comparing {} and {}", data[j], data[j + 1]);
                if (data[j] > data[j + 1]) {
                    log.trace("Swap");
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Minor improvement, since the bubble moves the largest element to the right, the internal loop
     * could stop each time a position more to the left.
     * 
     * @param data an array
     */
    static public void improved(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                log.trace("Comparing {} and {}", data[j], data[j + 1]);
                if (data[j] > data[j + 1]) {
                    log.trace("Swap");
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /**
     * When the external loop completes without swap, the array is sorted. No need to more loops.
     * 
     * @param data an array
     */
    static public void checkSwap(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 0; i < data.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                log.trace("Comparing {} and {}", data[j], data[j + 1]);
                if (data[j] > data[j + 1]) {
                    log.trace("Swap");
                    swapped = true;

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * After the last swap all the elements are ordered. A more aggressive cut could be done.
     * 
     * @param data an array
     */
    static public void swapCut(int[] data) {
        log.trace("Input: {}", data);

        int len = data.length - 1;

        for (int i = 0; i < data.length - 1; i++) {
            int lastSwap = 0;
            for (int j = 0; j < len; j++) {
                log.trace("Comparing {} and {}", data[j], data[j + 1]);
                if (data[j] > data[j + 1]) {
                    log.trace("Swap");
                    lastSwap = j;

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            if (lastSwap == 0) {
                break;
            } else {
                len = lastSwap;
            }
        }
    }
}
