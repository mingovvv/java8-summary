package xyz.devyu.java8.functionalInterface.biFunction;

import xyz.devyu.java8.functionalInterface.function.Plus10Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class mainBiFunctionIF {
    public static void main(String[] args) {

        // ====================================================
        // BiFunctional 인터페이스
        // ====================================================

        BiFunction<Integer, Integer, Integer> biFunction = (integer, integer2) -> integer + integer2;
        System.out.println(biFunction.apply(10,20));

        BiFunction<Integer, Integer, Integer> biFunction2 = (integer, integer2) -> {
            return (integer * 10) + (integer2 * 20);
        };
        System.out.println(biFunction.apply(10, 20));
    }
}

