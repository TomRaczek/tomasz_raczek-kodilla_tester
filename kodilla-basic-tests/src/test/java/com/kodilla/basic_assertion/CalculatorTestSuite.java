package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator2 = new Calculator();
        int c = 9;
        int d = 4;
        int subtractResult = calculator2.subtract(c,d);
        assertEquals(5,subtractResult);
    }

    @Test
    public void testToPower2() {
        Calculator calculator3 = new Calculator();
        int e = 5;
        int toPower2Result = calculator3.toPower2(e);
        assertEquals(25,toPower2Result);
    }
}