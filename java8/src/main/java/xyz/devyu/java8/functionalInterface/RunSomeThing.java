package xyz.devyu.java8.functionalInterface;

@FunctionalInterface // 애노테이션을 통해 해당 인터페이스가 추상메서드 하나인 함수형 인터페이스라는 것을 검증 받을 수 있음.
public interface RunSomeThing {

    // 추상메서드가 하나면 함수형 인터페이스
    void doIt();

    /**
     *  @FunctionalInterface의 기능을 통해 추상메서드가 2개 이상 존재할 수 없음.
     */
//    void doTi2();

    // 자바8 부터 'static' 키워드와 함께, 인터페이스 내부에서 코드를 구현할 수 있음
    static void printName() {
        System.out.println("STATIC");
    }
}
