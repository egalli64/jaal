/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s2;

/**
 * Comparing numbers for minimum / maximum value
 */
public class CTernary {
    /**
     * Initialize the right value checking with ternary operator
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;

        int min = a < b ? a : b;
        int max = a > b ? a : b;
        System.out.printf("Given %d and %d, min is %d and max is %d\n", a, b, min, max);
    }
}