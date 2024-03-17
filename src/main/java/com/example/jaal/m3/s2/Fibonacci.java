/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s2;

/**
 * Basic recursive and iterative implementations of the Fibonacci function
 * <p>
 * TODO: robustness
 */
public class Fibonacci {
    /**
     * Recursive Fibonacci
     * 
     * @param n A natural number
     * @return the Fibonacci of n
     */
    public static long recursive(int n) {
        if (n < 2) {
            return n;
        }

        return recursive(n - 1) + recursive(n - 2);
    }

    /**
     * Tail recursive Fibonacci
     * 
     * @param n A natural number
     * @return the Fibonacci of n
     */
    public static long tailRecursive(int n) {
        if (n < 2) {
            return n;
        }

        return tailRecursive(0, 1, n);
    }

    /**
     * Internal details for tail recursive Fibonacci
     * 
     * @param previous the previous term in the sequence
     * @param current  the current term in the sequence
     * @param n        when is 1, the recursion ends returning current
     * @return the calculated Fibonacci for the original caller
     */
    private static long tailRecursive(long previous, long current, long n) {
        if (n == 1) {
            return current;
        }
        return tailRecursive(current, previous + current, n - 1);
    }

    /**
     * Iterative Fibonacci
     * 
     * @param n A natural number
     * @return the Fibonacci of n
     */
    public static long iterative(int n) {
        if (n < 2) {
            return n;
        }

        long previous = 1;
        long result = 1;

        for (int i = 3; i <= n; i++) {
            long current = result;
            result += previous;
            previous = current;
        }

        return result;
    }

    /**
     * Smoke test for Fibonacci calculation
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int n = 40;
        System.out.printf("Fibonacci of %d (recursive) is %d%n", n, recursive(n));
        System.out.printf("Fibonacci of %d (tail recursive) is %d%n", n, tailRecursive(n));
        System.out.printf("Fibonacci of %d (iterative) is %d%n", n, iterative(n));
    }
}
