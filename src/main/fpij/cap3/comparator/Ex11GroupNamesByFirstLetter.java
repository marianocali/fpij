package main.fpij.cap3.comparator;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Ex11GroupNamesByFirstLetter {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));


    // Group Names by first letter and then get the older

    public static void groupNamesByFirstLetter() {
        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonInEachAplphabet =
                people.stream()
                        .collect(Collectors.groupingBy(person -> person.getName().charAt(0),
                                Collectors.reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person in each alphabet: ");
        System.out.println(oldestPersonInEachAplphabet);
    }

    public static void main(String[] args){
        groupNamesByFirstLetter();
    }

}
