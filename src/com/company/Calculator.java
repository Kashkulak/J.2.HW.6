package com.company;

public class Calculator <T extends Number> implements Operation<T> {

    @Override
    public int addition(T number1, T number2) {
        return (int) (number1.doubleValue()+number2.doubleValue());
    }

    @Override
    public float subtraction(T number1, T number2) {
        return (float) (number1.doubleValue()-number2.doubleValue());
    }

    @Override
    public double division(T number1, T number2) {
        return (number1.doubleValue()/number2.doubleValue());
    }

    @Override
    public long multiplication(T number1, T number2) {
        return (long) (number1.doubleValue()*number2.doubleValue());
    }
}
