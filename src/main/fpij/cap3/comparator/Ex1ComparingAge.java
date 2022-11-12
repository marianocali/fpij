package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1ComparingAge {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        List<Person> ascendingAge =
                people.stream()
                        .sorted((person1, person2) -> person1.ageDifference(person2))
                        .collect(Collectors.toList());
        printPeople("Sorted in ascending order of age", ascendingAge);
    }

    // sort elements using Comparator interface and comparingInt method
    public static void sortByAge(){
        List<Person> ascendingAge =
                people.stream()
                        .sorted(Comparator.comparingInt(Person::getAge))
                        .collect(Collectors.toList());
        printPeople("Sorted in ascending order of age", ascendingAge);

    }

    public static void printPeople(final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }

}
