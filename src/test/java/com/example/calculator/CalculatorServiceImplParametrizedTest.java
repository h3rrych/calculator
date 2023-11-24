package com.example.calculator;

import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(4, 3));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void paramsSummaTest(int num1, int num2) {
        assertTrue(out.sum(num1, num2).contains("" + (num1 + num2)));

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void paramsMinusTest(int num1, int num2) {
        assertTrue(out.minus(num1, num2).contains("" + (num1 - num2)));

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void paramsMultiplyTest(int num1, int num2) {
        assertTrue(out.multiply(num1, num2).contains("" + (num1 * num2)));

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void paramsDivideTest(int num1, int num2) {
        assertTrue(out.divide(num1, num2).contains("" + (num1 / num2)));

    }
}

