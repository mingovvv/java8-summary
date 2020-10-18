package xyz.devyu.java8.functionalInterface.consumer;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class mainConsumerIF {
    public static void main(String[] args) {

        // ====================================================
        // Consumer 인터페이스(input 존재, output 미존재)
        // ====================================================

        Consumer<String> nameIf = s -> {
            if (s.equals("devyu")) {
                System.out.println("일치");
            } else {
                System.out.println("불일치");
            }
        };
        nameIf.accept("devyu");
    }
}

