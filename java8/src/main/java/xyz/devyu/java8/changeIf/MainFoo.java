package xyz.devyu.java8.changeIf;

public class MainFoo {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo("devyu");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
