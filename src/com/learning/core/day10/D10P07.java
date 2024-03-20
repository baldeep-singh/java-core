package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P07 {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        int expectedResult = a + b;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int result = calculator.sub(a, b);
        int expectedResult = a - b;
        assertEquals(expectedResult, result);
    }
}
