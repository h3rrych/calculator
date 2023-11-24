package com.example.calculator.service.impl;

import com.example.calculator.service.api.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }


    public String sum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");}

        else
            return num1 + " / " + num2 + " = " + (num1 / num2);


    }
}