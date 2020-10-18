package xyz.devyu.java8.functionalInterface;

public class Foo {
    public static void main(String[] args) {

        // 자바 8 이전
        RunSomeThing runSomeThing = new RunSomeThing() {
            @Override
            public void doIt() {
                System.out.println("익명 내부 클래스, anonymous inner class, [Java8 이전]");
            }
        };

        runSomeThing.doIt();

        // 자바 8 이후(Lambda Expressions)
        RunSomeThing runSomeThingForJava8 = () -> System.out.println("익명 내부 클래스, anonymous inner class, [Java8 이후]");

        runSomeThingForJava8.doIt();

        // ========================================================
        // ========================================================
        // ========================================================

        RunSomeThing2 runSomeThing2 = num -> num + 10;

        // 결과값이 동일해야 한다.
        System.out.println(runSomeThing2.doIt(1));
        System.out.println(runSomeThing2.doIt(1));
        System.out.println(runSomeThing2.doIt(1));

        // final의 의미를 가지고 있는 변수, 불변해야 함
        int number = 10;
        RunSomeThing2 someThing3 = num -> {
            return num + number;
        };

        System.out.println(someThing3.doIt(1));
        System.out.println(someThing3.doIt(1));
        System.out.println(someThing3.doIt(1));




    }
}
