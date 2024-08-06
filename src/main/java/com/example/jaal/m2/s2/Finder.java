/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m2.s2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Look for a value in an array
 */
public class Finder {
    private static final Logger log = LoggerFactory.getLogger(Finder.class);

    /**
     * Get the index of the first occurrence in the array for a given value
     * 
     * @param data   an array
     * @param target the searched element
     * @return the first index in which the value is found, or -1
     * @throws NullPointerException if data is null
     */
    public static int indexOf(int[] data, int target) {
        log.trace("Target is {}", target);
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check if a value is contained in the array
     * 
     * @param data   an array
     * @param target the element to be checked
     * @return true if the element is in the array
     * @throws NullPointerException if data is null
     */
    public static boolean contains(int[] data, int target) {
        log.trace("Target is {}", target);
        for (int current : data) {
            if (current == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get the index of the last occurrence in the array for a given value
     * 
     * @param data   an array
     * @param target the searched element
     * @return the last index in which the value is found, or -1
     * @throws NullPointerException if data is null
     */
    public static int lastIndexOf(int[] data, int target) {
        log.trace("Target is {}", target);
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Smoke test for the methods above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 1, 21, 99, 5 };
        log.info("The sample array is {}", data);

        int value = 21;

        // Example for indexOf()
        int index = indexOf(data, value);
        log.info("First position for value {} is {}", value, index);

        // Example for contains()
        if (contains(data, value)) {
            log.info("Value {} is found", value);
        }

        // Example for lastIndexOf()
        int lastIndex = lastIndexOf(data, value);
        log.info("Last position for value {} is {}", value, lastIndex);
    }
}
