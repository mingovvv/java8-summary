package xyz.devyu.java8.methodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainReference {
    public static void main(String[] args) {
        // method reference 사용법

        // static method 참조
        UnaryOperator<String> static_Hi = Greeting::hi;

        // intance method 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> instance_Hi = greeting::hello;

        // default 생성자의 method 참조
        Supplier<Greeting> construct_Hi = Greeting::new;
        construct_Hi.get();

        // 매개변수를 받는 생성자의 method 참조
        Function<String, Greeting> construct_Hi_2 = Greeting::new;
        construct_Hi_2.apply("devyu");


    }
}
