package com.adnanafzalbajwa;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JDKFunctionalInterfacesExample {

    public static void main(String[] args) {

//        Function
        Function<String, String> myName = name -> "My Name is " + name;
        Function<Integer, String> myAge = age -> "My age is " + age;

        System.out.println(myName.apply("Adnan Afzal Bajwa"));
        System.out.println(myAge.apply(31));

//        Consumer
        Consumer<Integer> twoMultiply = x -> System.out.println(x + " multiply 2 is " + x * 2);
        Consumer<Double> balance = bal -> System.out.println("Your balance is " + bal);

        twoMultiply.accept(16);
        balance.accept(1800.9);

//        Supplier
        Supplier<String> goodMsg = () -> "Today is a Good Day";
        Supplier<LocalDate> birthDay = () -> LocalDate.of(1993, Month.MAY, 8);
        Supplier<Double> randomInt = () -> Math.random();

        System.out.println(goodMsg.get());
        System.out.println(birthDay.get());
        System.out.println(randomInt.get());

//        Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> ageCheck = age -> {
            Period period = Period.between(LocalDate.of(1993, Month.MAY, 8), LocalDate.now());
            return age == period.getYears();
        };

        System.out.println(isEven.test(18));
        System.out.println(isEven.test(13));
        System.out.println(ageCheck.test(25));
        System.out.println(ageCheck.test(31));
    }


}
