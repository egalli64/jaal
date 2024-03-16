/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m0.s2;

/**
 * Comparing numbers for minimum / maximum value
 */
public class BDeclaration {
    /**
     * Declare, then initialize
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 24;

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

        System.out.printf("Given %d and %d, min is %d and max is %d\n", a, b, min, max);
    }
}
