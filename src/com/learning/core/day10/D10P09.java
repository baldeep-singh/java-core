package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class CalculatorTester {

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

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int result = calculator.mul(a, b);
        int expectedResult = a * b;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;
        int result = calculator.div(a, b);
        int expectedResult = a / b;
        assertEquals(expectedResult, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;
        calculator.div(a, b);
    }

    @Test
    public void testFindMax() {
        Calculator calculator = new Calculator();
        int[] arr1 = {1, 2, 3, 4, 5};
        assertEquals(5, calculator.findMax(arr1));

        int[] arr2 = {-1, -2, -3, -4, -5};
        assertEquals(-1, calculator.findMax(arr2));
    }
}

