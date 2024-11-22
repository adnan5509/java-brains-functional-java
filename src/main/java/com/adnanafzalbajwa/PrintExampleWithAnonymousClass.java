package com.adnanafzalbajwa;

import LambdaExerciseInterfaces.PrintTask;

import java.time.LocalDateTime;

public class PrintExampleWithAnonymousClass {


    public static void runner(PrintTask printTask) {
        System.out.println("Start: " + LocalDateTime.now());
        printTask.print();
        System.out.println("End: " + LocalDateTime.now());

    }

    public static void main(String[] args) {

        System.out.println("PrintExampleWithAnonymousClass");
        runner(new PrintTask() {
            @Override
            public void print() {
                System.out.println("Adnan");
            }
        });
        runner(new PrintTask() {
            @Override
            public void print() {
                System.out.println("Kamran");
            }
        });


    }

}
