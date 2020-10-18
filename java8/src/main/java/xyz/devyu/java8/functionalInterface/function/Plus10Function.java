package xyz.devyu.java8.functionalInterface.function;

import java.util.function.Function;

/**
 * {@link Function}
 * java에서 제공해주는 함수형 인터페이스를 구현한 구현체
 * <입력값, 리턴값>
 */
public class Plus10Function implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
