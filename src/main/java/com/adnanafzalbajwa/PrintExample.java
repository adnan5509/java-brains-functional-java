package com.adnanafzalbajwa;

import LambdaExerciseInterfaces.PrintTask;

import java.time.LocalDateTime;

public class PrintExample {

    public static void runner(PrintTask printTask) {
        System.out.println("Start: " + LocalDateTime.now());
        printTask.print();
        System.out.println("End: " + LocalDateTime.now());

    }

    public static void main(String[] args) {

        System.out.println("PrintExample");
        runner(() -> System.out.println("Adnan"));
        runner(() -> System.out.println("Kamran"));



    }
}