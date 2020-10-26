package xyz.devyu.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String[] args) {
        List<Depth3> depth3 = new ArrayList(Arrays.asList(new Depth3("피자", "10000"), new Depth3("햄버거", "3000")));
        List<Depth3> depth2 = Arrays.asList(new Depth3("전복죽", "20000"), new Depth3("만두", "4000"));
        List<Depth3> depth1 = Arrays.asList(new Depth3("짬뽕", "8000"), new Depth3("탕수육", "19000"), new Depth3("볶음밥", "8000"));

        List<List<Depth3>> all = Arrays.asList(depth1, depth2, depth3);

        System.out.println(all);
        List<Stream<Depth3>> map = all.stream().map(depth3s -> depth3s.stream()).collect(Collectors.toList());
        List<String> collect = all.stream().flatMap(depth3s -> depth3s.stream().map(depth31 -> depth31.price3)).collect(Collectors.toList());
        System.out.println(map);
        System.out.println(collect);
    }

    @Getter @Setter @AllArgsConstructor @ToString
    private static class Depth3 {
        private String menu3;
        private String price3;
    }

    @Getter @Setter @AllArgsConstructor @ToString
    private static class Depth2 {
        private String menu2;
        private String price2;
    }

    @Getter @Setter @AllArgsConstructor @ToString
    private static class Depth1 {
        private String menu1;
        private String price1;
    }
}
