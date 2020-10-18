package xyz.devyu.java8.functionalInterface.predicate;

import xyz.devyu.java8.functionalInterface.function.Plus10Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class mainPredicateIF {
    public static void main(String[] args) {

        // ====================================================
        // Predicate 인터페이스(입력값 O, 출력값 boolean)
        // ====================================================

        Predicate<String> isMan = s -> s.equals("yes") ? true : false;
        System.out.println(isMan.test("yes"));
        System.out.println(isMan.negate().test("yes"));
    }
}

