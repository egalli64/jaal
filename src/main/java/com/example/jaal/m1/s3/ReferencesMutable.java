/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping references - mutable
 */
public class ReferencesMutable {
    private static final Logger log = LoggerFactory.getLogger(ReferencesMutable.class);

    /**
     * Show that can delegate to a method a mutable reference swap
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Mutable references
        StringBuilder a = new StringBuilder("Alpha");
        StringBuilder b = new StringBuilder("Beta");

        log.info("Before calling swap() a is {} and b is {}", a, b);
        swap(a, b);
        log.info("After calling swap() a is {} and b is {}", a, b);
    }

    /**
     * Swap the values of two mutable references, when no null is involved
     * 
     * @param left  to be swapped with right
     * @param right to be swapped with left
     * @throws NullPointerException if left or right is null
     */
    public static void swap(StringBuilder left, StringBuilder right) {
        log.trace("{} and {}", left, right);
        // save the content of left
        String temp = left.toString();

        // replace the content of left with right
        left.replace(0, left.length(), right.toString());

        // replace the content of right with the _original_ content of left
        right.replace(0, right.length(), temp);
        log.trace("{} and {}", left, right);
    }
}
