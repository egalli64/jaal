/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping primitive values
 */
public class Primitives {
    private static final Logger log = LoggerFactory.getLogger(Primitives.class);

    /**
     * Show that can't delegate to a method a primitive swap. The workaround is
     * doing it locally
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        log.info("x is {}, y is {}", x, y);

        buggySwap(x, y);
        log.info("After call to (buggy) swap method: x is {}, y is {}", x, y);

        // Workaround: swap primitives where it is needed
        int temp = x;
        x = y;
        y = temp;
        log.info("After local swap: x is {}, y is {}", x, y);
    }

    /**
     * Primitives swap: not possible in Java
     * 
     * @param left  expected to be swapped with right
     * @param right expected to be swapped with left
     */
    private static void buggySwap(int left, int right) {
        log.info("Inside (buggy) swap method: left is {}, right is {}", left, right);

        int temp = left;
        left = right;
        right = temp;

        log.info("Inside (buggy) swap method: left is {}, right is {}", left, right);
    }
}
