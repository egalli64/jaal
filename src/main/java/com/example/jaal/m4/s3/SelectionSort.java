/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m4.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * For each position select the "right" element and put it there
 */
public class SelectionSort {
    private static final Logger log = LoggerFactory.getLogger(SelectionSort.class);

    /**
     * Plain algorithm
     * 
     * @param data an array (not null!)
     */
    static public void plain(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 0; i < data.length - 1; i++) {
            int pos = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }

            log.trace("Swap from {} to {}", i, pos);
            int temp = data[i];
            data[i] = data[pos];
            data[pos] = temp;
        }
    }

    /**
     * Do swap only if the selected element is not the current one
     * 
     * @param data an array (not null!)
     */
    static public void lessWrite(int[] data) {
        log.trace("Input: {}", data);
        for (int i = 0; i < data.length - 1; i++) {
            int pos = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }

            if (i != pos) {
                log.trace("Swap from {} to {}", i, pos);
                int temp = data[i];
                data[i] = data[pos];
                data[pos] = temp;
            }
        }
    }
}
