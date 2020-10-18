package xyz.devyu.java8.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class MainLambda {
    public static void main(String[] args) {

        // 'Supplier' 함수 인터페이스 : 매개변수가 없고 리턴값이 존재

        // BODY가 존재할 경우(생략 불가)
        Supplier<Integer> get1 = () -> {
            System.out.println("바디 한 줄");
            System.out.println("바디 두 줄");
            System.out.println("바디 세 줄");
            return 3;
        };

        // BODY가 존재하지 않을 경우(생략 가능)
        Supplier<Integer> get2 = () -> 3;


        MainLambda test = new MainLambda();
        test.run();


    }

    private void run() {
        // 로컬클래스, 익명클래스 또는 람다에서 로컬변수를 참조할 경우, 로컬변수가 '캡쳐'가 된다.
        // 자바8 이전에는 항상 final 키워드가 붙어있어야 했다.
        int baseNumber = 10;

        // '로컬클래스'
        // 쉐도잉 가능 : 상위 클래스의 변수가 가려지는 현상, 로컬클래스는 하나의 scope로서 인정받음
        class localClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // '익명클래스'
        // 쉐도잉 가능 : 상위 클래스의 변수가 가려지는 현상, 익명클래스는 하나의 scope로서 인정받음
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        // '람다'
        // 쉐도잉 불가 : 'int baseNumber = 10;' 와 같은 scope 취급
        IntConsumer intConsumer = i -> {
            System.out.println(i + baseNumber);
        };
        intConsumer.accept(10);
    }
}
