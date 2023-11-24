package com.example.calculator;

import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test

    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculatorService.divide(10, 0);
                });
    }

    @Test
    public void testSumma() {

        assertNotNull(calculatorService.sum(4, 5));

    }

    @Test
    public void summaContains() {

        assertTrue(calculatorService.sum(4, 5).contains("" + (4 + 5)));

    }

    @Test
    public void testMinus() {

        assertNotNull(calculatorService.minus(7, 5));

    }

    @Test
    public void minusContains() {

        assertTrue(calculatorService.minus(7, 5).contains((7 - 5) + ""));

    }

    @Test
    public void testMultiply() {

        assertNotNull(calculatorService.multiply(4, 5));

    }

    @Test
    public void testMultiplyContains() {

        assertTrue(calculatorService.multiply(4, 5).contains("" + (4 * 5)));

    }

    @Test
    public void testDivide() {

        assertNotNull(calculatorService.divide(5, 5));

    }

    @Test
    public void testDivideContains() {

        assertTrue(calculatorService.divide(5, 5).contains("" + (5 / 5)));

    }
}
