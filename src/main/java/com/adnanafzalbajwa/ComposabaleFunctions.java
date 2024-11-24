package com.adnanafzalbajwa;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComposabaleFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 1;

        int num = 10;

        Function<Integer, Integer> combinedOperations = increment.andThen(doubleIt);
        int processedNumber = combinedOperations.apply(num);

        System.out.println(processedNumber);

//        Another Example of trimming and upperCasing a String

        String myName = "   Adnan  ";

        UnaryOperator<String> trimSpaces = String::trim;
        UnaryOperator<String> upperCasing = String::toUpperCase;

        String processedName = trimSpaces.andThen(upperCasing).apply(myName);
        System.out.println(processedName);

    }
}
