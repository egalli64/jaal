/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comparing numbers for minimum / maximum value
 */
public class AReassignment {
    private static final Logger log = LoggerFactory.getLogger(AReassignment.class);

    /**
     * Tentative definition, then check the alternative
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;
        log.info("First is {}, second is {}", a, b);

        int min = a;
        if (b < a) {
            min = b;
        }

        int max = a;
        if (b > a) {
            max = b;
        }

        System.out.printf("Min is %d and max is %d\n", min, max);
    }
}
