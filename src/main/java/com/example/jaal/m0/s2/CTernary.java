/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comparing numbers for minimum / maximum value
 */
public class CTernary {
    private static final Logger log = LoggerFactory.getLogger(CTernary.class);

    /**
     * Initialize the right value checking with ternary operator
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;
        log.info("First is {}, second is {}", a, b);

        int min = a < b ? a : b;
        int max = a > b ? a : b;
        System.out.printf("Min is %d and max is %d\n", min, max);
    }
}
