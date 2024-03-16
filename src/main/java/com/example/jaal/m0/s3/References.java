/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping references (mutable and immutable)
 */
public class References {
    private static final Logger log = LoggerFactory.getLogger(References.class);

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

        // Mutable references
        StringBuilder a = new StringBuilder("Alpha");
        StringBuilder b = new StringBuilder("Beta");

        log.info("Before calling swap() a is {} and b is {}", a, b);
        swap(a, b);
        log.info("After calling swap() a is {} and b is {}", a, b);
    }

    /**
     * Swap the values of two mutable references
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
