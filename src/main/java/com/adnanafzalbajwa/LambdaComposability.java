package com.adnanafzalbajwa;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaComposability {


    public static void main(String[] args) {

        Consumer<String> loggerTime = s -> System.out.println(s + ": " + LocalDateTime.now());

        BiConsumer<UnaryOperator<Integer>, Integer> operationLogger = (operation, number) -> {
            loggerTime.accept("Start");
            System.out.println(operation.apply(number));
            loggerTime.accept("End");
        };


        operationLogger.accept(x -> x + 1, 10);
        operationLogger.accept(x -> x * 2, 100);


    }
}
