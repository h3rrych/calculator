package com.example.calculator.service.api;

public interface CalculatorService {
    String showWelcome();
    String sum(int num1, int num2);
    String minus( int num1, int num2);
    String multiply( int num1, int num2);
    String divide( int num1, int num2);
}