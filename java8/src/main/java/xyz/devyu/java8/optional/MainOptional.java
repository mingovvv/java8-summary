package xyz.devyu.java8.optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
//        Duration duration = spring_boot.getProgress().getDuration();
//        System.out.println(duration); // NPE 발생, 래퍼런스 타입은 기본값이 Null

        Optional<OnlineClass> onlineClass;
//        Optional.of() -> Null 허용 X -> NPE 발생
//        Optional.ofNullable() -> Null 허용

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        System.out.println(spring.isPresent());
        System.out.println(spring.get()); // 값이 없을 경우, RUNTIME EXCEPTION

        // IF + get()
        spring.ifPresent(oc -> {
            System.out.println(oc.getTitle());
        });

        // 무조건 createNewClass 실행함
        // 상수를 사용할때
        OnlineClass onlineClass1 = spring.orElse(createNewClass());
        System.out.println(onlineClass1);

        // 존재하지 않는 경우에만 createNewClass 실행함
        // 동적으로 생성할때
        spring.orElseGet(MainOptional::createNewClass);

        spring.orElseThrow(IllegalStateException::new);
    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10, "new class", false);
    }
}
