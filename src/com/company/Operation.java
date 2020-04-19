package com.company;

interface Operation <T extends Number> {
    int addition(T number1, T number2);
    float subtraction(T number1, T number2);
    double division(T number1, T number2);
    long multiplication(T number1, T number2);

}
