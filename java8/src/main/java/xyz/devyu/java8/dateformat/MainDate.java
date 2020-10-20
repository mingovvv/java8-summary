package xyz.devyu.java8.dateformat;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainDate {
    public static void main(String[] args) {
        // 기준시 UTC, GMT
        Instant instant = Instant.now();
        System.out.println(instant);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        System.out.println(zonedDateTime);

        System.out.println("=======================");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birtyDay = LocalDateTime.of(1990, Month.AUGUST, 9, 0, 0);
        System.out.println(birtyDay);

        System.out.println("=======================");

        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2020, 12, 25);
        Period between = Period.between(today, christmas);
        System.out.println(between.getDays());

        System.out.println("=======================");

        Instant now2 = Instant.now();
        Instant plus = now2.plus(10, ChronoUnit.SECONDS);
        Duration between1 = Duration.between(now2, plus);
        System.out.println(between1.getSeconds());

        System.out.println("=======================");

        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now3.format(dateTimeFormatter));

        System.out.println("=======================");

        LocalDate parse = LocalDate.parse("10/20/2020", dateTimeFormatter);
        System.out.println(parse);
    }
}
