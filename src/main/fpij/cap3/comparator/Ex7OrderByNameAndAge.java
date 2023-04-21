package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ex7OrderByNameAndAge {


    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static Function<Person,String> byName = Person::getName;

    public static Function<Person, Integer> byAge = Person::getAge;

    public static void main(String args[]){
        System.out.println("Sorted in ascending order of age and name");
        people.stream()
                .sorted(Comparator.comparing(byAge).thenComparing(byName))
                .forEach(System.out::println);
    }
}
