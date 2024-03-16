/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adder method
 */
public class Adder {
    private static final Logger log = LoggerFactory.getLogger(Adder.class);

    /**
     * Add all the values (assumed to be small and few) in the input array
     * <p>
     * TODO: think of a more robust implementation
     * 
     * @param values an array
     * @return the total sum of elements
     * @throws NullPointerException if values is null
     */
    public static int sum(int[] values) {
        log.trace("Array sized {}", values == null ? "N/A" : values.length);

        int result = 0;
        for (int value : values) {
            result += value;
        }

        return result;
    }

    /**
     * Smoke test for the method above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, -12, 3, 2, 1 };
        log.trace("Array is {}", data);

        int result = sum(data);
        System.out.println("The result of adding all the elements in the arrays is " + result);
    }
}
