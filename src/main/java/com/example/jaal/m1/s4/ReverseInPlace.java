/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s4;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reversing an array in place
 */
public class ReverseInPlace {
    private static final Logger log = LoggerFactory.getLogger(ReverseInPlace.class);

    /**
     * Swap all the elements in the array, from the extreme positions converging to
     * the center
     * 
     * @param data the array to be reversed
     */
    public static void reverse(int[] data) {
        log.info("Parameter is {}", data);
        if (data == null) {
            return;
        }

        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;
        }

        log.info("Reversed parameter is {}", data);
    }

    /**
     * Smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 3, 54, 12, 99 };
        System.out.println("Original data is " + Arrays.toString(data));

        reverse(data);
        System.out.println("After in-place reverse is " + Arrays.toString(data));
    }
}
