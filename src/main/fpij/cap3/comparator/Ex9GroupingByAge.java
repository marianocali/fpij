package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex9GroupingByAge {
    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        Map<Integer, List<Person>> personByAge =
                people.stream()
                        .collect(Collectors.groupingBy(Person::getAge));
        System.out.printf("People grouped by age: " + personByAge);

        personByAge.forEach((k,v) ->
                System.out.println("key:" + k + " value: " + v));

    }
}
