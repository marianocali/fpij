package main.fpij.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Dates {


    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println(LocalDate.of(2022, 11, 12));

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("previousMonthSameDay: " + previousMonthSameDay);

        LocalDate nextMonthSameDay = LocalDate.now().plusMonths(1);
        System.out.println("nextMonthSameDay: " + nextMonthSameDay);

        boolean isBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("isBefore: " + isBefore);

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));

        System.out.println("isAfter: " + isAfter);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("beginningOfDay: " + beginningOfDay);
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth: " +  firstDayOfMonth);

        LocalTime now = LocalTime.now();
        System.out.println("now: " + now);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("sixThirty: " + sixThirty);

        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("isbefore: " + isbefore);

        LocalDateTime lct= LocalDateTime.now();
        System.out.println("localDateTime now : " + lct);
    }

}
