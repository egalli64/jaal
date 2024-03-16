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
public class DMath {
    private static final Logger log = LoggerFactory.getLogger(DMath.class);

    /**
     * Delegate to Math.min() / Math.max()
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;
        log.info("First is {}, second is {}", a, b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.printf("Min is %d and max is %d\n", min, max);
    }
}
