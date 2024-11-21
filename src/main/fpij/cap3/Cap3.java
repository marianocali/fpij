package main.fpijPrueba3.java.cap3;

import main.fpij.cap3.comparator.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cap3 {

    final static List<Person> people = Arrays.asList(
            new Person("Zoe", 45),
            new Person("Alice", 15),
            new Person("Jane", 29),
            new Person("Scott", 35),
            new Person("Greg", 37));
//            new Person("Mariano", 45));


    static Function<Integer, String> verboseLambda = (Integer x)-> { return Integer.toString(x*x); };

    static Function<Integer, String> conciseLambda = (Integer x)-> { return Integer.toString(x*x); };

    public static void sortPeople(){
        List<Person> sortedPeople = people.stream()
                .sorted((person1,person2)->person1.ageDifference(person2))
                .collect(Collectors.toList());
        System.out.println("people sorted by age " + sortedPeople);
    }

    public static void sortPeopleMethodReference(){
        List<Person> sortedPeople = people.stream()
                .sorted(Person::ageDifference)
                .collect(Collectors.toList());
        System.out.println("people sorted by age " + sortedPeople);
    }

    public static void youngestPerson(){
        people.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("youngest " + youngest));
    }

    public static void sortByName() {
        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(person -> System.out.println(person));
    }

    public static void sortingByNameAndAge(){
        List<Person> sortedPerson =
                people.stream()
                        .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                        .collect(Collectors.toList());
        sortedPerson.forEach(System.out::println);
    }

    public static void printBySubList(){

        int min = 0;
        int max = 2;
        int incremento = 2;
        while(max <= people.size()){
            min = max;
            max = max + incremento;
        }
        if(max > people.size()){
            people.subList(min,people.size()).forEach(System.out::println);
        }

    }



    public static void main(String[] args) {

        printBySubList();
//        youngestPerson();
//        sortPeople();
//        sortPeopleMethodReference();
//        System.out.println(verboseLambda.apply(5));

//        Person steveOrLonger =
//                people.stream()
//                        .reduce(new Person("Steve", 5), (person1, person2) ->
//
//                                person1.getName().length() >= person2.getName().length() ? person1 : person2);
//        System.out.printf("steveOrLonger: " + steveOrLonger);
//        sortByName();
//        sortingByNameAndAge();
    }
}
