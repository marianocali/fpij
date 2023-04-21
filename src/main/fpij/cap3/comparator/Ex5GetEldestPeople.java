package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.List;

public class Ex5GetEldestPeople {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        people.stream()
                .max(Person::ageDifference)
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
    }
}
