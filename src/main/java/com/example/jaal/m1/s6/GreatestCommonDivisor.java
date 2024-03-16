/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GCD basic recursive and iterative implementations based on the Euclid's algorithm
 * <p>
 * TODO: robustness
 */
public class GreatestCommonDivisor {
    private static final Logger log = LoggerFactory.getLogger(GreatestCommonDivisor.class);

    /**
     * Recursive GCD
     * 
     * @param a a natural number
     * @param b another natural number
     * @return
     */
    public static int recursive(int a, int b) {
        log.trace("{}, {}", a, b);
        if (b == 0) {
            return a;
        }

        return recursive(b, a % b);
    }

    /**
     * Iterative GCD
     * 
     * @param a a natural number
     * @param b another natural number
     * @return
     */
    public static int iterative(int a, int b) {
        log.trace("{}, {}", a, b);
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % a;
            log.trace("{}, {}", a, b);
        }
        return a;
    }

    /**
     * Smoke test for GCD
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 35;

        System.out.printf("GCD of %d and %d (recursive) is %d%n", a, b, recursive(a, b));
        System.out.printf("GCD of %d and %d (iterative) is %d%n", a, b, iterative(a, b));
    }
}
