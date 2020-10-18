package xyz.devyu.java8.functionalInterface.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class mainSupplierIF {
    public static void main(String[] args) {

        // ====================================================
        // Supplier 인터페이스(input 미존재, output 존재)
        // ====================================================

        Supplier<String> now = () -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss"));
        System.out.println(now.get());
    }
}

