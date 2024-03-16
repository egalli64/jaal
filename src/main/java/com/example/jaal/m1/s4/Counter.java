/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Counting methods
 */
public class Counter {
    private static final Logger log = LoggerFactory.getLogger(Counter.class);

    /**
     * Count even values in the passed array
     * 
     * @param values an array
     * @return the number of even elements in the array
     * @throws NullPointerException if values is null
     */
    public static int countEven(int[] values) {
        log.trace("Array sized {}", values == null ? "N/A" : values.length);

        int result = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * Count positive values in the passed array
     * 
     * @param values an array
     * @return the number of positive elements in the array
     * @throws NullPointerException if values is null
     */
    public static int countPositive(int[] values) {
        log.trace("Array sized {}", values == null ? "N/A" : values.length);

        int result = 0;
        for (int value : values) {
            if (value > 0) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * Count elements with a given value in the passed array
     * 
     * @param values an array
     * @param target the searched value
     * @return the number of targets in the array
     * @throws NullPointerException if values is null
     */
    public static int countEqualTo(int[] values, int target) {
        log.trace("Array sized {}", values == null ? "N/A" : values.length);

        int result = 0;
        for (int value : values) {
            if (value == target) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * Smoke test for the methods above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 0, -21, 99, 5, 1, 0 };
        log.trace("Array is {}", data);

        int even = countEven(data);
        System.out.printf("There are %d even values in the array%n", even);

        int positive = countPositive(data);
        System.out.printf("There are %d positive values in the array%n", positive);

        int zeroes = countEqualTo(data, 0);
        System.out.printf("There are %d zeroes in the array%n", zeroes);
    }
}
