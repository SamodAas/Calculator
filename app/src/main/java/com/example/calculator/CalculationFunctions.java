package com.example.calculator;

public class CalculationFunctions {


    public static float calculate(char operator, float first, float second) {
        float result=0;
        switch(operator){
            case '+':result=first+second; break;
            case '-':result=first-second; break;
            case '*':result=first*second; break;
            case '/':result=first/second; break;
        }
        return result;
    }
    public static float squareRoot(float a){
        float b = (float)Math.sqrt(a);
        return b;
    }
}
