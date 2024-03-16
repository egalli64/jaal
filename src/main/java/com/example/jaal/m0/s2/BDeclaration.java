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
public class BDeclaration {
    private static final Logger log = LoggerFactory.getLogger(BDeclaration.class);

    /**
     * Declare, then initialize
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;
        log.info("First is {}, second is {}", a, b);

        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.printf("Min is %d and max is %d\n", min, max);
    }
}
