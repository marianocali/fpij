package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ex6OrderByName {    final static List<Person> people = Arrays.asList(
        new Person("John", 20),
        new Person("Sara", 21),
        new Person("Jane", 21),
        new Person("Greg", 35));

    public static void main(String[] args) {
        people.stream()
                .sorted(Comparator.comparing(byName))
                .forEach(System.out::println);
    }

    final static Function<Person, String> byName = person -> person.getName();
}
