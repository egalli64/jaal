/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s4;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generate a reverse-copy of an array
 */
public class ReverseCopy {
    private static final Logger log = LoggerFactory.getLogger(ReverseCopy.class);

    /**
     * Copy each element from the input array, from left to right, to the same-sized
     * output one, from right to left
     * 
     * @param data the array to be reversed
     * @return the generated reversed array
     */
    public static int[] reverse(int[] data) {
        log.info("Parameter is {}", Arrays.toString(data));
        if (data == null) {
            return data;
        }

        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            result[data.length - i - 1] = data[i];
        }

        log.info("The result is {}", Arrays.toString(result));
        return result;
    }

    /**
     * Smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 3, 54, 12, 99 };
        System.out.println("Original data is " + Arrays.toString(data));

        int[] reverted = reverse(data);
        System.out.println("After in-place reverse is " + Arrays.toString(reverted));
    }
}
