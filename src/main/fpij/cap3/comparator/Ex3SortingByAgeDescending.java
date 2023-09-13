package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3SortingByAgeDescending {
    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    static Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
    static Comparator<Person>  compareDescending = compareAscending.reversed();

    public static void sortingListDescending(){
        List<Person> orderedPerson = people.
                stream()
                .sorted(compareDescending)
                .collect(Collectors.toList());
        System.out.printf("orderedPerson: " + orderedPerson);
    }

    public static void main(String[] args) {
        sortingListDescending();
    }

    public static void printPeople(String message, List<Person> people){
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
