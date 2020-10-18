package xyz.devyu.java8.functionalInterface.function;

import java.util.function.Function;

public class mainFunctionIF {
    public static void main(String[] args) {

        // 람다 사용 X(인터페이스 구현 필수)
        Plus10Function plus10Function = new Plus10Function();
        System.out.println(plus10Function.apply(1));

        // 람다 사용 O(인터페이스 구현 필요 없음)
        Function<Integer, Integer> plus10FuinctionLambda = integer -> integer + 10;
        System.out.println(plus10FuinctionLambda.apply(1));

        Function<Integer, Integer> multiply2FuinctionLambda = integer -> integer * 2;

        // ====================================================
        // Functional 인터페이스
        // ====================================================

        // 함수 조합
        // 'compose' 메서드 : 매개변수 먼저 선행함(x2 -> +10)
        Function<Integer, Integer> multiply2AndPlus10 = plus10FuinctionLambda.compose(multiply2FuinctionLambda);
        System.out.println(multiply2AndPlus10.apply(10));

        // 'andThen' 메서드 : 매개변수 나중에 후행함(+10 -> x2)
        Function<Integer, Integer> plus10AndMultiply2 = plus10FuinctionLambda.andThen(multiply2FuinctionLambda);
        System.out.println(plus10AndMultiply2.apply(10));

        // 줄여쓰기
        System.out.println(plus10FuinctionLambda.andThen(multiply2FuinctionLambda).apply(10));
    }
}

