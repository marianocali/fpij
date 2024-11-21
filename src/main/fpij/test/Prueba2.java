package main.fpij.test;

import main.fpij.cap3.comparator.Person;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prueba2 {
    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static void main(String[] args) {
        people.stream()
                .sorted(Comparator.comparing(byAge).thenComparing(byName))
                .forEach(System.out::println);

        List<Person> greather = people.stream()
                .filter(person ->  isGretherThanY.test(person.getAge(), 30))
                .collect(Collectors.toList());
        System.out.println("greather: " + greather);

//        System.out.println(isGretherThan10.apply(14));
        System.out.println(isGretherThanY.test(9,10));

        ///promedio
        OptionalDouble average = people.stream()
                .mapToInt(person-> person.getAge())
                .average();
        System.out.println("average: " + (average.isPresent() ? average.getAsDouble() : 0));

        //get first elem that start with some letter
        Optional<Person> firstPerson = people.stream()
                .filter(person -> person.getName().startsWith("M"))
                .findFirst();
        System.out.println("firstPerson: " + (firstPerson.isPresent() ? firstPerson.get(): "No name found "));

        people.stream()
                .mapToInt(person-> person.getAge());
    }

    final static Function<Person, String> byName = person -> person.getName();
    final static Function<Person, Integer> byAge = person -> person.getAge();


    static Function<Integer, Integer> quadratic = x-> x*x;
    static Function<Integer, String> messageQuadratic = x-> "The quadratic of " + x + " is: " +  quadratic.apply(x);
    static Function<Integer, Boolean> isGretherThan10 = x -> x>10;
    static BiPredicate<Integer, Integer> isGretherThanY = (x, y) -> x>y;


}
