package com.demo;

/**
 * Fibonnaci implemented in different ways
 *
 */
public class Fibonacci {
    public static int runInterative(int n) {
        if (n < 2)
            return n;

        int previousN = 0;
        int currentN = 1;
        for (int i = 2; i <= n; i++) {
            currentN = currentN + previousN;
            previousN = currentN - previousN;
        }
        return currentN;
    }

    public static int runRecursive(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return runRecursive(n - 2) + runRecursive(n - 1);
        }
    }

    public static int runEuler(int n) {
        double phi = (Math.sqrt(5) + 1) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
