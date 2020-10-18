package xyz.devyu.java8.changeIf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class MainApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("mingyu");
        names.add("devyu");
        names.add("puregyu");

        // 기본
        names.forEach(s -> {
            System.out.println(s);
        });

        // method reference
        names.forEach(System.out::println);

        Spliterator<String> spliterator = names.spliterator();
        while (spliterator.tryAdvance(System.out::println));

        names.removeIf(s -> s.startsWith("d"));
        names.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        System.out.println(names);
    }
}
