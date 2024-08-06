/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swapping primitives in tricky ways.
 * 
 * (don't do that in production code!)
 */
public class Tricky {
    private static final Logger log = LoggerFactory.getLogger(Tricky.class);

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        log.info("x={}, y={}", x, y);

        // no temporary variable through addition
        x = x + y;
        y = x - y;
        x = x - y;
        log.info("Unsafe swap by adding and subtracting: x={}, y={}", x, y);

        // no temporary variable through XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        log.info("Unsafe swap by XOR: x={}, y={}", x, y);

        // big values could lead to undefined behavior (though usually looks all right)
        x = 2_000_000_000;
        y = 1_000_000_000;
        log.info("x={}, y={}", x, y);

        x = x + y; // overflow
        log.warn("Overflow in x: {}", x);
        y = x - y; // underflow
        x = x - y; // underflow
        log.warn("However, _usually_ we get the right result: x={}, y={}", x, y);

        // swapping an element with itself by XOR usually leads to error
        int[] values = { 11, 22, 33 };

        log.info("Before buggySwap(): {}", values);
        buggySwap(values, 0, 2);
        log.info("After buggySwap(): {}", values);

        buggySwap(values, 1, 1);
        log.error("After buggySwap(): {}", values);
    }

    /**
     * Swap two elements in the passed array
     * <p>
     * !!! DOES NOT WORK CORRECTLY IF i == j !!!
     * 
     * @param data the array
     * @param i    a position
     * @param j    another position
     * @exception NullPointerException           array is null
     * @exception ArrayIndexOutOfBoundsException indices not in bound
     */
    public static void buggySwap(int[] data, int i, int j) {
        log.trace("Before swapping values {} and {}", data[i], data[j]);

        data[i] = data[i] ^ data[j];
        data[j] = data[i] ^ data[j];
        data[i] = data[i] ^ data[j];

        log.trace("After swapping values {} and {}", data[i], data[j]);
    }
}
