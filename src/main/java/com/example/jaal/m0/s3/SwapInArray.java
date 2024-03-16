/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s3;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping elements in array
 */
public class SwapInArray {
    private static final Logger log = LoggerFactory.getLogger(SwapInArray.class);

    /**
     * The base type won't matter: primitive, mutable or immutable reference, will do
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 2, -9, 1, 3, 88, 5 };

        log.info("Before swap(): " + Arrays.toString(data));
        swap(data, 1, 4);
        log.info("After swap(): " + Arrays.toString(data));
    }

    /**
     * Swap two elements in the passed array
     * 
     * @param data the array
     * @param i    a position
     * @param j    another position
     * @exception NullPointerException           array is null
     * @exception ArrayIndexOutOfBoundsException indices not in bound
     */
    public static void swap(int[] data, int i, int j) {
        log.trace("Before swapping {} and {}", data[i], data[j]);

        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;

        log.trace("After swapping {} and {}", data[i], data[j]);
    }
}
