package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3SortingByAgeDescending {
    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        List<Person> peopleSortedDesdending =
                people.stream()
                        .sorted((person1, person2)-> person2.ageDifference(person1))
                        .collect(Collectors.toList());
        printPeople("Sorted people descendig by age", peopleSortedDesdending);
    }

    public static void printPeople(String message, List<Person> people){
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
