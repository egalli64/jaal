/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping references - immutable
 */
public class ReferencesImmutable {
    private static final Logger log = LoggerFactory.getLogger(ReferencesImmutable.class);

    /**
     * Show that can't delegate to a method an immutable reference swap. The
     * workaround is doing it locally
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Immutable references
        String s = "Sam";
        String t = "Tom";

        log.info("Before calling buggySwap() s is {} and t is {}", s, t);
        buggySwap(s, t);
        log.info("After calling buggySwap() s is {} and t is {}", s, t);

        // Workaround: swap immutable references where it is needed
        String buffer = s;
        s = t;
        t = buffer;
        log.info("After local swap s is {} and t is {}", s, t);
    }

    /**
     * Immutable references swap: not possible in Java
     * 
     * @param left  expected to be swapped with right
     * @param right expected to be swapped with left
     */
    public static void buggySwap(String left, String right) {
        log.trace("{} and {}", left, right);

        String temp = left;
        left = right;
        right = temp;

        log.trace("{} and {}", left, right);
    }
}
