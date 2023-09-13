package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8OlderThanSomeAge {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        List <Person> olderThan20 = people.stream()
                .filter(person -> person.getAge()> 20)
                .collect(Collectors.toList());
        System.out.printf("People older than 20: " + olderThan20 );
    }

}
