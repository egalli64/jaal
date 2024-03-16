/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s2;

/**
 * Comparing numbers for minimum / maximum value
 */
public class AReassignment {
    /**
     * Tentative definition, then check the alternative
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;

        int min = a;
        if (b < a) {
            min = b;
        }

        int max = a;
        if (b > a) {
            max = b;
        }

        System.out.printf("Given %d and %d, min is %d and max is %d\n", a, b, min, max);
    }
}
