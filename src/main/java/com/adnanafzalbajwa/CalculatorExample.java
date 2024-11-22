package com.adnanafzalbajwa;


import LambdaExerciseInterfaces.IntOperation;

public class CalculatorExample {

    public static void main(String[] args) {

        System.out.println("CalculatorExample");

        IntOperation add = (a, b) -> a + b;
        IntOperation subtract = (a, b) -> a - b;
        IntOperation multiply = (a, b) -> a * b;
        IntOperation divide = (a, b) -> a / b;

        System.out.println("Add:" + doMath(add, 10, 2));
        System.out.println("Subtract:" + doMath(subtract, 10, 2));
        System.out.println("Multiply:" + doMath(multiply, 10, 2));
        System.out.println("Divide:" + doMath(divide, 10, 2));


    }

    public static int doMath(IntOperation operation, int x, int y) {
        return operation.doOperation(x, y);
    }
}
