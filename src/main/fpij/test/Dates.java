package main.fpij.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dates {


    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println(LocalDate.of(2022, 11, 12));

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("previousMonthSameDay: " + previousMonthSameDay);

        LocalDate nextMonthSameDay = LocalDate.now().plusMonths(1);
        System.out.println("nextMonthSameDay: " + nextMonthSameDay);



    }

}
