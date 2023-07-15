package com.example.calculator_3;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String addTwoNumbers(int num1, int num2) {

        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String subtractTwoNumbers(int num1, int num2) {

        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;

    }

    @Override
    public String multiplyTwoNumbers(int num1, int num2) {

        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;

    }

    @Override
    public String divideTwoNumbers(int num1, int num2) {

        float result = (float) num1 / num2;
        return num1 + " / " + num2 + " = " + result;

    }

}
