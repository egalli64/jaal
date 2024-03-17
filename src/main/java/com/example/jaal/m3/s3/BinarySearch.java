/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m3.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Binary search on a sorted array
 */
public class BinarySearch {
    private static final Logger log = LoggerFactory.getLogger(BinarySearch.class);

    /**
     * Recursive approach to binary search
     * 
     * @param values the searched sorted array
     * @param target the value to be found
     * @return the position of target in values, or -1
     * @throws NullPointerException if values is null
     */
    public static int recursive(int[] values, int target) {
        log.trace("Searching {}", target);
        return recursive(values, target, 0, values.length - 1);
    }

    /**
     * Internal loop for recursive binary search
     * 
     * @param values the searched sorted array
     * @param target the value to be found
     * @param first  index of the leftmost element to be considered
     * @param last   index of the rightmost element to be considered
     * @return the position of target in values, or -1
     */
    public static int recursive(int[] values, int target, int first, int last) {
        if (first > last) {
            return -1;
        }

        int current = first + (last - first) / 2;
        log.trace("Checking {}", current);
        if (values[current] > target) {
            return recursive(values, target, first, current - 1);
        } else if (values[current] < target) {
            return recursive(values, target, current + 1, last);
        } else {
            return current;
        }
    }

    /**
     * Iterative approach to binary search
     * 
     * @param values the searched sorted array
     * @param target the value to be found
     * @return the position of target in values, or -1
     * @throws NullPointerException if values is null
     */
    public static int iterative(int[] values, int target) {
        log.trace("Searching {}", target);
        int first = 0;
        int last = values.length - 1;

        while (first < last) {
            int current = first + (last - first) / 2;
            log.trace("Checking {}", current);
            if (values[current] > target) {
                last = current - 1;
            } else if (values[current] < target) {
                first = current + 1;
            } else {
                return current;
            }
        }

        return -1;
    }

    /**
     * Smoke test for binary searches
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] values = { 3, 6, 10, 15, 19, 22, 27, 34, 36, 42, 45 };
        log.trace("Array is {}", values);

        int targets[] = { 22, 36, 42, 35 };

        for (int target : targets) {
            System.out.printf("%d is at %d (recursive)%n", target, recursive(values, target));
            System.out.printf("%d is at %d (iterative)%n", target, iterative(values, target));
        }
    }
}
