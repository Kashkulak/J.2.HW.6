package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Умножение цифр: 16 и 4 - "+new Calculator<Long>().multiplication(16L,4L));
        System.out.println("Деление цифр: 16 и 4 - "+new Calculator<Integer>().division(16,4));
        System.out.println("Вычитание цифр: 16 и 4 - "+new Calculator<Integer>().subtraction(16,4));
        System.out.println("Сложение цифр: 16 и 4 - "+new Calculator<Integer>().addition(16,4));


    }
}
