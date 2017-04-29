package com.demo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 },
                { 7, 13 }, { 8, 21 } });
    }

    private int fInput;
    private int fExpected;

    public FibonacciTest(int input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void testRunIterative() {
        Assert.assertEquals(fExpected, Fibonacci.runIterative(fInput));
    }

    @Test
    public void testRunRecursive() {
        Assert.assertEquals(fExpected, Fibonacci.runRecursive(fInput));
    }

    @Test
    public void testRunEuler() {
        Assert.assertEquals(fExpected, Fibonacci.runEuler(fInput));
    }

}
