package xyz.devyu.java8.changeIf;

public class DefaultFoo implements Foo{

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    // default interface를 재정의할 수 있음
    @Override
    public void printNameUpperCase() {
        System.out.println("[" + this.name.toUpperCase() + "]");
    }
}
