/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s2;

/**
 * Basic recursive and iterative implementations of the factorial function.
 * 
 * <pre>
 *  0! = 1
 *  1! = 1
 *  2! = 2 * 1
 *  3! = 3 * 2 * 1 = 6
 *  ...
 *  n! = n * (n-1) * ... * 2 * 1
 * </pre>
 * 
 * TODO: robustness, what if the user pass a negative or a large positive input?
 */
public class Factorial {
    /**
     * Recursive implementation
     * 
     * @param n a natural number (0+)
     * @return the factorial of n
     */
    public static long recursive(int n) {
        if (n < 2) {
            return 1;
        }

        return n * recursive(n - 1);
    }

    /**
     * Tail recursive implementation - better for performance, but the Java support
     * to Tail Call Optimization (TCO) is (currently) not complete
     * 
     * @param n a natural number (0+)
     * @return the factorial of n
     */
    public static long tailRecursive(int n) {
        return tailRecursiveImpl(n, 1);
    }

    /**
     * Hide the tail recursive details to the caller
     * 
     * @param n           a natural number (0+)
     * @param accumulator the partial result
     * @return the factorial of n
     */
    private static long tailRecursiveImpl(int n, long accumulator) {
        if (n < 2) {
            return accumulator;
        }

        return tailRecursiveImpl(n - 1, accumulator * n);
    }

    /**
     * Iterative implementation - preferred
     * 
     * @param n A natural number
     * @return the factorial of n
     */
    public static long iterative(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Smoke test for factorial calculation
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int n = 20;
        System.out.printf("Factorial of %d is %d (recursive)\n", n, recursive(n));
        System.out.printf("Factorial of %d is %d (tail recursive)\n", n, tailRecursive(n));
        System.out.printf("Factorial of %d is %d (iterative)\n", n, iterative(n));
    }
}
