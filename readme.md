# Java8 핵심 문법 정리
--

### 함수형 인터페이스와 람다 표현식이란?

- 함수형 인터페이스(Functional Interface) ?
    - 추상 메서드를 하나만 가지고 있는 인터페이스를 의미한다.
    - `@FunctionalInterface` 애노테이션을 통해 추상메서드가 하나임을 검증할 수 있음
    
- 람다 표현식(Lambda Expressions)
    - 함수형 인터페이스의 인스턴스를 만드는 함수형 프로그래밍
    - 코드를 줄일 수 있음
    - 메서드의 매개변수, 리턴 타입, 변수로 만들어 사용할 수 있음
    - 함수 밖의 변수를 변경하지 않아야 함
    - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수 있음
    
- Java가 기본적으로 제공하는 함수형 인터페이스
    - java.util.funcation 패키지
    - 자주 사용되는 인터페이스
        1. Function<T, R>
            - 입력값 O, 리턴값 O
            - T 타입을 받고 R 타입을 리턴
            - 함수 조합 메서드 : andThen(매개변수 후행), compose(매개변수 선행)
        2. BiFunction<T, U, R>
            - 입력값 O, 리턴값 O
            - T, U 타입을 받고 R 타입을 리턴
        3. Consumer<T>
            - 입력값 O, 리턴값 X
            - T 타입을 받아서 리턴 값이 없는 함수 인터페이스
        4. Supplier<T>
            - 입력값 X, 리턴값 O
            - T 타입을 제공하는 함수 인터페이스
        5. Predicate<T>
            - 입력값 O, 리턴값 boolean
            - T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
        6. UnaryOperator<T>
            - 입력값 O, 리턴값 O
            - Function<T, R>의 특수한 형태로 입력과 출력 모두 하나의 타입을 받을 경우 사용 가능한 함수 인터페이스
        7. BinaryOperator<T>
            - 입력값 O, 리턴값 O
            - BiFunction<T, U, R>의 특수한 형태로 입력과 출력 모두 하나의 타입을 받을 경우 사용 가능한 함수 인터페이스

### 람다 표현식
- `(인자) -> {바디}` 형식
- 표현 방식(인자) 
    - 인자의 개수 : 0
        - ()
    - 인자의 개수 : 1
        - (num) or num   
    - 인자의 개수 : 다수
        - (num1, num2, num3)
    - 인자의 타입은 생략이 가능(명시할 수 있음)
- 표현 방식(바디)
    - 화살표 오른쪽에 함수의 본문을 정의
    - 여러 줄인 경우 `{}` 를 사용해서 묶을 수 있음
    - 한 줄인 경우 생략 가능, `return`도 생략 가능
 
 - 변수 캡쳐(Variable Capture)
    - 로컬 변수 캡쳐
        - final이거나 Effective final인 경우에만 참조가능
        - 그 외의 상황은 컴파일러가 error 표시
    - Effective final
        - 자바8 부터 지원하는 기능
        - 사실상 final
    - 익명클래스, 내부클래스와는 다르게 쉐도잉을 지원하지 않음
        - 람다의 `scope`는 람다를 사용한 클래스와 동일하기 때문
        - 익명클래스와, 내부클래스는 inner `scope`가 생성

### Stream
- 데이터를 담고 있는 저장소의 개념이 아닌 하나의 흐름의 개념으로 접근
- 스트림으로 처리하는 데이터 소스는 변경되지 않음
- 중개 오퍼레이션은 Lazy한 특징을 지님(완료 오퍼레이션이 실행될 때 까지 동작하지 않는다.)
- 손쉬운 병렬처리 가능
- 다수의 중개 오퍼레이션 + 한 개의 종료 오퍼레이션
- 중개 오퍼레이션
    - Stream을 리턴
    - filter, map, limit, skip, sorted ...
- 종료 오퍼레이션
    - Stream을 리턴하지 않음
    - collect, allMatch, cout, forEach, min, max ...
    
### Optional
- NPE을 효율적으로 처리하기 위한 방법
- 리턴값으로 사용하는 것을 권장
- primitive type일 경우 OptionalInt, OptionalLong 등을 사용할 것(기본 Optional을 사용시 Boxing, Unboxing이 발생)
- Collection, Map, Stream Array는 기본적으로 Null을 처리할 수 있는 메서드가 존재하기 때문에 Optional을 사용할 필요가 없음