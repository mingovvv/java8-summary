package xyz.devyu.java8.changeIf;

public interface Foo {
    void printName();

//    void printNameUpperCase();

    // Java 8 이후 : 인터페이스에 메소드 선언이 아니라 구현체를 제공하는 방법

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    static void printAnything() {
        System.out.println("FOO STATIC");
    }
}
