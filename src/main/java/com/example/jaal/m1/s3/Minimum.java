/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Look for minimum value in an array
 */
public class Minimum {
    private static final Logger log = LoggerFactory.getLogger(Minimum.class);

    /**
     * Get the minimum value in the array
     * 
     * @param data an array
     * @return the position of the first smallest element
     * @throws NullPointerException           if data is null
     * @throws ArrayIndexOutOfBoundsException if data is empty
     */
    public static int min(int[] data) {
        log.trace("Array sized {}", data == null ? "N/A" : data.length);

        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < result) {
                result = data[i];
            }
        }

        return result;
    }

    /**
     * Get the position of the first element having the minimum value in the array
     * 
     * @param data an array
     * @return the position of the first smallest element
     * @throws NullPointerException     if data is null
     * @throws IllegalArgumentException if data is empty
     */
    public static int getMinPos(int[] data) {
        log.trace("Array sized {}", data == null ? "N/A" : data.length);

        if (data.length == 0) {
            throw new IllegalArgumentException("Input array can't be empty");
        }

        int position = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[position]) {
                position = i;
            }
        }

        return position;
    }

    /**
     * Smoke test for the methods above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 1, 21, 99, 5, 1 };
        log.trace("Array is {}", data);

        int value = min(data);
        System.out.println("Minimum value is " + value);

        int index = getMinPos(data);
        System.out.println("Minimum value is in position " + index + ": " + data[index]);
    }
}
