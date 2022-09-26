package com.example.calculatorservlet.models;

public class Calculator {
    public static float calculate(float firstOperaand, float secondOperand, char operator){
        switch (operator) {
            case '+':
                return firstOperaand + secondOperand;
            case '-':
                return firstOperaand - secondOperand;
            case '*':
                return firstOperaand * secondOperand;
            case '/':{
                if (secondOperand != 0)
                    return firstOperaand / secondOperand;
                else throw new RuntimeException("can't div 0");
            }
            default: throw new RuntimeException("invalid operation");
        }
    }
}
