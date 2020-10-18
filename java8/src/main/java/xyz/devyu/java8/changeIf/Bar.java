package xyz.devyu.java8.changeIf;

public interface Bar extends Foo{

    // 상속받은 Foo 인터페이스에서 printNameUpperCase() 메서드를 상속받고 싶지않으면 다시 해당 메서드를 정의해주면 됨.
    void printNameUpperCase();
}
