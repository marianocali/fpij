package main.fpij.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test5IndexCreation {

    private static final String ALARMS_DEFAULT_INDEX = "alarm";
    private static final DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MMyyyy");

    protected static String getIndex(String indexPrefix, LocalDate date) {
        return indexPrefix + "_" + monthYearFormatter.format(date);
    }

    protected static Collection<String> getIndexesAfterSomeDate(String indexPrefix, ZonedDateTime after) {
        if (after == null)
            return new HashSet<>(Arrays.asList(indexPrefix));

        Set<String> indexes = new HashSet<>();
        ZonedDateTime it = after;
        Instant instant = Instant.now();
        ZonedDateTime now = instant.atZone(ZoneId.of("UTC"));

        do {
            indexes.add(getIndex(indexPrefix, it.toLocalDate()));
            it = it.plusMonths(1);
        } while (it.isBefore(now) || (it.getMonth().compareTo(now.getMonth()) == 0 && it.getYear() == now.getYear()));

        return indexes;
    }

    public static void main(String[] args) {
//        Instant ahora = Instant.now();
//        Instant instant = ahora.minus( 7L, ChronoUnit.MONTHS);
//        ZonedDateTime after = instant.atZone(ZoneId.of("UTC"));
//        ZonedDateTime after = instant.atZone(ZoneId.of("UTC")).minus( 7L, ChronoUnit.MONTHS);
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime sevenMonthsAgo = now.minus(7, ChronoUnit.MONTHS);

        Collection<String> indices = getIndexesAfterSomeDate(ALARMS_DEFAULT_INDEX, sevenMonthsAgo);

        System.out.println("indices: " + indices);
    }


}
