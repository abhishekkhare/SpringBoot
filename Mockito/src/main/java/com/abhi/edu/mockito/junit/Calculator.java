package com.abhi.edu.mockito.junit;

public class Calculator implements CalculatorService {

    public double add(double input1, double input2) {
        return input1 + input2 + 10;
    }


    public double subtract(double input1, double input2) {
        return input1 - input2;
    }

    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    public double divide(double input1, double input2) {
        return input1 / input2;
    }
}
